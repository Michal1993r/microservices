package com.example.ittt.microservices.repository;

import com.example.ittt.microservices.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
    Optional<Car> findByModel(@Param("model") String model);
}
