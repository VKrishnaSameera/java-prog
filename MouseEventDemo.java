import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo extends JFrame {

    private JTextArea textArea;

    public MouseEventDemo() {
        // Set up the frame
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create a text area
        textArea = new JTextArea();
        textArea.setBounds(20, 20, 350, 200);
        add(textArea);

        // Add mouse listener using MouseAdapter
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                textArea.append("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                textArea.append("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                textArea.append("Mouse Moved to: (" + e.getX() + ", " + e.getY() + ")\n");
            }
        });

        // Make the text area focusable
        textArea.setFocusable(true);
        textArea.requestFocusInWindow();
    }

    public static void main(String[] args) {
        // Create and show the frame
        MouseEventDemo frame = new MouseEventDemo();
        frame.setVisible(true);
    }
}
