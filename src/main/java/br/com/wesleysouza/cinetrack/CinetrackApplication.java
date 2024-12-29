package br.com.wesleysouza.cinetrack;

import br.com.wesleysouza.cinetrack.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinetrackApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CinetrackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeMenu();


    }
}
