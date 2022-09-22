import javax.swing.*;

public class PlayerPanel {
    private MainInterface mainFrame;
    private JPanel mainPlayerPanel;
    private JButton prevButton;
    private JButton ppButton;
    private JButton nextButton;
    private JButton logOutButton;
    private JButton myAccountButton;

    public PlayerPanel(MainInterface mainFrame){
        this.mainFrame = mainFrame;
        createUIComponents();
    }

    private void createUIComponents() {
        Icon icon = new ImageIcon("media/previous.png");
        prevButton = new JButton(icon);
        icon = new ImageIcon("media/play-and-pause-button.png");
        ppButton = new JButton(icon);
        icon = new ImageIcon("media/forward-button.png");
        nextButton = new JButton(icon);
        // TODO: place custom component creation code here
    }

    public JPanel getPanel(){
        return this.mainPlayerPanel;
    }

    public void showLogIn(){
        mainFrame.showLogIn();
    }
}
