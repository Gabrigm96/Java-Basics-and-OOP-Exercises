package javaoop._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student = new Student();

        student.setCognome("Mangiapane");
        student.setWeight(67.5);
        student.setEta(26);
        student.setNome("Gabriele");
        student.setYearOfBirth(1996);

        System.out.println(student.getCognome());
        System.out.println(student.getWeight());
        System.out.println(student.getEta());
        System.out.println(student.getNome());
        System.out.println(student.getYearOfBirth());


        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student = new Student();

        student.setEta(0);

        student.setEta(26);

        student.setEta(-12);


    }

}
