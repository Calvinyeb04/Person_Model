import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class PersonGenerator {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        String addAnother = "y";

        while (addAnother.equalsIgnoreCase("y")) {

            String FirstName = "";
            String LastName = "";
            String Title = "";
            int YearofBirth = 0;
            String ID = "";
            int age;


            ID = SafeInput.getRegExString(UserInput, "What is Your ID Number", "(M|m\\d{8})");

            FirstName = SafeInput.getNonZeroLenString(UserInput, "Whats Your Name");

            LastName = SafeInput.getNonZeroLenString(UserInput, "Whats Your LastName");

            Title = SafeInput.getNonZeroLenString(UserInput, "What is Your Title");

            YearofBirth = SafeInput.getRangedInt(UserInput, "What is Your Birth Year", 1500, 2023);


            age = 2023 - YearofBirth;

            System.out.printf("%-10s %-15s %-15s %-10s %-5d\n", "ID#", "Firstname", "Lastname", "Title", "YOB");
            System.out.printf("%-10s %-15s %-15s %-10s %-5d\n", ID, FirstName, LastName, Title, YearofBirth);






            ArrayList<String> data = new ArrayList<>();
            data.add(ID);
            data.add(FirstName);
            data.add(LastName);
            data.add(Title);
            data.add(String.valueOf(YearofBirth));
            data.add(String.valueOf(age));


            System.out.println("Enter the file name: ");
            String fileName = UserInput.nextLine();

            try (FileWriter writer = new FileWriter(fileName + ".txt")) {
                for (String str : data) {
                    writer.write(str + System.lineSeparator());
                }
                System.out.println("Data saved to " + fileName + ".txt");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e);
            }

            System.out.println("Do You Want to add Another Person (y/n)");
            addAnother = UserInput.nextLine();


        }


    }
}





