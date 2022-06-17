package org.mahkib.crm.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = " roles")

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role", nullable = true)
    private String name;


}


