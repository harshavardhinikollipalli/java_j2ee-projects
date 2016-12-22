package cricket;

import java.util.*;

class CricketODI

{

public static void main(String[] args)

{

Scanner s=new Scanner(System.in);

CricketClass.Team1 te1=new CricketClass().new Team1();

CricketClass.Team2 te2=new CricketClass().new Team2();

String t1=te1.teamName();

String t2=te2.teamName();



System.out.println("Welcome to ONE DAY INTERNATIONAL CRICKET");

System.out.println("----------------------------------------");

System.out.println(t1 + " v/s " + t2);

System.out.println("Enter Weather Condition :");

System.out.println(" 1. Rainy \n 2. No Rain Start The Match \n");

System.out.println("----------------------------------------");

int choice=s.nextInt();

CricketClass.NoRain cr=new CricketClass(). new NoRain();

try

{

cr.choiceCondition(choice,t1,t2);

}

catch(Exception e)
{
}

}

}

