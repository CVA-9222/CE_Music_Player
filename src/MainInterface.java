import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame {

    private JPanel mainPanel;
    private LogIn logInPanel = new LogIn(this);
    private RegisterPanel registerPanel = new RegisterPanel(this);
    private PlayerPanel playerPanel = new PlayerPanel(this);

    public MainInterface(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setPreferredSize(new Dimension(500,500));
        this.setResizable(false);

        this.setContentPane(mainPanel);
        this.pack();
    }

    public void showLogIn(){
        this.setContentPane(this.logInPanel.getPanel());
        this.pack();
    }

    public void showRegister(){
        this.setContentPane(this.registerPanel.getPanel());
        this.pack();
    }

    public void showPlayerPanel(){
        this.setContentPane(this.playerPanel.getPanel());
        this.pack();
    }

}
