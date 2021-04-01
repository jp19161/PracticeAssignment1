package net.javavideotutorials.assignment1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LotteryNumberPicker {

    /**
     * This method should pull input from the user in the console.  It should
     * gather 6 Integers from the user and then store these numbers in a Set of
     * Integers that will then be returned by the method.
     * <p>
     * Hint: use the following code to get numbers:
     * <p>
     * Scanner in = new Scanner(System.in);
     * in.nextInt();
     *
     * @return Set of 6 numbers that were chosen by the user
     * @throws IOException
     */
    public Set<Integer> promptUserForLotteryNumbers() throws IOException {
        System.out.println("im in the setup lottery");
        Scanner scanner = new Scanner(System.in);
        System.out.println("inside the scanner");
        Set<Integer> userNumbers = new HashSet<>();
        System.out.println("outside the while loop");
        while (userNumbers.size() < 6) {
            System.out.println("inside the while loop");
            int a = scanner.nextInt();
            System.out.println("take 'a");
            System.out.println(a);
            while (a > 49 || a < 1) {
                System.out.println("Please enter a number between 1 and 49");
                a = scanner.nextInt();
            }
            userNumbers.add(a);
            System.out.println(a + " has been added to myNumbers");
        }

        scanner.close();

        return userNumbers;
    }
}
