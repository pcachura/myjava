/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcachura.sis_clinica.model.clinica;

import com.pcachura.sis_clinica.model.general.Persona;
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
@Table(name = "cli_veterinario")
public class Veterinario implements Serializable {

    @Id
    @Column(name = "id_veterinario")
    private Long id_veterinario;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fecha_registro;

    @OneToOne
    @JoinColumn(name = "id_persona")
    Persona id_persona;

}
