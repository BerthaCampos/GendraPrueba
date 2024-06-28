package com.bertha.Gendra.Models;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "r_solicitudcliente")
public class SolicitudModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idR_SolicitudCliente;
    @Basic
    private Integer IdCliente; 
    @Basic
    private Integer Monto; 
    @Basic
    private String Producto;
    @Basic
    private String TipoSolicitud;
    @Basic
    private Integer IdTipoSolicitud; 
    @Basic
    private Integer Tasa;
    @Basic
    private Integer Plazo; 
    @Basic
    private String Frecuencia;
    @Basic
    private String FechaSolicitud;
    @Basic
    private String promotor;
    @Basic
    private String empresa;
}
