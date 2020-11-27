package com.company.Current.Pr24.Part3;

import javax.swing.JFrame;

public interface IDocument {
    IDocument New(JFrame name);
    IDocument Open(JFrame name);
}
