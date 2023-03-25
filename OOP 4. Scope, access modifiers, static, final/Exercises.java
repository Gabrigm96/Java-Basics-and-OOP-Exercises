package javaoop._4;//package main.java.javaoop.exercises._4;

import java.util.Random;

public class Exercises {

   public static int MAX_WEEKS = 52;
   final static int MAX_DAYS = 7;
   final static int MAX_HOURS = 24;

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * //     * 1: Create variables with the MINIMUM POSSIBLE scope for currentCount and totalCount (both ints)
     * //
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        for (int i = 0; i < 100; i++) {
            int luckyRolls = 5;
            while (rollD6() == 6) {
                luckyRolls++;
                int totalCount = 0;
                totalCount += luckyRolls;
                System.out.println(totalCount);
            }
        } //nel mio ragionamento la creazione delle variabili all'interno dei due cicli limita il loro utilizzo
        //  all'interno dei cicli stessi, tant'è che se provassi a chiamarle fuori l'ide mi segna errore.
    }

    private static Random random = new Random();

    private static int rollD6() {
        return random.nextInt(6) + 1;

    }


    /**
//     * 2a: Change the scope modifiers (also known as access modifiers) in the class ExerciseLunch so no errors appear below,
//     * <p>
//     * 2b: Now change these modifiers to the MINIMUM possible scope, to have no errors
//     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        ExerciseLunch exerciseLunch = new ExerciseLunch(3.4, "Tuesday");

        exerciseLunch.setLunchWeightInGrams(500);

        System.out.println("Lunch on " + exerciseLunch.getNameOfDayEaten() + " cost " + exerciseLunch.getPrice());
    }
    // Ho rimosso il modificatore d'accesso private in favore di default, liberando l'accesso ai metodi all'interno
    // di tutto il pacchetto ma allo stesso tempo non in tutto il progetto.


    /**
//     * 3: Edit this method and Exercise Lunch to fix the errors in the method below
//     *
//     *    Only make edits that remove or add the words, static or final
//     */
   public static void exercise3() {
        //final ExerciseLunch exerciseLunch = null;
        ExerciseLunch exerciseLunch = null;
        exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        ExerciseLunch.printMaxPrice();
    }

   /**
//     * 4: Add constants to the function below for relevant values,
//     *    make sure they are static and final
//     *    and can be accessed anywhere in this class, but nowhere else.
//     *    use SNAKE_CASE naming
//     */
    public static void exercise4() {

        System.out.println("\nExercise 4:");
        for (int week = 0; week < MAX_WEEKS; week++) {
            for (int day = 0; day < MAX_DAYS; day++) {
                for (int hour = 0; hour < MAX_HOURS; hour++) {
                    System.out.println("Week " + week +", day " + day +", hour " + hour);
                }
            }
        }
    }
}
