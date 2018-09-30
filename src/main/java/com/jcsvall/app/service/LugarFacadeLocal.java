/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcsvall.app.service;

import com.jcsvall.app.models.Lugar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DELL
 */
@Local
public interface LugarFacadeLocal {

    void create(Lugar lugar);

    void edit(Lugar lugar);

    void remove(Lugar lugar);

    Lugar find(Object id);

    List<Lugar> findAll();

    List<Lugar> findRange(int[] range);

    int count();
    
}
