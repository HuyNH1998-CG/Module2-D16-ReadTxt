import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Input file path");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        ReadFile readFile = new ReadFile();
        readFile.readFileText(path);
    }
}
