package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.swing.JFormattedTextField;
import static model.Dificuldade.FACIL;
import static model.Dificuldade.MEDIO;

public class Jogo9X9 {

    public static final int tamanho = 9;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int matriz[][];
    @Column
    private int numeroAbertos;
    @Column
    private Random gerador;
    @Column
    private int numero;
//    @Column
//    private JFormattedTextField matrizDeSolucao[][];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogo9X9() {
        this.matriz = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = (i * (tamanho) + i / (tamanho) + j) % (tamanho) + 1;
            }
        }
        this.numeroAbertos = 0;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public JFormattedTextField novoCampo(int i, int j) {
        JFormattedTextField novo = new JFormattedTextField();
        int aux = (i * tamanho + i / tamanho + j) % (tamanho) + 1;
        gerador.nextInt(2);
        this.matriz[i][j] = aux;
//        if (numerosAbertos == 1 && numero < definirPeloLevel(this.dificuldade)) {
//            numero++;
//        }
        
//    for (int i = 0; i < this.dificuldade.getDificuldade() * ROW; i++) {
//            for (int j = 0; j < this.dificuldade.getDificuldade() * ROW; j++) {
//                this.sudoku.campos.campos[i][j].addActionListener(listener);
//                if ((Integer.valueOf(this.sudoku.campos.campos[i][j].getText()) != this.sudoku.matriz[i][j])) {
//                    this.sudoku.campos.campos[i][j].setBackground(Color.RED);
//                } else {
//                    this.sudoku.campos.campos[i][j].setBackground(Color.RED);
//                }
//            }
//        }
//        endGame(););
        novo.setText(String.valueOf(aux));
               
//        novo.addActionListener(null);
//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFormattedTextField campos = (JFormattedTextField) e.getSource();
//                int valor = Integer.valueOf(campos.getText());
//
//                if (valor < 0 || valor > 9) {
//                    campos.setBackground(Color.RED);
//                }
//            }
//
//        };

//        for (int i = 0; i < this.dificuldade.getDificuldade() * ROW; i++) {
////            for (int j = 0; j < this.dificuldade.getDificuldade() * ROW; j++) {
//                this.sudoku.campos.campos[i][j].addActionListener(listener);
//                if ((Integer.valueOf(this.sudoku.campos.campos[i][j].getText()) != this.sudoku.matriz[i][j])) {
//                    this.sudoku.campos.campos[i][j].setBackground(Color.RED);
//                } else {
//                    this.sudoku.campos.campos[i][j].setBackground(Color.RED);
////                }
//         
        
        
        
        return novo;
//        (String.valueOf(aux));
    }

    private int definirPeloLevel(Dificuldade dificuldade) {
        int numero = 0;

        if (dificuldade == FACIL) {
            numero = 70;
        } else if (dificuldade == MEDIO) {
            numero = 40;
        } else {
            numero = 20;
        }
        return numero;
    }

    public int getNumeroAbertos() {
        return numeroAbertos;
    }

    public void setNumeroAbertos(int numeroAbertos) {
        this.numeroAbertos = numeroAbertos;
    }

}
