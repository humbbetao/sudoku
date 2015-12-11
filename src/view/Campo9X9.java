/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFormattedTextField;
import static view.Campo3X3.tamanho;

/**
 *
 * @author hgoncalves
 */
public class Campo9X9 {

    private Campo3X3 campos[][];

    public Campo9X9() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                campos[i][j] = new Campo3X3();
            }
        }
    }

}
