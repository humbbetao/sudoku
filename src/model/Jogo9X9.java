package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import static model.Jogo3X3.tamanho;

public class Jogo9X9 {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @OneToOne
    private Jogo3X3 matrizDeSolucao[][];
    @Column
    private int matriz[][];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogo9X9() {
        this.matrizDeSolucao = new Jogo3X3[tamanho][tamanho];
        this.matriz = new int[tamanho * tamanho][tamanho * tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                this.matrizDeSolucao[i][j] = new Jogo3X3();

            }
        }

        for (int i = 0; i < tamanho * tamanho; i++) {
            for (int j = 0; j < tamanho * tamanho; j++) {
                matriz[i][j] = (i * (tamanho * tamanho) + i / (tamanho * tamanho) + j) % (tamanho * tamanho) + 1;
            }

        }
    }

    public Jogo3X3[][] getMatrizDeSolucao() {
        return matrizDeSolucao;
    }

    public void setMatrizDeSolucao(Jogo3X3[][] matrizDeSolucao) {
        this.matrizDeSolucao = matrizDeSolucao;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

}
