import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonReader {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = UserInput.nextLine();

        try (Scanner fileReader = new Scanner(new File(fileName + ".txt"))) {
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
