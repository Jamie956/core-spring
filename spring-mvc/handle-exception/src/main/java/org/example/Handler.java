package org.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Handler {
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticExceptionHandler(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }
}
