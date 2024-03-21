import command.*;
import drawer.DrawCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // 绘制的历史记录
    private MacroCommand history = new MacroCommand();
    // 绘制区域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 删除按钮
    private JButton clearButton  = new JButton("clear");
    private JButton redButton  = new JButton("red");
    private JButton yellowButton  = new JButton("yellow");
    private JButton blueButton  = new JButton("blue");
    private JButton cancelButton  = new JButton("cancel");

    // 构造函数
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        blueButton.addActionListener(this);
        cancelButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(yellowButton);
        buttonBox.add(blueButton);
        buttonBox.add(cancelButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    // ActionListener接口中的方法
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            ColorCommand colorCommand = new ColorCommand(canvas, Color.red);
            colorCommand.execute();
        } else if (e.getSource() == yellowButton) {
            ColorCommand colorCommand = new ColorCommand(canvas, Color.yellow);
            colorCommand.execute();
        } else if (e.getSource() == blueButton) {
            ColorCommand colorCommand = new ColorCommand(canvas, Color.blue);
            colorCommand.execute();
        } else if (e.getSource() == cancelButton) {
            UndoCommand undoCommand = new UndoCommand(canvas, history);
            undoCommand.execute();
        }
    }

    // MouseMotionListener接口中的方法
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener接口中的方法
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
