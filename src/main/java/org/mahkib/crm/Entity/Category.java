package org.mahkib.crm.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String created_at;
    private String updated_at;
}
