package re.edu.patientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.edu.patientservice.entity.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Long> {
}
