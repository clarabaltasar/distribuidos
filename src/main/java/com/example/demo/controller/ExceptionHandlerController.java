package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerController {

    private final String TEMPLATE_404 = "404";

    @ExceptionHandler(ItemNotFoundException.class)
    public ModelAndView itemNotFoundExceptionHandler(Exception ex){
        ModelAndView model = new ModelAndView();
        model.addObject("exception", ex);
        model.setViewName(TEMPLATE_404);
        return model;
    }
}
