/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Panel;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Dificuldade;

/**
 *
 * @author hgoncalves
 */
public class Sudoku {

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
    
    int matriz[][];

    //Primeira Tela
//    Sudoku(Dificuldade nivel, Usuario user) throws FileNotFoundException, IOException {
//        super("Sudoku");
//        initTela(nivel, user);
//    }

//    public void initTela(Dificuldade nivel, Usuario user) throws FileNotFoundException, IOException {

//        setSize(800, 600);
//        setVisible(true);
//        panel1 = new Panel();
//        panel2 = new Panel();
//
//        Icon icone = new ImageIcon("mouse_cursor-512.png");
//        Icon icone2 = new ImageIcon("clock.png");
//        btnNovoJogo = new JButton("Novo Jogo", icone);
//        btnDicas = new JButton("Dicas", icone);
//        btnDesistir = new JButton("Desistir", icone);
//        
//        btnTimer = new JButton ("Tempo", icone2);
//        btnTimer.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//        btnTimer.setSize(40, 40);
//        btnTimer.setVisible(true);
//        Label lblNomeJogador = new Label("Nome do Jogador: " + user.getName());
//
//        panel1.setSize(800, 70);
//        panel1.setVisible(true);
//
//        
//        panel1.add(btnNovoJogo);
//        panel1.add(btnDicas);
//        panel1.add(btnDesistir);
//        panel1.add(btnTimer);
//        
//        panel1.add(lblNomeJogador);
//
//        add(panel1);
//
//        panel2.setVisible(true);
//        panel2.setSize(770, 470);
//
//        add(panel2);
//        int level = nivel.getDificuldade() * ROW;
//
//        /**
//         * Configurações dos botões do jogo Botão DESISTIR:
//         *
//         */
//        btnDesistir.addActionListener(this);
//
//        panel2.setLayout(new GridLayout(level, level));
//        campos = new Campos(level);
//        int n = 3;
//        int aux = 0;
//        int numero = 0;
//        int numeroAbertos;
//        int numeroAleatorio;
//        matriz = new int[level][level];
//        gerador = new Random();
//
//        for (int i = 0; i < level; i++) {
//            for (int j = 0; j < level; j++) {
//                aux = (i * level + i / level + j) % (N) + 1;
//                numeroAbertos = gerador.nextInt(2);
//                numeroAleatorio = definirPeloLevel(nivel.getDificuldade());
//                matriz[i][j] = aux;
//                if (numeroAbertos == 1 && numero < numeroAleatorio) {
//                    campos.campos[i][j].setText(String.valueOf(aux));
//                    numero++;
//                    campos.campos[i][j].setEditable(false);
//                    campos.campos[i][j].setEnabled(false);
//                }
//                if ((i + j) % 2 == 0) {
//                    campos.campos[i][j].setText(String.valueOf(aux));
//                }
//                panel2.add(add(campos.campos[i][j]));
//                panel2.setLocation(15, 75);
//
//            }
//        }
//    }
//
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
//
//    private int definirPeloLevel(int dificuldade) {
//        int numero = 0;
//        if (dificuldade == 1) {
//            numero = 7;
//        }
//        if (dificuldade == 2) {
//            numero = 15;
//        }
//        if (dificuldade == 3) {
//            numero = 30;
//        }
//        return numero;
//    }
//
//    public void erro() {
//        JOptionPane.showConfirmDialog(getContentPane(), "ERRO");
//    }
//
//    public Campos getCampos() {
//        return campos;
//    }
//
//    public void setCampos(Campos campos) {
//        this.campos = campos;
//    }
//
//    public Random getGerador() {
//        return gerador;
//    }
//
//    public void setGerador(Random gerador) {
//        this.gerador = gerador;
//    }
//
//    public int[][] getMatriz() {
//        return matriz;
//    }
//
//    public void setMatriz(int[][] matriz) {
//        this.matriz = matriz;
//    }
//
//    void setDefaultCloseOperation() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//
//    
    
}
