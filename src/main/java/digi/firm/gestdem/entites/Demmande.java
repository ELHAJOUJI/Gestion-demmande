package digi.firm.gestdem.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Demmande {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long id;
    protected String nom;
    protected double superficie;
    @Temporal(TemporalType.DATE)
    protected Date datesouhaite;
    protected String objectif;
    protected String tel;
    protected String email;
    private int ICE;
    private String typeDemmandeur;



}
