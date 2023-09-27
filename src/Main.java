import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

public static void main(String[] args) {
    FileWriter out = null;
    try {
        out = new FileWriter("cobra.txt");
        String cad = "Es la cobra taka taka,\n una cobra que te ataca";
        out.write(cad);
        String cad2 = "\n una cobra asesina,\n se ha escapao de una pischina";
        out.write(cad2);
        out.close();
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
}
}