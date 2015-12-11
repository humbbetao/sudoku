/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import model.Dificuldade;

/**
 *
 * @author hgoncalves
 */
public class Intro  extends JFrame implements ActionListener  {
    private ActionListener controller;
    private JDialog primeiraTela;
    private JPanel panel1;
    private JButton btnHistorico;
    private JButton btnFacil;
    private JButton btnMedio;
    private JButton btnDificil;

    private JTextField jtext;
    private Label lblNomeJogador;
    private Dificuldade dificuldade;


    public void criarInterface(){
         
        setSize(600,700);
        JSeparator separador = new JSeparator();
        JPanel panel1 = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image imagem = new ImageIcon("sudoku.gif").getImage();
                g.drawImage(imagem, 0, 0, this);
            }
        };
        
        add(panel1);

        jtext = new JTextField();
        jtext.setFont(new Font("Arial", Font.BOLD, 20));
        lblNomeJogador = new Label("Olá! Insira um nome e escolha o nível para jogar:");
        lblNomeJogador.setFont(new Font("Arial", Font.BOLD, 20));
        lblNomeJogador.setBackground(Color.WHITE);

        Icon angry = new ImageIcon("angry.png");
        Icon notAngry = new ImageIcon("persons-0052_large.png");
        Icon happy = new ImageIcon("happy.png");

        Icon icone2 = new ImageIcon("historico.png");
        btnHistorico = new JButton("Acessar histórico.", icone2);
        btnHistorico.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        btnFacil = new JButton("Fácil (70 números abertos)", happy);
        btnFacil.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        btnMedio = new JButton("Médio (40 números abertos)", notAngry);
        btnMedio.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        btnDificil = new JButton("Difícil (15 números abertos)", angry);
        btnDificil.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        panel1.setSize(800,600);
        panel1.setVisible(true);

        btnHistorico.setSize(35, 35);
        btnFacil.setSize(30, 30);
        btnMedio.setSize(30, 30);
        btnDificil.setSize(30, 30);

        btnHistorico.setBounds(new Rectangle(130, 130, 130, 130));
        btnFacil.setBounds(new Rectangle(150, 150, 150, 150));
        btnMedio.setBounds(new Rectangle(150, 150, 150, 150));
        btnDificil.setBounds(new Rectangle(150, 150, 150, 150));

        btnHistorico.addActionListener(controller);
        btnFacil.addActionListener(controller);
        btnMedio.addActionListener(controller);
        btnDificil.addActionListener(controller);

        btnHistorico.setVisible(true);
        btnFacil.setVisible(true);
        btnMedio.setVisible(true);
        btnDificil.setVisible(true);

        jtext.setColumns(25);

        panel1.add(btnHistorico);

        panel1.add(lblNomeJogador);

        panel1.add(jtext);

        panel1.add(btnFacil);

        panel1.add(btnMedio);

        panel1.add(btnDificil);

//        setSize(540, 564);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Intro() {
        super("SUDOKU");
        criarInterface();
    }

    

    
    public void addController(ControllerInterface controller){
        btnFacil.addActionListener(controller);
//		System.out.println("View      : adding controller");
//		btnFacil.addActionListener(controller);	//need controller before adding it as a listener 
	} //addController()
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (jtext.getText().equals("")) {
            JOptionPane.showMessageDialog(panel1, "Por favor, insira o seu nome");
        } else {
            if (e.getSource() == btnFacil) {
                
//                    game = new Game(jtext.getText(), dificuldade.FACIL);
            }
            if (e.getSource() == btnMedio) {
//                    game = new Game(jtext.getText(), dificuldade.MEDIO);
            }
            if (e.getSource() == btnDificil) {
//                    game = new Game(jtext.getText(), dificuldade.DIFICIL);
            }
            dispose();
        }
    }

    public ActionListener getController() {
        return controller;
    }

    public void setController(ActionListener controller) {
        this.controller = controller;
    }

    public JDialog getPrimeiraTela() {
        return primeiraTela;
    }

    public void setPrimeiraTela(JDialog primeiraTela) {
        this.primeiraTela = primeiraTela;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JButton getBtnHistorico() {
        return btnHistorico;
    }

    public void setBtnHistorico(JButton btnHistorico) {
        this.btnHistorico = btnHistorico;
    }

    public JButton getBtnFacil() {
        return btnFacil;
    }

    public void setBtnFacil(JButton btnFacil) {
        this.btnFacil = btnFacil;
    }

    public JButton getBtnMedio() {
        return btnMedio;
    }

    public void setBtnMedio(JButton btnMedio) {
        this.btnMedio = btnMedio;
    }

    public JButton getBtnDificil() {
        return btnDificil;
    }

    public void setBtnDificil(JButton btnDificil) {
        this.btnDificil = btnDificil;
    }

    public JTextField getJtext() {
        return jtext;
    }

    public void setJtext(JTextField jtext) {
        this.jtext = jtext;
    }

    public Label getLblNomeJogador() {
        return lblNomeJogador;
    }

    public void setLblNomeJogador(Label lblNomeJogador) {
        this.lblNomeJogador = lblNomeJogador;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }
    

}
