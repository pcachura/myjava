/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcachura.sis_clinica.model.clinica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author PEDRO
 */
@Entity
@Table(name = "cli_mascota")
public class Mascota implements Serializable {

    @Id
    @Column(name = "id_mascota")
    private Long id_mascota;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_nacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column(name = "color")
    private String color;

    @Column(name = "nro_identificacion")
    private String nro_identificacion;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "foto")
    private String foto;

    @OneToOne
    Propietario  id_propietario;
    
    @OneToOne
    Especie id_especie;
    
    @OneToOne
    Raza id_raza;

}
