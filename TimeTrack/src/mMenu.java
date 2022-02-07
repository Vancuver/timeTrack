import java.util.Scanner;

public class mMenu {

    public mMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("login:");
        String login = scanner.nextLine();

        System.out.println("password:");
        String password = scanner.nextLine();

        DataBase DB = new DataBase(login, password);
    }

}
