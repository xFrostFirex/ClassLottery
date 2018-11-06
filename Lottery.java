package ClassExamPractice;


import java.util.Random;

/**
 * Created by spencer.roth on 11/6/18.
 */
public class Lottery {
    Random rand = new Random();
    LotteryTicket[] tickets;
    double jackpot;




    public Lottery(int n){
        tickets = new LotteryTicket[n];
        jackpot = 1000.0;
        for(Integer i=0;i<n;i++){
            tickets[i] = new  LotteryTicket("Fred " + i.toString());
        }
    }


    public String toString(){
        String output = "";
        for(LotteryTicket ticket : tickets){
            if (!ticket.getName().equals(null)) {
                output += ticket.getName() + " owns ticket value " + ticket.getNum() + ".\n";
            }
        }
        output += "Jackpot value: " + jackpot;
        return output;
    }

    public int drawWinner(){
        Random rand = new Random();
        return rand.nextInt(50)+1;
    }


    public void printWinners(int winningNum){
        int numWinners=0;
        for(LotteryTicket ticket : tickets){
            if (ticket.getNum() == winningNum){
                System.out.println(ticket.getName() + " is a winner!");
                numWinners++;
            }
        }
        if(numWinners!= 0) {
            System.out.println("Each winner wins " + jackpot / numWinners);
        }
        else{
            jackpot *= 2;
            System.out.println("There were no winners this time.");
        }
    }
}
