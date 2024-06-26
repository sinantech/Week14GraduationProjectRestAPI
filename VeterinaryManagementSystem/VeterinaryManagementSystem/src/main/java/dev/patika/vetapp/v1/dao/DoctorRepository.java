package dev.patika.vetapp.v1.dao;

import dev.patika.vetapp.v1.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    boolean existsByMailOrPhone(String mail, String phone);
}
