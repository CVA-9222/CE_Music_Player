import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSVUser {
    public static void main (String [] args){
        String file= "src\\usuarios.csv";
        BufferedReader reader = null;
        String line="";

        try{
            reader= new BufferedReader(new FileReader(file));
            while ((line=reader.readLine()) !=null){

                String[] row=line.split (",");
                for (String index: row){
                    System.out.printf("%-10s", index);
                    }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try{
            reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}


/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSVUser {
    public static LinkedList<String[]> csvToList(String path) {
        LinkedList<String[]> list = new LinkedList<String[]>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuarios.csv"));
            br.lines()
                    .filter(line -> br.lines() = "1")
                    .forEach (line -> {
                        String[] fields = path.split(",");
                        String username = fields[0].trim();
                        String password = fields[1].trim();
                        String name = fields[3].trim();
                        String fLName = fields[4].trim();
                        String sLName = fields[5].trim();
                        String email = fields[6].trim();
                        String province = fields[7].trim();
                        String[] csv = { username, password, name, fLName, sLName, email, province};
                        list.add(csv);
                        br.close();
                        return list;
                        });
        }
        catch (IOException e) {
            return null;
        }
    }
}
*/