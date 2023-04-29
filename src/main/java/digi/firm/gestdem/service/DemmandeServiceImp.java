package digi.firm.gestdem.service;

import digi.firm.gestdem.entites.Demmande;
import digi.firm.gestdem.repositories.DemmandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DemmandeServiceImp implements DemmandeService {

    @Autowired
    DemmandeRepository demmanderepo;

    @Override
    public Demmande ajouterDemmande(Demmande D) {
        return demmanderepo.save(D);
    }

    @Override
    public Demmande getDemmande(long id) {
        return demmanderepo.findById(id).get();
    }

    @Override
    public void SupprimerDemmande(Long id) {
        demmanderepo.deleteById(id);

    }

    @Override
    public Demmande ModifierDemmande(Long id, Demmande D) {
        Demmande D1=demmanderepo.findById(id).get();
        D1.setEmail(D.getEmail());
        D1.setNom(D.getNom());
        D1.setObjectif(D.getObjectif());
        D1.setTel(D.getTel());
        return demmanderepo.save(D1);

    }

    @Override
    public List<Demmande> AllDemmande() {
        return demmanderepo.findAll() ;
    }

    @Override
    public List<Demmande> DemmandeByName(String nom) {
        return demmanderepo.findByNom(nom);
    }


}
