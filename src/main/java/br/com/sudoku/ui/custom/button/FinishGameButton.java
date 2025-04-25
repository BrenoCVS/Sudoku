/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sudoku.ui.custom.button;

/**
 *
 * @author breno 🤘
 */
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class FinishGameButton extends JButton {

    public FinishGameButton(final ActionListener actionListener){
        this.setText("Concluir jogo");
        this.addActionListener(actionListener);
    }

}
