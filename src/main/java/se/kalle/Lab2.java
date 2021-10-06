package se.kalle;
/*
Du har en sträng med texten ”Detta är en sträng som du skall ändra”. 
Ersätt via kod alla blanktecken i strängen med tecknet *. 
Räkna sedan ut via kod hur många förekomster det finns av tecknet * i strängen.
*/
public class Lab2 {
    public void run(){
        String changeMe = "Detta är en sträng du ska ändra";
        changeMe = changeMe.replaceAll(" ", "*");
        int counter = 0;
        for(int i = 0; i < changeMe.length()-1; i++){
            if (changeMe.charAt(i) == '*') {
                counter++;
            }
        }
        System.out.println("Strängen changeMe (" + changeMe + ") \ninnehåller " + counter + " st *-tecken.");
    }
}
