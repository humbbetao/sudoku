package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
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
    private ControllerSudoku SudokuGame;

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
        if (this.getIntroSudoku().getJtext().equals("")) {
            JOptionPane.showMessageDialog(this.getIntroSudoku().getPanel1(), "Por favor, insira o seu nome");
        } else {

            if (e.getSource() == this.getIntroSudoku().getBtnFacil()) {
                this.SudokuGame = new ControllerSudoku(Dificuldade.FACIL, this.getIntroSudoku().getJtext().toString());
            }
            if (e.getSource() == this.getIntroSudoku().getBtnMedio()) {
                this.SudokuGame = new ControllerSudoku(Dificuldade.MEDIO, this.getIntroSudoku().getJtext().toString());
            }
            if (e.getSource() == this.getIntroSudoku().getBtnDificil()) {
                this.SudokuGame = new ControllerSudoku(Dificuldade.DIFICIL, this.getIntroSudoku().getJtext().toString());
            }
            this.getIntroSudoku().dispose();
        }
    }

    public Intro getIntroSudoku() {
        return introSudoku;
    }

    public void setIntroSudoku(Intro introSudoku) {
        this.introSudoku = introSudoku;
    }

    public ControllerSudoku getSudokuGame() {
        return SudokuGame;
    }

    public void setSudokuGame(ControllerSudoku SudokuGame) {
        this.SudokuGame = SudokuGame;
    }



}
