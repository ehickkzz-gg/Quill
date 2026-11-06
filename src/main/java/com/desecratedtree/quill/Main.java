package com.desecratedtree.quill;

import com.desecratedtree.quill.ui.MainFrame;
import com.desecratedtree.quill.util.RuntimeRevision;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        RuntimeRevision.configure();
        configureLookAndFeel();
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }

    private static void configureLookAndFeel() {
        FlatMacDarkLaf.setup();
    }
}
