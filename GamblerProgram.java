###Welcome Message###

import static gambler.GambleProraming.gambleGame;
import java.util.Scanner;

public class GamblerProgram
{
       static final int StakeMoney=100; //Initiaze the Constant Variable
       static final int BetMoney=1;

       static int Month_Loss=0; //instance variable
       static int Month_Win=0;

       static Scanner scan=new Scanner(System.in);
       public static void gamblerGame()
       {
          System.out.println("Enter the days");
          int Num_of_Days=scan.nextInt();

          for(int day=1;day<=Num_of_Days;day++)
          {
               int StakeMoney=100;
               while(StakeMoney>50 && StakeMoney<150)
               {
               int Random = (int)Math.round(Math.random()*1+1);

                     if(Random == 1)
                     {
                     StakeMoney++;
                     }
                     else
                     {
                     StakeMoney--; 
                     }
                }
                if(StakeMoney == 50)
                {
                System.out.println("He Lost Money = "+StakeMoney+" Day ="+day);
                Month_Loss += 50;
                }
                else
                {
                System.out.println("He won Money = "+(StakeMoney-100)+" Day = "+day);
                month_Win += 50;
                }
            }
          System.out.println("<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>");
          System.out.println("Maximunm Loss in Month = "+Month_Loss);
          System.out.println("Maximunm Profit in Month = "+Month_Win);
          System.out.println("<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>");
          if(Month_Loss > Month_Win)
          {
           System.out.println("Loss in the months"+(Month_Loss - Month_Win));
          }
          else if(Month_Loss == Month_Win)
          {
           System.out.println("Equal in the months_Win"+Month_Win+"month_Loss"+ Month_Loss);
          }
          else
          {
           System.out.println("profit in the months"+(Month_Win - Month_Loss));
          }
      }

       public static void main(String args[])
       {
           gamblerGame();
       }

}
