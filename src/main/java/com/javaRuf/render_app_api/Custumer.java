package com.javaRuf.render_app_api;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class Custumer {

    private Long customerId;  // Corrigé le nom du champ
    private String firstName; // Corrigé la faute dans le nom de "firstName"
    private String lastName;
    private String email;


    public Custumer(Long customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters et Setters
    @JsonProperty("customerId") // Annonce à Jackson comment nommer ce champ dans le JSON
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
