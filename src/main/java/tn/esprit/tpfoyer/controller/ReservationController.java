package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.BlocServiceImp;
import tn.esprit.tpfoyer.services.ReservationServiceImp;

import java.util.List;
@RestController
public class ReservationController {
    @Autowired
    ReservationServiceImp reservationServiceImp;
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation b){
        return reservationServiceImp.addReservation(b);
    }
    @GetMapping("/getBlocs")
    public List<Reservation> getBlocs(){
        return reservationServiceImp.retrieveAllReservation();
    }
    @DeleteMapping("/supprimerReservation/{b}")
    public void supprmerBlocs(@PathVariable("b")String b)
    {
        reservationServiceImp.removeReservation(b);
    }
}
