package com.javaRuf.render_app_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1-api-custumers")
public class CustmerController {

    // Liste statique de clients pour la démonstration
    private static final List<Custumer> CUSTOMERS = List.of(
            new Custumer(1L, "John", "Doe", "email1@example.com"),
            new Custumer(2L, "Jane", "Smith", "email2@example.com"),
            new Custumer(3L, "Jack", "Johnson", "email3@example.com"),
            new Custumer(4L, "Jill", "Brown", "email4@example.com"),
            new Custumer(5L, "Joe", "Davis", "email5@example.com")
    );

    // Méthode pour récupérer tous les clients
    @GetMapping
    public List<Custumer> findAllCustomers() {
        return CUSTOMERS;
    }
}
