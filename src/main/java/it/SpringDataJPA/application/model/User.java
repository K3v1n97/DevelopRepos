package it.SpringDataJPA.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthday;

    public User(String email, String password, String firstName, String lastName, String birthday) throws ParseException {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.birthday = dateFormat.parse(birthday);
    }

    public User() {

    }
}
