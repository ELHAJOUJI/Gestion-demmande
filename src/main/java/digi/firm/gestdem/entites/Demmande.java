package digi.firm.gestdem.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type")
public class Demmande {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long id;
    protected String Nom;
    protected double superficie;
    protected Date datesouhaite;
    protected String objectif;
    protected String Tel;
    protected String Email;


}
