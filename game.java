import java.util.Scanner;

public class Main{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int mynum = (int)(Math.random()*100);
int usernum = 0;

  do {
      System.out.println("Guess my number:");
      usernum = sc.nextInt();
  
      
      if(usernum == mynum){
          System.out.println("WOOOHOOO....Coreect number");
          break;
      }
          
      else if(usernum>mynum){
        System.out.println("Number is too large ");
    }
    else{
        System.out.println("Number is too small");
    }
    }
    while(usernum>=0);
      
      
      System.out.print("My number was : ");
      System.out.println(mynum);
  }
    }
    

