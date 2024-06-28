package com.bertha.Gendra.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bertha.Gendra.Models.AltaSolicitudModel;

@Repository
public interface AltaSolicitudRepository extends JpaRepository <AltaSolicitudModel, Integer>{
    
}


