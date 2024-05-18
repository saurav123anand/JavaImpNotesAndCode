package com.quiz.quizService.controllers;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService service;

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return service.add(quiz);
    }
    @GetMapping
    public List<Quiz> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        return service.get(id);
    }




}
