package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

@Entity
public class Partida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPartida;

    @Column
    @OneToOne
    private Jogador jogador;
    @Column
    @OneToOne
    private Jogo9X9 jogo;
    @Column
    @OneToOne
    private Dificuldade dificuldade;

    public Partida(Jogador jogador, Jogo9X9 jogo, Dificuldade dificuldade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogo9X9 getJogo() {
        return jogo;
    }

    public void setJogo(Jogo9X9 jogo) {
        this.jogo = jogo;
    }

    public Partida() {
    }

    public Partida(int idPartida, Jogador jogador, Jogo9X9 jogo) {
        this.idPartida = idPartida;
        this.jogador = jogador;
        this.jogo = jogo;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Partida(int idPartida, Jogador jogador, Jogo9X9 jogo, Dificuldade dificuldade) {
        this.idPartida = idPartida;
        this.jogador = jogador;
        this.jogo = jogo;
        this.dificuldade = dificuldade;
    }
    
    

}
