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

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton(final ActionListener actionListener){
        this.setText("Verificar status do jogo");
        this.addActionListener(actionListener);
    }

}
