package ca.gbc.comp3095.team11.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
}
