import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel {

    private MainInterface mainFrame;
    private JLabel registerLabel;
    private JPanel registerPanel;
    private JLabel userNameLabel;
    private JTextField usernameTextField;
    private JButton atrásButton;

    public RegisterPanel(MainInterface mainFrame){
        this.mainFrame = mainFrame;
        atrásButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanel(){
        return this.registerPanel;
    }

}
