package model;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Jogo3X3 {
        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int matrizDeSolucao[][];
    @Column
    public static final int tamanho = 3;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogo3X3() {
        this.matrizDeSolucao = new int[tamanho][tamanho];
    }

    public Jogo3X3(int[][] matrizDeSolucao) {
        this.matrizDeSolucao = matrizDeSolucao;
    }

    public int[][] getMatrizDeSolucao() {
        return matrizDeSolucao;
    }

    public void setMatrizDeSolucao(int[][] matrizDeSolucao) {
        this.matrizDeSolucao = matrizDeSolucao;
    }

}
