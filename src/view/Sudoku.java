/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerInterface;
import controller.ControllerSudoku;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Dificuldade;
import static model.Dificuldade.*;
import model.Jogador;
import model.Jogo9X9;
import static model.Jogo9X9.tamanho;

/**
 *
 * @author hgoncalves
 */
public class Sudoku extends JFrame {

//    public Sudoku(Dificuldade dificuldade) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Sudoku() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//     Campos campos;
    private JPanel primeiraTela;
    private Random gerador;
    private Panel panel1;
    private Panel panel2;
    private JButton btnNovoJogo;
    private JButton btnDicas;
    private JButton btnDesistir;
    private JButton btnTimer;
    private Campo9X9 campos;
    private ControllerSudoku controller;

    int matriz[][];

    public Sudoku() {
    }

    public Sudoku(Dificuldade dificuldade, String jogador, int[][] matriz) {
        super("SUDOKU - " + jogador);
        criarInterface(dificuldade, jogador, matriz);
    }

    public Sudoku(Dificuldade dificuldade, Jogador jogador, Jogo9X9 jogo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JPanel getPrimeiraTela() {
        return primeiraTela;
    }

    public void setPrimeiraTela(JPanel primeiraTela) {
        this.primeiraTela = primeiraTela;
    }

    public Random getGerador() {
        return gerador;
    }

    public void setGerador(Random gerador) {
        this.gerador = gerador;
    }

    public Panel getPanel1() {
        return panel1;
    }

    public void setPanel1(Panel panel1) {
        this.panel1 = panel1;
    }

    public Panel getPanel2() {
        return panel2;
    }

    public void setPanel2(Panel panel2) {
        this.panel2 = panel2;
    }

    public JButton getBtnNovoJogo() {
        return btnNovoJogo;
    }

    public void setBtnNovoJogo(JButton btnNovoJogo) {
        this.btnNovoJogo = btnNovoJogo;
    }

    public JButton getBtnDicas() {
        return btnDicas;
    }

    public void setBtnDicas(JButton btnDicas) {
        this.btnDicas = btnDicas;
    }

    public JButton getBtnDesistir() {
        return btnDesistir;
    }

    public void setBtnDesistir(JButton btnDesistir) {
        this.btnDesistir = btnDesistir;
    }

    public JButton getBtnTimer() {
        return btnTimer;
    }

    public void setBtnTimer(JButton btnTimer) {
        this.btnTimer = btnTimer;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    private void criarInterface(Dificuldade dificuldade, String jogador, int[][] matriz) {
        this.campos = new Campo9X9();
        setSize(600, 600);
        setVisible(true);
        panel1 = new Panel();
        panel2 = new Panel();
        Icon icone = new ImageIcon("mouse_cursor-512.png");
        Icon icone2 = new ImageIcon("clock.png");
        btnNovoJogo = new JButton("Novo Jogo", icone);
        btnDicas = new JButton("Dicas", icone);
        btnDesistir = new JButton("Desistir", icone);
        btnTimer = new JButton("Tempo", icone2);
        btnTimer.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        btnTimer.setSize(40, 40);
        btnTimer.setVisible(true);
        Label lblNomeJogador = new Label("Nome do Jogador: " + jogador);
        panel1.setSize(800, 70);
        panel1.setVisible(true);
        panel1.add(btnNovoJogo);
        panel1.add(btnDicas);
        panel1.add(btnDesistir);
        panel1.add(btnTimer);
        panel1.add(lblNomeJogador);
        add(panel1);
        panel2.setVisible(true);
        panel2.setSize(770, 470);
        add(panel2);
        panel2.setLayout(new GridLayout(tamanho, tamanho));
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                this.campos.getMatrizDeSolucao()[i][j] = this.controller.formarCampos(i, j);
                this.campos.getMatrizDeSolucao()[i][j].addFocusListener(new FocusAdapter() {
//                    controller.addFuncao (i, j);
                });
//                this.campos.getMatrizDeSolucao()[i][j].addActionListener(controller.addFuncao(i, j, new ActionEvent(i, j, jogador)));
                panel2.add(add(this.campos.getMatrizDeSolucao()[i][j]));
                panel2.setLocation(15, 75);
            }
        }

        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == btnDesistir) {
                    dispose();
                    new ControllerInterface();
                }
                if (e.getSource() == btnNovoJogo) {
                    dispose();

                }

            }

        }
               
    }

    public Campo9X9 getCampos() {
        return campos;
    }

    public void setCampos(Campo9X9 campos) {
        this.campos = campos;
    }
//    @Override
//    public void actionPerformed(ActionEvent e
//    ) {
//        if (e.getSource() == btnDesistir) {
//            dispose();
//            InterfaceInicial inter = new InterfaceInicial();
//        }
//        if (e.getSource() == btnDicas) {
//            JOptionPane.showConfirmDialog(this, "DERU ERRRRO");
//        }
//        if (e.getSource() == btnNovoJogo) {
//            dispose();
////            ;limpar tela
//        }
//
//    }

}
