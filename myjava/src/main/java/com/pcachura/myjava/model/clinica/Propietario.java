/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcachura.sis_clinica.model.clinica;

import com.pcachura.sis_clinica.model.general.Persona;
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
@Table(name = "cli_propietario")
public class Propietario implements Serializable{
    @Id
     @Column(name = "id_propietario")
     private Long id_propietario;
    
    @Column(name = "fecha_registro")
    private  String fecha_registro ;
     @OneToOne
     /*Preguntar aqui*/
    @JoinColumn(name = "id_persona")
    private Persona id_persona ;
     

    public Long getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(Long id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }
    
    
}
