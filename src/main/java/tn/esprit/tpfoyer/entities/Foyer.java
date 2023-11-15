package tn.esprit.tpfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {
    @Id
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToMany(cascade = CascadeType.ALL , mappedBy ="foyer")
    private List<Bloc>  idBloc;
    @OneToOne(cascade = CascadeType.ALL , mappedBy ="foyer")
    @JsonIgnore
    private  Universite univ;

}
