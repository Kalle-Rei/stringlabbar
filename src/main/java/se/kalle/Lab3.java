package se.kalle;
import java.util.Scanner;
public class Lab3 {
    // Uppgift:
    // Be användaren mata in en mailadress. Programmet skall kontrollera att inmatningen är rätt,
    // dvs att det finns ett @ tecken och att det finns en . med 2 eller 3 tecken efter.
    // Meddela användaren om det är rätt eller felaktig adress
    static Scanner s = new Scanner(System.in);
    public void run(){
        System.out.print("Mata in en mailadress: ");
        String mailadress = s.nextLine();
        boolean validAdress = false;
        if(!mailadress.isEmpty() && mailadress.contains("@") && !mailadress.startsWith("@")){
            //split into 2 if statements for readability
            if(mailadress.contains(".") 
                && ((mailadress.lastIndexOf(".") == mailadress.length()-3) 
                || (mailadress.lastIndexOf(".") == mailadress.length()-4))){
                    //use lastIndexOf instead of indexOf to prevent edge cases like example@sti... from passing
                    validAdress = true;
            }
        }
        if(validAdress){
            System.out.println("\nDu har matat in en giltig mailadress.");
        }
        else{
            System.out.println("\nDu har matat in en felaktig mailadress.");
        }
    }
}
