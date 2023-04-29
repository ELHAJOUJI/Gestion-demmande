package digi.firm.gestdem.web;

import digi.firm.gestdem.entites.Demmande;
import digi.firm.gestdem.service.DemmandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class DemmandeController {
    @Autowired
    private DemmandeService demmandeservice;
    @DeleteMapping(path="/demmande/{id}")
    public void SupprimerDemmande(@PathVariable Long id) {
        demmandeservice.SupprimerDemmande(id);

    }

    @PostMapping(path ="/demmande")
    public Demmande AjouterDemmande(@RequestBody Demmande D) {
       System.out.println(D.toString());
       return demmandeservice.ajouterDemmande(D);
    }



    @GetMapping(path="/demmande")
    public List<Demmande> ReadDemmande() {
        return demmandeservice.AllDemmande();

    }

    @GetMapping(path="/demmande/{id}")
    public Demmande ReadD(@PathVariable Long id) {
        return demmandeservice.getDemmande(id);

    }



    @PutMapping(path ="/demmande/{id}")
    public void UpdateDemmande(@PathVariable Long id,@RequestBody Demmande D) {
        demmandeservice.ModifierDemmande(id,D);
    }

    @GetMapping(path="/Searchdemmande/{nom}")
    public List<Demmande> SearchDemmande(@PathVariable String nom) {
        return demmandeservice.DemmandeByName(nom);

    }
}
