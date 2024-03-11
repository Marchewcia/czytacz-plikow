import java.util.Scanner;

public class FileName {
    public String fileName;

    public void NameInputAndOutput() {
        System.out.println("Input name of a file you want to read: ");
        Scanner input = new Scanner(System.in);
        this.fileName = input.nextLine();
        System.out.println("You're using name: " + this.fileName);

    }
}