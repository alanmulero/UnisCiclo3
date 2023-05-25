/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.unisciclo3.unisciclo3;

import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class UnisCiclo3 {
       
    public static void main(String[] args) {

        
        double peso;
        double altura;
        
        double imc;
        

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso. Exemplo: 60.5 "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura. Exemplo: 1.75"));
        imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC : " + imc);
    }
}
