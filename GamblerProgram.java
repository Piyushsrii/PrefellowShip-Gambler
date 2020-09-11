###Welcome Message###

import static gambler.GambleProraming.gambleGame;
import java.util.Scanner;

public class GamblerProgram
{
       static final int stakeMoney=100; //Initiaze the Constant Variable
       static final int betMoney=1;

       static int month_Loss=0; //instance variable
       static int month_Win=0;

       static Scanner scan=new Scanner(System.in);
       public static void gamblerGame()
       {
          System.out.println("Enter the days");
          int Num_of_Days=scan.nextInt();

          for(int day=1;day<=Num_of_Days;day++)
          {
               int stakeMoney=100;
               while(stakeMoney>50 && stakeMoney<150)
               {
               int random = (int)Math.round(Math.random()*1+1);

                     if(random == 1)
                     {
                     stakeMoney++;
                     }
                     else
                     {
                     stakeMoney--; 
                     }
                }
                if(stakeMoney == 50)
                {
                System.out.println("He Lost Money = "+stakeMoney+" Day ="+day);
                month_Loss += 50;
                UnLuckiestDay++;
                }
                else
                {
                System.out.println("He won Money = "+(stakeMoney-100)+" Day = "+day);
                month_Loss += 50;
                UnLuckiestDay++;
                }
            }
          System.out.println("<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>");
          System.out.println("Maximunm Loss in Month = "+month_Loss);
          System.out.println("Maximunm Profit in Month = "+month_Win);
          System.out.println("<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>");
          if(month_Loss > month_Win)
          {
           System.out.println("Loss in the months"+(month_Loss - month_Win));
          }
          else if(month_Loss == month_Win)
          {
           System.out.println("Equal in the months_Win"+month_Win+"month_Loss"+ month_Loss);
          }
          else
          {
           System.out.println("profit in the months"+(month_Win - month_Loss));
          }
          System.out.println("<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>");
          System.out.println("Luckiest Day is = "+ LuckiestDay);
          System.out.println("UnLuckiest Day is = "+ UnLuckiestDay);
          System.out.println("<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>");
      }

       public static void main(String args[])
       {
           gamblerGame();//Method call

          System.out.println("You want to play again? : If Yes press 0 otherwise press 1");
          int end_Game=scan.nextInt();
          if(end_Game==1)
          {
              System.out.println("Stop the game here");
          }
          else
          {
              System.out.println("For the next month");
              gambleGame();
          }

       }
}
