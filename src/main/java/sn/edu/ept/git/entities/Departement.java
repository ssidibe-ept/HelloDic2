package sn.edu.ept.git.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Departement {
    @Id
    @Column(length = 15)
    private String code;

    @Column(unique = true, nullable = false)
    private String nom;

    @OneToMany(mappedBy = "departement")
    private List<Filiere> filiere;
}
