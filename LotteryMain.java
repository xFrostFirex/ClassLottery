package ClassExamPractice;

import java.util.Scanner;

/**
 * Created by spencer.roth on 11/6/18.
 */
public class LotteryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many tickets do you want to buy?");
        int iterations = scan.nextInt();
    while (iterations >0) {
    Lottery L1 = new Lottery(15);
    System.out.println(L1);
    L1.printWinners(L1.drawWinner());
    iterations--;
        }
    }
}
