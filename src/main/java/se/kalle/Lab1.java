package se.kalle;
import java.util.Scanner;
public class Lab1{
    static Scanner s = new Scanner(System.in);
    static int counter = 0;
    public void run(){
        String input = "";
        while(true){
            System.out.print("Mata in ett namn (\"EXIT\" avslutar programmet): ");
            input = s.nextLine();
            if (input.equalsIgnoreCase("EXIT")) {
                break;
            }
            counter++;
            System.out.println("Namnet " + input + " består av " + input.length() + " tecken.");
        }
        System.out.print("Hej då! Du matade in totalt " + counter + " namn.");

    }
}