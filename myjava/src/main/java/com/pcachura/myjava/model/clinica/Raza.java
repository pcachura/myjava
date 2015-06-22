/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcachura.sis_clinica.model.clinica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author PEDRO
 */
@Entity
@Table(name = "cli_raza")
public class Raza implements Serializable {

    @Id
    @Column(name = "id_raza")
    private Long id_raza;

    @Column(name = "nombre")
    private String nombre;
    
    @OneToOne
    @JoinColumn(name = "id_especie")
    Especie id_especie;

    public Long getId_raza() {
        return id_raza;
    }

    public void setId_raza(Long id_raza) {
        this.id_raza = id_raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getId_especie() {
        return id_especie;
    }

    public void setId_especie(Especie id_especie) {
        this.id_especie = id_especie;
    }
    

}
