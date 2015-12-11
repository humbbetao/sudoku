package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Dificuldade;
import model.Historico;
import model.Jogador;
import model.Jogo9X9;
import model.Partida;
import view.Intro;
import view.Sudoku;

public class ControllerInterface implements ActionListener {

    private Intro introSudoku;
    private Sudoku SudokuGame;
    
//    private Jogador jogador;
//    private Dificuldade dificuldade;
//    private Partida partida;
//    private Historico historico;
//    private Jogo9X9 jogo;

    public static void main(String[] args) {
        new ControllerInterface();
    }

    public ControllerInterface() {
        this.introSudoku = new Intro();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        this.setDificuldade(new Dificuldade(nivel));
//        this.setJogador(new Jogador(nomeDoJogador));
//        this.setJogo(new Jogo9X9());
//        this.setPartida(new Partida(this.getJogador(), this.getJogo()));
//        this.setHistorico(this.getPartida(), this.getData());
        if (e.getSource() == this.getIntroSudoku().getBtnFacil()) {
//            this.setSudokuGame(new Sudoku(Dificuldade.FACIL));
        }
        if (e.getSource() == this.getIntroSudoku().getBtnMedio()) {
//            this.setSudokuGame(new Sudoku(Dificuldade.MEDIO));
        }
        if (e.getSource() == this.getIntroSudoku().getBtnDificil()) {
//            this.setSudokuGame(new Sudoku(Dificuldade.DIFICIL));
        }
        this.getIntroSudoku().dispose();

    }

//    public Jogador getJogador() {
//        return jogador;
//    }
//
//    public void setJogador(Jogador jogador) {
//        this.jogador = jogador;
//    }
//
//    public Dificuldade getDificuldade() {
//        return dificuldade;
//    }

//    public void setDificuldade(Dificuldade dificuldade) {
//        this.dificuldade = dificuldade;
//    }
//
//    public Partida getPartida() {
//        return partida;
//    }
//
//    public void setPartida(Partida partida) {
//        this.partida = partida;
//    }
//
//    public Historico getHistorico() {
//        return historico;
//    }
//
//    public void setHistorico(Historico historico) {
//        this.historico = historico;
//    }
//
//    public Jogo9X9 getJogo() {
//        return jogo;
//    }
//
//    public void setJogo(Jogo9X9 jogo) {
//        this.jogo = jogo;
//    }

    public Intro getIntroSudoku() {
        return introSudoku;
    }

    public void setIntroSudoku(Intro introSudoku) {
        this.introSudoku = introSudoku;
    }

    public Sudoku getSudokuGame() {
        return SudokuGame;
    }

    public void setSudokuGame(Sudoku SudokuGame) {
        this.SudokuGame = SudokuGame;
    }

}
