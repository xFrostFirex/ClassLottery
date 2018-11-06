package ClassExamPractice;
import java.util.Random;
/**
 * Created by spencer.roth on 11/6/18.
 */
public class LotteryTicket {
    private String name;
    private int num;

    public LotteryTicket(String n){
        setName(n);
        num = generateTicketNumber();
    }



    private static int generateTicketNumber(){
        Random rand = new Random();
        return rand.nextInt(50) + 1;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }


}
