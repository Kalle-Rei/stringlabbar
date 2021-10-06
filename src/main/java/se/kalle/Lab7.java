package se.kalle;
// Uppgift:
// Du har en sträng tex 
// string namn="kurt andersson";
// eller
// string namn="leif stefan holmberg";
// Skriv kod så att förnamn och efternamn i variabeln i en ny variabel (caseName) börjar med stora bokstäver.
// Resultatet skall bli så här "Kurt Andersson"
public class Lab7 {
    public void run(){
        System.out.print("Mata in ditt för- och efternamn: ");
        String inputName = System.console().readLine();
        inputName = inputName.trim();
        String caseName = inputName;
        for (int i = 0; i < caseName.length()-1; i++) {
            
        }

    }
}
