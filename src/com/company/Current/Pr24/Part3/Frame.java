package com.company.Current.Pr24.Part3;

import javax.swing.*;

public class Frame extends JFrame {
    private IDocument current;
    private ICreateDocument fabric;

    Frame (ICreateDocument fab){
        current = null;
        fabric = fab;
        fab.CreateOpen(this);
    }

    public static void main(String[] args) {
        new Frame(new CreateTextDocument());
    }
}
