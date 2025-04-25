/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.sudoku.ui.custom.input;

/**
 *
 * @author brenocvs 🤘 
 */

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.util.List;

import static java.util.Objects.isNull;

public class NumbertextLimit extends PlainDocument {

    private final List<String> NUMBERS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

    @Override
    public void insertString(final int offs, final String str, final AttributeSet a) throws BadLocationException {
        if (isNull(str) || (!NUMBERS.contains(str))) return;

        if (getLength() + str.length() <= 1){
            super.insertString(offs, str, a);
        }
    }
}
