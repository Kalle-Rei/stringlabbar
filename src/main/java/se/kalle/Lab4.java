package se.kalle;
// Uppgift:
// Gör ett program där användaren får mata in en mening t ex ”Detta är min text
// som jag matar in”. Programmet skall räkna ut hur många ord meningen består av
// och meddela användaren om detta.
// OBS: detta är svårt. Vi kör happy case = vi kan förutsätta ett endaste MELLANSLAG mrllan
import java.util.Scanner;

public class Lab4 {
    Scanner s = new Scanner(System.in);

    public void run(){
        System.out.print("Mata in en mening: ");
        String input = s.nextLine();
        input = input.trim();
        int counter = 1;
        //orkar inte skriva ordentlig felhantering så det här får duga
        if (!input.isEmpty()){
            for (int i = 0; i < input.length()-1; i++) {
                if(input.charAt(i) == ' '){
                    counter++;
                }
            }
            System.out.println("Den inmatade meningen består av " + counter + " ord.");
        }
    }

}