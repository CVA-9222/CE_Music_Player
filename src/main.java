//import javax.swing.*;
import com.opencsv.*;

import java.io.FileReader;
import java.io.IOException;

public class main{
    public static void main(String[] args) {
        MainInterface mainFrame = new MainInterface("CE MUSIC PLAYER");
        mainFrame.showLogIn();
        mainFrame.setVisible(true);

        try {
            CSVReader reader = new CSVReader(new FileReader("data/usuarios.csv"));
        }
        catch (Exception e){
        }

    }
}
