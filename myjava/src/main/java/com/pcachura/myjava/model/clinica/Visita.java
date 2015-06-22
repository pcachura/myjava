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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PEDRO
 */
@Entity
@Table(name = "cli_visita")
public class Visita implements Serializable {

    @Id
    @Column(name= "id_visita")
   private Long id_visita;

    @Column(name = "fecha_ingreso")
     @Temporal(TemporalType.DATE)
    private Date fecha_ingreso;

    @Column(name = "fecha_salidad")
     @Temporal(TemporalType.DATE)
    private Date fecha_salidad;

    @Column(name = "motivo")
    private String motivo;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "tratamiento")
    private String tratamiento;

    @Column(name = "dieta")
    private String dieta;

    @Column(name = "proxima_visita")
    @Temporal(TemporalType.DATE)
    private Date proxima_visita;

    @OneToOne
    @JoinColumn(name = "id_mascota")
    Mascota id_mascota;

    @OneToOne
    @JoinColumn(name = "id_veterinario")
    Veterinario id_veterinario;

}
