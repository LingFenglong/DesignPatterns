package program.component;

import program.interpreter.Context;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProgramFrame extends JFrame {
    private final Context context;
    private final ProgramCanvas programCanvas;
    public ProgramFrame(Context context) throws HeadlessException {
        setTitle("Untitled Frame");
        this.context = context;
        programCanvas = new ProgramCanvas(context);
        getContentPane().add(programCanvas);

        setBackground(Color.white);
        setSize(600, 400);
        setLocation(160, 120);
        pack();
        setVisible(true);

        addListeners();
    }
    private void addListeners() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public ProgramCanvas getProgramCanvas() {
        return programCanvas;
    }
}
