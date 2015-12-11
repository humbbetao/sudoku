
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogo9X9() {
        this.matrizDeSolucao = new Jogo3X3[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                this.matrizDeSolucao[i][j] = new Jogo3X3();
            }
        }
    }

    public Jogo3X3[][] getMatrizDeSolucao() {
        return matrizDeSolucao;
    }

    public void setMatrizDeSolucao(Jogo3X3[][] matrizDeSolucao) {
        this.matrizDeSolucao = matrizDeSolucao;
    }

}
