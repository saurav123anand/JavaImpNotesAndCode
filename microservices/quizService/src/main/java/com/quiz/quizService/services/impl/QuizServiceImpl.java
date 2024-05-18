package com.quiz.quizService.services.impl;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.repositories.QuizRepository;
import com.quiz.quizService.services.QuestionClient;
import com.quiz.quizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@EnableFeignClients
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        List<Quiz> quizzes = quizRepository.findAll();
        List<Quiz> newQuiList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestions(quiz.getQuizId()));
            return quiz;
        }).collect(Collectors.toList());

        return newQuiList;
    }

    @Override
    public Quiz get(Long quizId) {
        Quiz quiz = quizRepository.findById(quizId).orElseThrow(() -> new RuntimeException("quiz not found for quizId " + quizId));
        quiz.setQuestions(questionClient.getQuestions(quiz.getQuizId()));
        return quiz;
    }
}
