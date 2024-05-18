package com.question.QuestionService.services;


import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {
    Question create(Question question);
    List<Question> getAll();
    Question get(Long quesId);
    List<Question> getQuestionsOfQuiz(Long quizId);
}
