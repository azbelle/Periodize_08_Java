/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentine
 */
public enum Workout {
    LIGHT (0.85, new double[] {0.60, 0.80, 1.0}, new int[] {12, 12, 8}),
    MEDIUM (0.93, new double[] {0.55, 0.70, 0.85, 1.0}, new int[] {9, 9, 9, 6}),
    HEAVY (1.0, new double[] {0.50, 0.60, 0.70, 0.80, 0.90, 1.0}, new int[] {6, 6, 6, 6, 6, 4});

    private double coefWorkout;
    private double[] coefSet;
    private int[] reps;
    

    Workout(double coefWorkout, double[] coefSet, int[] reps) {
        this.coefWorkout = coefWorkout;
        this.coefSet = coefSet;
        this.reps = reps;
    }
    
    public int[] calcWeight(double frm) {
        int [] weight = new int[coefSet.length];
        for (int i = 0; i <= (coefSet.length-1); i++){
            weight[i] = (int)(5*(Math.round(frm*coefWorkout*coefSet[i])/5));
        }
        return weight;
    }
    
    public int[] numberSet() {
        int[] numberSet = new int[coefSet.length];
        for (int i = 0; i < coefSet.length; i++){
            numberSet[i] = i+1;
        }
        return numberSet;
    }
    
    public int[] getReps() {
        return reps;
    }
    
}


