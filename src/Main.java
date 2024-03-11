public class Main {
    public static void main(String[] args) {
        FileName file = new FileName();
        FileOutput output = new FileOutput();
        Confirmation confirm = new Confirmation();

        file.NameInputAndOutput();

        Confirm(file, confirm, output);
    }

    public static void Confirm(FileName file, Confirmation confirm, FileOutput output){
        String answer = confirm.Confirm(file.fileName);
        if(answer.equals("T")){
            System.out.println("File " + file.fileName + ".txt contains:");
            output.Read(file.fileName);
        }
        else if (answer.equals("F")) {
            main(null);
        }
        else{
            Confirm(file, confirm, output);
        }

    }
}