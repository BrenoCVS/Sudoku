/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sudoku.ui.custom.button;

/**
 *
 * @author brenocvs 🤘
 */
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(final ActionListener actionListener){
        this.setText("Reiniciar jogo");
        this.addActionListener(actionListener);
    }

}