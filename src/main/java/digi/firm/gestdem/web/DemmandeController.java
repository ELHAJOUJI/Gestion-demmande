package digi.firm.gestdem.web;

import digi.firm.gestdem.entites.Demmande;
import digi.firm.gestdem.entites.DemmandeParticulier;
import digi.firm.gestdem.entites.DemmandeProfessionel;
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

    @PostMapping(path ="/demmande1")
    public Demmande AjouterDemmande(@RequestBody DemmandeProfessionel D) {
       System.out.println(D.toString());
       return demmandeservice.ajouterDemmande(D);
    }

    @PostMapping(path ="/demmande2")
    public Demmande AjouterDemmande(@RequestBody DemmandeParticulier D) {

        return demmandeservice.ajouterDemmande(D);
    }

    @GetMapping(path="/demmande")
    public List<Demmande> ReadDemmande() {
        return demmandeservice.AllDemmande();

    }

    @PutMapping(path ="/Demmande/{id}")
    public void UpdateDemmande(@PathVariable Long id,@RequestBody Demmande D) {
        demmandeservice.ModifierDemmande(id,D);
    }


}
