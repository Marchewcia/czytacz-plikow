import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOutput {

    public String fileContent;

    public void Read(String name){
        try{
            File file = new File(name + ".txt");
            int count=1;
            Scanner reading = new Scanner(file);
            while(reading.hasNextLine()){
                if(count == 1){
                    fileContent= count + ". " + reading.nextLine();
                }
                else{
                    fileContent = fileContent + "\n" + count + ". " + reading.nextLine();
                }
                count++;
            }
            System.out.println(this.fileContent);
            reading.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File doesn't exist, try again");
            Main.main(null);
        }
    }
}