package com.quiz.quizService.services;

import com.quiz.quizService.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> getAll();
    Quiz get(Long quizId);
}
