package digi.firm.gestdem;

import digi.firm.gestdem.entites.Demmande;
import digi.firm.gestdem.entites.DemmandeParticulier;
import digi.firm.gestdem.entites.DemmandeProfessionel;
import digi.firm.gestdem.service.DemmandeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestDemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestDemApplication.class, args);
	}

	@Bean
	CommandLineRunner start(DemmandeService demmandeservice) {
		return args ->{

		  Demmande D1=new Demmande(null,"aaa",5842,new Date(),"eee","fff","zz");

		  Demmande D2=new Demmande(null,"aaa",5842,new Date(),"eee","fff","zz");

			Demmande D3=new Demmande(null,"aaa",5842,new Date(),"eee","fff","zz");
			Demmande D4=new Demmande(null,"aaa",5842,new Date(),"eee","fff","zz");
			demmandeservice.ajouterDemmande(D1);
			demmandeservice.ajouterDemmande(D2);
			demmandeservice.ajouterDemmande(D3);
			demmandeservice.ajouterDemmande(D4);

			demmandeservice.SupprimerDemmande((long)4);
			Demmande D5=new Demmande(null,"modifier",5842,new Date(),"eee","fff","zz");


			DemmandeProfessionel A=new DemmandeProfessionel();
			A.setICE(584);
			A.setDatesouhaite(new Date());
			A.setTel("1522222222");
			A.setNom("");
			A.setEmail("");

			demmandeservice.ajouterDemmande(A);
			demmandeservice.AllDemmande().forEach(c->{
				System.out.println(c.toString());

			});




		};

	}

}
