package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repository.IChambreRepository;

import java.util.List;
@Service

public class ChambreServiceImpl implements IChambreService {
    @Autowired
    IChambreRepository iChambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return iChambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {

        return iChambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {

        return iChambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        iChambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre c) {
        return iChambreRepository.save(c) ;
    }
}
