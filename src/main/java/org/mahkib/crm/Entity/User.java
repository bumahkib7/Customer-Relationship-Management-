package org.mahkib.crm.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity(name = "users")// This tells Hibernate to make a table out of this class
@Data                // This tells Hibernate to generate getters and setters
@Builder         // This tells Hibernate to generate builder to create an object from this class
@NoArgsConstructor       // This tells Hibernate to generate a no-arg constructor for this class
@AllArgsConstructor                 // This tells Hibernate to generate an all-arg constructor for this class
public class User {


    @Id                                                                   // This tells Hibernate to use the id column as the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)                      // This tells Hibernate to generate the id column automatically
    private Long id;



    @Column(nullable = false, unique = true)                            // These tells Hibernate to name the column username
    private String username;



    @Column(nullable = false)                                          // This will tell Hibernate to name the column email
    @Email(message = "Please provide a valid")                        // This will tell Hibernate to validate the email column to make sure it is a valid email
    @NotEmpty                                                        // This will tell Hibernate to validate the email column to make sure it is not empty
    private String email;


    private String password;


    private String firstName;


    private String lastName;

    private int enabled;

                                                   // These tells Hibernate to create a foreign key column called customer_id  in the database
    @ManyToOne
    @JoinColumn(name = "role_role_id")
    private Roles role;
}
