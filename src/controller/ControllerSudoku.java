/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Dificuldade;
import model.Historico;
import model.Jogador;
import model.Jogo9X9;
import model.Partida;
import view.Sudoku;

/**
 *
 * @author hgoncalves
 */
public class ControllerSudoku {
    private Jogador jogador;
    private Dificuldade dificuldade;
    private Partida partida;
    private Historico historico;
    private Jogo9X9 jogo;
    private Sudoku sudoku;

    public ControllerSudoku() {
//        this.sudoku = new Sudoku(dificuldade);
        this.sudoku = new Sudoku();
    }
    
    
    
    
    
}
