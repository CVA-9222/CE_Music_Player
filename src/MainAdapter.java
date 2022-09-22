import java.sql.SQLOutput;
import java.util.Scanner;


public class MainAdapter {
    //SIEMPRE DEBE EXISTIR UN MAIN QUE ES EL QUE EJECUTA COMPLETO Y DEBEN ESTAR TODOS LOS ATRIBUTOS
    public static void main (String... args){
        Scanner read=new Scanner(System.in);  //para leer datos en consola
        //new instance
        Register objectData= new Register ();

        System.out.println();
        System.out.println("REGISTRO DE PERSONAS USUARIAS");
        System.out.println("Digite su información: ");
        //Read data client de la clase main, se llama a la clase set compositeData
        objectData.setCompositeData (read.nextLine());

        //Create an adapter of Adapter Class para poder obtener cada uno de los valores a partir de lo
        User adapter =new User (objectData);

        System.out.println();
        System.out.println("Datos de registro");
        System.out.println();
        System.out.println("Tu nombre de usuario es: " +adapter.getUsername());
        System.out.println("Registra tu password: " +adapter.getPassword());
        System.out.println("Nombre: " +adapter.getName());
        System.out.println("Primer apellido: " +adapter.getfLName());
        System.out.println("Segundo apellido: " +adapter.getsLName());
        System.out.println("Tu correo electrónico es: " +adapter.getEmail());
        System.out.println("Tu provincia de residencia es: " +adapter.getProvince());
    }
}
