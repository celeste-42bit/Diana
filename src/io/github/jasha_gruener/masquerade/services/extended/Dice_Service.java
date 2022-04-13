package io.github.jasha_gruener.masquerade.services.extended;

import io.github.jasha_gruener.masquerade.main.Main;

//TODO implement dice roller service class

public class Dice_Service extends Main {
    public static void onCall() {
    }

    public static boolean dice_count() {
        //ask how many dice and how many of those are hunger dice (this is done by the dice command class)
        /*The command class Cmd_Dice should ask for a String and THIS class should translate the String into an int
        There for it does a try{change the String to an int} catch{return invalid and the Cmd has to prompt again};
        */
        //return either 0 if the input values are valid or 1 if the input values are invalid
        boolean isValid = true;
        return isValid;
    }
}
