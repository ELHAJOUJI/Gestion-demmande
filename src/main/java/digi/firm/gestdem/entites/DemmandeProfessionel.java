package digi.firm.gestdem.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PROFESS")
@Data
@AllArgsConstructor @NoArgsConstructor
public class DemmandeProfessionel extends Demmande{
    private int ICE;
}
