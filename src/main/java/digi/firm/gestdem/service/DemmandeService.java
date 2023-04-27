package digi.firm.gestdem.service;

import digi.firm.gestdem.entites.Demmande;

import java.util.List;

public interface DemmandeService {
    Demmande ajouterDemmande(Demmande D);
    void SupprimerDemmande(Long id);
    Demmande ModifierDemmande(Long id,Demmande D);

    List<Demmande> AllDemmande();
}
