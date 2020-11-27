package com.company.Current.Pr24.Part3;

import javax.swing.JFrame;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public TextDocument CreateNew(JFrame main) {
        return new TextDocument().New(main);
    }

    @Override
    public TextDocument CreateOpen(JFrame main) {
        return new TextDocument().Open(main);
    }

}
