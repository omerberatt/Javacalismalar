package com.omerberat.swingornegi;

import javax.swing.*;

public class Pencere {
    private JFrame frame;


    public Pencere(){

        frame = new JFrame();
        JButton button = new JButton("TIKLA");
        button.setBounds(130,100,100,40);
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
