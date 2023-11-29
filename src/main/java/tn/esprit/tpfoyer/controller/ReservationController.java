package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.BlocServiceImp;
import tn.esprit.tpfoyer.services.ReservationServiceImp;

import java.util.List;
@RestController
@RequestMapping("/Reservation")

public class ReservationController {
    @Autowired
    ReservationServiceImp reservationServiceImp;
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation b){
        return reservationServiceImp.addReservation(b);
    }
    @GetMapping("/getReservation")
    public List<Reservation> getReservations(){
        return reservationServiceImp.retrieveAllReservation();
    }
    @DeleteMapping("/supprimerReservation/{b}")
    public void supprmerReservation(@PathVariable("b")String b)
    {
        reservationServiceImp.removeReservation(b);
    }
    @GetMapping("/findReservationParBloc/idBloc")
    public Reservation findReservationParBloc(@PathVariable("idBloc") long idBloc){
        return reservationServiceImp.findReservationParBloc(idBloc);
    }
    @GetMapping("/findByAnneeUniversitaire_YearAndNomUnuiversite/anneeUniversite/nomUniversite")
    public List<Reservation> findByAnneeUniversitaire_YearAndNomUnuiversite(@PathVariable("anneeUniversitaire") int anneeUniversitaire,@PathVariable("nomUniversite") String nomUniversite){
        return reservationServiceImp.findByAnneeUniversitaire_YearAndNomUnuiversite(anneeUniversitaire,nomUniversite);
    }
}
