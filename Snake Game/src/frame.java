import javax.swing.*;

public class frame extends JFrame {
    frame(){
        this.add(new panel());

        this.setTitle("SnakeGame");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
