/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author hgoncalves
 */
public class Campo3X3 {

    public static final int tamanho = 3;
    private JFormattedTextField[][] campos;

    public Campo3X3() {
        this.campos = new JFormattedTextField[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                this.campos[i][j] = new JFormattedTextField();
                this.campos[i][j].setSize(10, 10);
                this.campos[i][j].setHorizontalAlignment(this.campos[i][j].CENTER);
                this.campos[i][j].setFont(new Font("Arial", Font.BOLD, 20));
                this.campos[i][j].setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(NumberFormat.getIntegerInstance())));
//                if ((i + j) % 2 == 0) {
//                    this.campos[i][j].setBackground(Color.LIGHT_GRAY);
//                }
//                ActionListener listener = new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        JFormattedTextField campos = (JFormattedTextField) e.getSource();
//                        if (Integer.valueOf(campos.getText()) < 0 || Integer.valueOf(campos.getText()) > 9) {
//                            campos.setBackground(Color.RED);
//                        }
//                        
//                    }
//                };

//                this.campos[i][j].addActionListener(listener);
            }

        }
    }

    private void colorir(int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                   //pintar
            }
        }
    }

    public JFormattedTextField[][] getCampos() {
        return campos;
    }

    public void setCampos(JFormattedTextField[][] campos) {
        this.campos = campos;
    }
}
