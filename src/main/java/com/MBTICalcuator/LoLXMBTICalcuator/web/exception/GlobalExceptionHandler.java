package com.MBTICalcuator.LoLXMBTICalcuator.web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handleNotFound(NoHandlerFoundException e) {
        ModelAndView modelAndView = new ModelAndView("error/400.html");
        modelAndView.addObject("msg", e.getMessage());
        return modelAndView;
    }

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handleRuneTimeException(RuntimeException e) {
        ModelAndView modelAndView = new ModelAndView("error/400.html");
        modelAndView.addObject("msg", e.getMessage());
        return modelAndView;
    }
}
