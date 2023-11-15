package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repository.IFoyerRepository;

import java.util.List;
@Service
public class FoyerServiceImp implements IFoyerService {
@Autowired
    IFoyerRepository iFoyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyer() {
        return iFoyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long FoyerId) {
        return iFoyerRepository.findById(FoyerId).get();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return iFoyerRepository.save(f);
    }

    @Override
    public void removeFoyer(Long FoyerId) {
        iFoyerRepository.deleteById(FoyerId);
    }

    @Override
    public Foyer modifyBloc(Foyer foyer) {
        return iFoyerRepository.save(foyer);
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite u=iFoyerRepository.findByUniv_IdUniversite(idUniversite);
        foyer.setUniv(u);
        iFoyerRepository.save(foyer);
        return foyer;
    }

}
