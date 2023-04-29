package digi.firm.gestdem.repositories;

import digi.firm.gestdem.entites.Demmande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemmandeRepository extends JpaRepository<Demmande,Long> {

    public List<Demmande> findByNom(String N);
}
