package com.ap.SpringBoot.repository;

import com.ap.SpringBoot.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion,Long> {
    /* public class Main {
        static void save() {
            // code to be executed
        }
    }
    */
}
