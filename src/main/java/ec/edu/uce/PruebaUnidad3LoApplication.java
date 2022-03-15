package ec.edu.uce;


import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PruebaUnidad3LoApplication implements CommandLineRunner{
	private static Logger LOG = Logger.getLogger(PruebaUnidad3LoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad3LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
