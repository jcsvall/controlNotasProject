/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcsvall.app.controlnotasproject;

import com.jcsvall.app.pojos.AlumnoPojo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Getter
@Setter
@ManagedBean(name = "indexView")
@ViewScoped
public class AppMain implements Serializable {

    @PersistenceContext(unitName = "notas_unit")
    private EntityManager em;

    private List<AlumnoPojo> alumnoPojo;

    @PostConstruct
    public void init() {
        firstConecction();
    }

    public void firstConecction() {
        alumnoPojo = new ArrayList<>();
        Query q = getEm()
                .createNativeQuery("select a.codigo,a.nombres,a.nie,a.apellido1,a.apellido2,a.genero,a.activo from alumno a");
        List<Object[]> alumnos = q.getResultList();

        for (Object[] alumno : alumnos) {
            AlumnoPojo ap = new AlumnoPojo();
            ap.setCodigo((String) alumno[0]);
            ap.setNombres((String) alumno[1]);
            ap.setNie((String)alumno[2]);
            ap.setApellido1((String) alumno[3]);
            ap.setApellido2((String) alumno[4]);
            ap.setGenero((String) alumno[5]);
            ap.setActivo((Boolean)alumno[6]);
            alumnoPojo.add(ap);
        }
    }
}
