package net.javavideotutorials.assignment1;

import java.util.*;


public class LotteryNumberGenerator {

    /**
     * This method should return a Set of 6 different
     * integers.
     * <p>
     * Hint: use the 'Random' class located here: java.util.Random
     * to generate random numbers
     *
     * @return
     */
    public Set<Integer> generateLotteryNumbers() {

        Random random = new Random();
        Set<Integer> lotteryNumbers = new HashSet<Integer>();

        while (lotteryNumbers.size() < 6) {
            lotteryNumbers.add(random.nextInt(49) + 1);
        }

        // orderes the winning numbers. To be used later with comparison? Do I even need this?
        /*ArrayList<Integer> orderedList = new ArrayList<Integer>(winningNumbers);
        Collections.sort(orderedList);*/


        return lotteryNumbers;
    }
}
