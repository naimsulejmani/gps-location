package dev.naimsulejmani.gpslocation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role { //roles
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Candidate key
    @Column(unique = true)
    private String name;

    private String description;
}






