/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcsvall.app.service;

import com.jcsvall.app.models.Paises;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DELL
 */
@Local
public interface PaisesFacadeLocal {

    void create(Paises paises);

    void edit(Paises paises);

    void remove(Paises paises);

    Paises find(Object id);

    List<Paises> findAll();

    List<Paises> findRange(int[] range);

    int count();
    
}
