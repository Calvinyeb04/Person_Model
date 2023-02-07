import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PersonReader {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (Scanner fileReader = new Scanner(selectedFile)) {
                while (fileReader.hasNextLine()) {
                    String ID = fileReader.nextLine();
                    String FirstName = fileReader.nextLine();
                    String LastName = fileReader.nextLine();
                    String Title = fileReader.nextLine();
                    int YearofBirth = Integer.parseInt(fileReader.nextLine());
                    int age = Integer.parseInt(fileReader.nextLine());

                    System.out.println(ID + ", " + FirstName + " " + LastName + ", " + Title + ", " + YearofBirth + ", " + age + " years old");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file: " + e);
            }
        }
    }
}
