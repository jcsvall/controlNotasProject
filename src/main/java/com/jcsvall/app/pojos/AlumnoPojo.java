/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcsvall.app.pojos;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Getter
@Setter
public class AlumnoPojo implements Serializable{
  private String codigo;
  private String apellido1;
  private String apellido2;
  private String nie;
  private String nombres;
  private String genero;
  private Boolean activo;

    public AlumnoPojo() {
    }

    public AlumnoPojo(String codigo, String apellido1, String apellido2, String nie, String nombres, String genero, Boolean activo) {
        this.codigo = codigo;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nie = nie;
        this.nombres = nombres;
        this.genero = genero;
        this.activo = activo;
    }
  
  
}
