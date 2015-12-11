/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import model.Dificuldade;
import model.Historico;
import model.Jogador;
import model.Jogo9X9;
import model.Partida;
import view.Campo9X9;
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
    private String data;

    public ControllerSudoku() {

    }

    public ControllerSudoku(Dificuldade dificuldade, String usuario) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        this.data = dateFormat.format(new Date());
        this.dificuldade = dificuldade;
        this.jogador = new Jogador(usuario);
        this.jogo = new Jogo9X9();
        this.partida = new Partida(this.jogador, this.jogo, this.dificuldade);
        this.historico = new Historico(this.partida, data);
        this.sudoku = new Sudoku(this.dificuldade, usuario, this.getJogo().getMatriz());

    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public Jogo9X9 getJogo() {
        return jogo;
    }

    public void setJogo(Jogo9X9 jogo) {
        this.jogo = jogo;
    }

    public Sudoku getSudoku() {
        return sudoku;
    }

    public void setSudoku(Sudoku sudoku) {
        this.sudoku = sudoku;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public JFormattedTextField formarCampos(int i, int j) {
        this.jogo.novoCampo(i, j).addFocusListener(new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {
                if(e.getSource()==[i][j])
                {
                    
                }
                
//                super.focusLost(e); //To change body of generated methods, choose Tools | Templates.
            }
            
        
        });
        return this.jogo.novoCampo(i, j);

    }

    public ActionListener addFuncao(int i, int j)
    {
        this.getSudoku().getCampos().getMatrizDeSolucao()[i][j].addFocusListener(new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {             
                
                super.focusLost(e);
            }
            
        
        
        });
        
        
        
        
    }
}
