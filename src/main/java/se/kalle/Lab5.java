package se.kalle;
// Uppgift:
// Be användare mata in ett ord eller en mening. 
// Fråga användaren: ange en position: och mata in ett tal
// Ta fram det tecken som finns i strängen på den positionen
// OBS: Felkontroller...<0 eller > length ska ge felmeddelande och ny inmatning

public class Lab5 {
    //nedanstående variabler måste vara static och deklareras här för att det rekursiva metodanropet av run() ska fungera
    static String inputString;
    static String inputIndex;

    public void run(){
        System.out.print("Mata in ett ord eller en mening: ");
        inputString = System.console().readLine();
        System.out.print("Mata in ett index: ");
        inputIndex = System.console().readLine();
        if(isParsable(inputIndex) && isValidInput(inputString, Integer.parseInt(inputIndex))){
            System.out.println("På position " + inputIndex + " finns tecknet " + inputString.charAt(Integer.parseInt(inputIndex)) + ".");
        }
        while(!isParsable(inputIndex) || !isValidInput(inputString, Integer.parseInt(inputIndex))){
            System.out.println("Felaktig inmatning, försök igen.");
            run(); //rekursivt metodanrop!
        }
    }
    public static boolean isValidInput(String inputString, int inputIndex){
        if(inputIndex >= 0 && (inputIndex <= inputString.length()-1)) return true;
        return false;
    }
    public static boolean isParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
}