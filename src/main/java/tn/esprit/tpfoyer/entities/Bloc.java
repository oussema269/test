package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc implements Serializable {
    @Id
    @GeneratedValue
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "bloc")
    private List<Chambre> chambreList;
    @ManyToOne(cascade = CascadeType.ALL)
    private  Foyer foyer;
}
