import java.util.Scanner;

public class Confirmation {
    public String Confirm(String name){
        System.out.println("Are you sure you want to open file with name: " + name + "? Input T if yes, input F if no");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
