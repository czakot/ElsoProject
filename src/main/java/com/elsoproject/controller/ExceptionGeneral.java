package com.elsoproject.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ExceptionGeneral {
  
  @ExceptionHandler(Exception.class)
  public String exception(Exception ex, Model model) {
    System.out.println("Exception Handler of ExceptionGeneral");
    model.addAttribute("exception", ex);
    return "generalError";
  }
}
