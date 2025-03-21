package com.javaRuf.render_app_api;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleError(Exception e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error"; // Retourne une page d'erreur (tu peux créer une vue error.html si tu utilises Thymeleaf)
    }
}
