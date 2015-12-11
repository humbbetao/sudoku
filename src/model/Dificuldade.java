/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author hgoncalves
 */
public enum Dificuldade {

    @Enumerated(EnumType.ORDINAL)
    DIFICIL(3), MEDIO(2), FACIL(1);
    private int dificuldade;

    private Dificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getDificuldade() {
        return this.dificuldade;
    }
}
