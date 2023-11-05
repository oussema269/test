package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.BlocServiceImp;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {
    @Autowired
    BlocServiceImp blocServiceImp;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return blocServiceImp.addBlock(b);
    }
    @GetMapping("/getBlocs")
    public List<Bloc> getBlocs(){
        return blocServiceImp.retrieveAllBlocs();
    }
    @DeleteMapping("/supprimerBlocs/{b}")
    public void supprmerBlocs(@PathVariable("b")long b)
    {
        blocServiceImp.removeBlock(b);
    }
}
