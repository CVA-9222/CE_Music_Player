//import javax.swing.*;
import com.opencsv.*;
import com.opencsv.CSVReader;


import java.io.FileReader;
import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException{
        MainInterface mainFrame = new MainInterface("CE MUSIC PLAYER");
        mainFrame.showLogIn();
        mainFrame.setVisible(true);

        CSVReader reader = new CSVReader(new FileReader("data/usuarios.csv"));

        LinkedList usuarios = new LinkedList();
        String[] record = null;
        while((record = reader.readNext())!= null){
            System.out.println(record);
        }
    }
}
