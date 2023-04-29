package digi.firm.gestdem;

import digi.firm.gestdem.entites.Demmande;
import digi.firm.gestdem.repositories.DemmandeRepository;
import digi.firm.gestdem.service.DemmandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestDemApplication {
	@Autowired
	DemmandeRepository demmanderepo;
	public static void main(String[] args) {
		SpringApplication.run(GestDemApplication.class, args);
	}

	@Bean
	CommandLineRunner start(DemmandeService demmandeservice) {
		return args ->{
			Demmande D1=new Demmande(null,"ALI",55842,new Date(),"pour tuer les insectes","0645982314","aliboya@gmail.com",25646,"Particulier");
		  Demmande D2=new Demmande(null,"AHMED",57842,new Date(),"pour tuer les insectes","0621458796","ahmed@gmail.com",25646,"Particulier");
		  Demmande D3=new Demmande(null,"MOHAMED",58472,new Date(),"pour tuer les insectes","0741253698","mohamed@gmail.com",25646,"Particulier");
		  Demmande D4=new Demmande(null,"KHALED",584412,new Date(),"pour tuer les insectes","58963214","khaled@gmail.com",25646,"Professionel");
		  Demmande D5=new Demmande(null,"OMAR",581442,new Date(),"pour tuer les insectes","0678542396","omar@gmail.com",25646,"Professionel");


			demmandeservice.ajouterDemmande(D1);
			demmandeservice.ajouterDemmande(D2);
			demmandeservice.ajouterDemmande(D3);
			demmandeservice.ajouterDemmande(D4);
			demmandeservice.ajouterDemmande(D5);






		};

	}

}
