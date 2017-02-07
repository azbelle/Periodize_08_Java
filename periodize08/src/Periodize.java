
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentine
 */
public class Periodize {
    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
        String weightUnits = "lbs.";
        System.out.print("Select weight units (like lbs. or kg): ");
        weightUnits = sc.nextLine();
	System.out.print("Enter four rep max weight: ");
	double frm = sc.nextDouble();
	sc.close();
	System.out.println();
        
        
        for(Workout value : Workout.values()){
            System.out.println("\n" + value.name() + "\n");
            for (int i=0; i< value.calcWeight(frm).length; i++){
                System.out.print("Set " + value.numberSet()[i] + ": ");
                System.out.print(value.calcWeight(frm)[i] + " " + weightUnits + " x ");
                System.out.println(value.getReps()[i] + " reps");
            }
        }
    }
}