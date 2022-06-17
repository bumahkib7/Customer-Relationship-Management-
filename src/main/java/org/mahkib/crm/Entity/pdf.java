package org.mahkib.crm.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class pdf {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = true) // this tells hibernate to not create a column for this field
    @Size(min = 1, max = 100) // this tells hibernate to validate the field to make sure it is between 1 and 100 characters long
    private String name;

    @Transient   //hibernate will not create a column for this field
    private String content;

}
