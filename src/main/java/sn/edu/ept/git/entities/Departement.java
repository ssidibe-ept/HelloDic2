package sn.edu.ept.git.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
//@Table(name = "classe")
public class Departement {
  @Id
  @Column(length = 15)
  private String code; //on ne peut pas le modifier donc on peut mettre id: Integer, code: unique plus sûr

  @Column(unique = true, nullable = false)
  private String nom;

  @OneToMany(mappedBy = "departement")
  private List<Filiere> filieres;
}