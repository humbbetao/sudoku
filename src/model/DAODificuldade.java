/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.EntityManager;

/**
 *
 * @author hgoncalves
 */
public class DAODificuldade extends DAOGeneric<Dificuldade> {

    public DAODificuldade(EntityManager entityM) {
        super(entityM);
    }   

}
