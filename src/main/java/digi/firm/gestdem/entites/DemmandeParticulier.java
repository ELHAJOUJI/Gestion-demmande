package digi.firm.gestdem.entites;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PARTIC")
@Data

public class DemmandeParticulier extends Demmande {

}
