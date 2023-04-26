package ma.enset.hospital.repository;

import ma.enset.hospital.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface patientRepository extends JpaRepository<patient,Long> {
//public List<patient> findById(Long id);
}
