package javabasics._17;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        //int myBankBalanceEuro = 500;

        long myBankBalanceEuro = 500l;


        String suspiciousEmailMessage =
                " Hello Sir/Madam, I'm a prince here in [redacted] and I need help transferring my billions into Italy, please provide your bank account details and I will pay you generously. Thanks";

        long questionableFundsEuro = 5_000_000_000l;

        myBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;

        System.out.println(myBankBalanceEuro);
        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age = byte , perchè è praticamente impossibile che una persona arrivi a 127 anni.
     *
     *    2b: The age of a baby in months = short, perchè supponendo di avere un bambino di 11/12 la sua età in mesi
     *    andrebbe a superare il limite di byte ma sicuramente non di short.
     *
     *    2c: Money in a hedgefund in euros = long, in quanto potremmo avere cifre che superino il miliardo.
     *
     *    2d: Price of a good in euros on amazon.com = float, in quanto su amazon è impossibile trovare prezzi che
     *    possano arrivare a anche solo a 7 decimali.
     *
     *
     *    2e: The exact weight of an apple measured by scientific equipment = byte o short, in quanto una mela
     *    pesa in media dai 150 grammi ai 250 grammi
     *
     *    2f: The number of kilometers from any 2 places in the world = byte, short, int e long, in quanto la distanza
     *    da percorrere può essere di pochi km così come di tanti.
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

            LocalDate myDate = LocalDate.of(2023, Month.MARCH, 20);
            System.out.println(myDate);

            myDate = myDate.now();
            myDate.getDayOfMonth();
            System.out.println(myDate.getDayOfMonth());

            myDate.getDayOfWeek();
            System.out.println(myDate.getDayOfWeek());

            myDate.getDayOfYear();
            System.out.println(myDate.getDayOfYear());

            myDate.getMonth();
            System.out.println(myDate.getMonth());

            myDate.getMonthValue();
            System.out.println(myDate.getMonthValue());

            LocalDate myDate2 = LocalDate.of(1996, Month.JUNE, 11);
            myDate.isBefore(myDate2);
            System.out.println(myDate.isBefore(myDate2));

            myDate.isAfter(myDate2);
            System.out.println(myDate.isAfter(myDate2));

    }
}

