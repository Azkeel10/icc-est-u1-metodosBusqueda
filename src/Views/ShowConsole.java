package Views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
        //inputCode();
    }
//-------------------------------------------------------------------------------------------------------------
    public void showBanner(){
        System.out.println("\n----------Metodos de busqueda----------");
    }
//-------------------------------------------------------------------------------------------------------------
    public int inputCode(){
        System.out.println("\nIngrese un codigo:");
        int code = scanner.nextInt();
        return code;
    }
//-------------------------------------------------------------------------------------------------------------
    public void showMessage(String message){
        System.out.println(message);
    }
//-------------------------------------------------------------------------------------------------------------
public String inputName() {
    System.out.println("\nIngrese un nombre:");
    scanner.nextLine(); 
    return scanner.nextLine();
}
//-------------------------------------------------------------------------------------------------------------
}
