package org.mahkib.crm.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;


@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true) // this tells hibernate to not create a column for this field
    @Size(min = 2) //hibernate will validate the field to make sure it is between 2 and 100 characters long
    private String name;

    @Column(name = "email", nullable = false, unique = true) // this tells hibernate to name the column email
    @Email(message = "Please provide a valid")
    // this tells hibernate to validate the email column to make sure it is a valid email
    @NotEmpty // this tells hibernate to validate the email column to make sure it is not empty
    private String email;

    @Digits(integer = 0, fraction = 15) // this tells hibernate to validate the email column to make sure
    private int phone;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "customer_category",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;

    private String firstName;

    private String lastName;

    private String city;

    private String address;

    private int enabled;

}
