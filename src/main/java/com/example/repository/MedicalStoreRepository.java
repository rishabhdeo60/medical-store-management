package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Medicine;

@Repository
public interface MedicalStoreRepository extends JpaRepository<Medicine, Integer> {

}
