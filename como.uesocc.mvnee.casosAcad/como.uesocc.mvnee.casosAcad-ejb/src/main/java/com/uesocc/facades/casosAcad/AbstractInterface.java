/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uesocc.facades.casosAcad;

import java.util.List;

/**
 *
 * @author jssbbonilla
 */
public interface AbstractInterface<T> {
    
 void create(T paso);

    void edit(T paso);

    void remove(T paso);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    int count();
    
    
}
