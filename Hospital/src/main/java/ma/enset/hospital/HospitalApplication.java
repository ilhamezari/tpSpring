package ma.enset.hospital;

import ma.enset.hospital.entities.patient;
import ma.enset.hospital.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner{
@Autowired
    private patientRepository patientRepo;
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        patientRepo.save(new patient(null,"Omar",new Date(),false,20));
        patientRepo.save(new patient(null,"Akram",new Date(),true,30));


    }
}