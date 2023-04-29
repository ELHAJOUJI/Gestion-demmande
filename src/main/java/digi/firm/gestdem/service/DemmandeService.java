package digi.firm.gestdem.service;

import digi.firm.gestdem.entites.Demmande;

import java.util.List;

public interface DemmandeService {
    Demmande ajouterDemmande(Demmande D);
    Demmande getDemmande(long id);
    void SupprimerDemmande(Long id);
    Demmande ModifierDemmande(Long id,Demmande D);

    List<Demmande> AllDemmande();

    List<Demmande> DemmandeByName(String nom);
}
