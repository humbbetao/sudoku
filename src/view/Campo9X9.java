/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFormattedTextField;
import static model.Jogo9X9.tamanho;

/**
 *
 * @author hgoncalves
 */
public class Campo9X9 {

//    private Campo3X3 campos[][];
    private JFormattedTextField matrizDeSolucao[][];

    public Campo9X9() {
        matrizDeSolucao =  new JFormattedTextField[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizDeSolucao[i][j] = new JFormattedTextField();
            }
        }
    }



    public JFormattedTextField[][] getMatrizDeSolucao() {
        return matrizDeSolucao;
    }

    public void setMatrizDeSolucao(JFormattedTextField[][] matrizDeSolucao) {
        this.matrizDeSolucao = matrizDeSolucao;
    }
    
    

}
