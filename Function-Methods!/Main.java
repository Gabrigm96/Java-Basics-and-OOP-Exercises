package javabasics._16;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        //double celsius = 30;
        //double fahrenheit = ((celsius * 9) / 5) + 32;
        //String conversionDescription = " Celsius is " + celsius  + " and fahrenheit is ";


        double conversion = conversioneGradi(30, 0);
        System.out.println(conversion);





        // End
    }

        static double conversioneGradi(double celsius, double fahrenheit){
         double result = ((celsius * 9) / 5) + 32;
         return result;

        }






    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            System.out.println(nomi("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz"));




            // Call your function
        }

        }
        static List<String> nomi(String Alan, String Alice, String Antonio, String Aziz) {


            Alan = Alan.toUpperCase().trim();
            Alice = Alice.toUpperCase().trim();
            Antonio = Antonio.toUpperCase().trim();
            Aziz = Aziz.toUpperCase().trim();

            if(Antonio.contains("0")){
                Antonio = "INVALID";

            }

            List<String> result = asList(Alan,Alice,Antonio,Aziz);
            return result;






    }


    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        variables(myLunchPrice, lunchType, description, weightInGrams);


        // Call your function

    }
     static void variables(double a, String b, String c, int d){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
     }


    }


