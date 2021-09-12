/*
 *  UCF COP3330 Fall 2021 Exercise 6 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
import java.util.Calendar;
public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        String ageString = input.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retireString = input.nextLine();

        int age = Integer.parseInt(ageString);
        int retire = Integer.parseInt(retireString);
        int yrsLeft = retire - age;
        int current = Calendar.getInstance().get(Calendar.YEAR);
        int retirement = current + yrsLeft;

        System.out.println(String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d", yrsLeft, current, retirement));
    }
}
