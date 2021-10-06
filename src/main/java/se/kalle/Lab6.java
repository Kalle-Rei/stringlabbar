package se.kalle;
// Uppgift:
// Write a function to convert a name into initials. You can assume the program takes in two words with one
// space in between them.
// The output should be two capital letters with a dot separating them.
public class Lab6 {
    public void run(){
        System.out.println("Mata in ditt för- och efternamn: ");
        String name = System.console().readLine();
        String initials = "";
        name = name.trim();
        initials += name.charAt(0) + ".";
        if(name.contains(" ")){
            initials += name.charAt((name.indexOf(" ")+1));
        }
        initials = initials.toUpperCase();
        System.out.println(initials);
    }
}
