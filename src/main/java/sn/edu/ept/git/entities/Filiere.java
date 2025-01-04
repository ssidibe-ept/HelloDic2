package sn.edu.ept.git.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

public class Filiere {
    @Id
    private String code;

    @Column(unique = true, nullable = false)
    private String nom;

    @ManyToMany
    @JoinColumn(name = "DEPARTEMENT")
    private Departement departement;
}
