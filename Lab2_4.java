import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs = sc.nextInt();
        int OT = hrs-40;

        if(hrs<=40){
            int money = hrs*120;
            System.out.println(money);
        }
        else if(hrs>40){
            int OTmoney =+ OT*20;
            int money = ((hrs-OT)*120)+OTmoney; 
            System.out.println(money);
        }

    }
}
