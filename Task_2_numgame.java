
import java.io.*;
import java.lang.*;
import java.util.*;
public class Task_2_numgame
{
	private static int s=1, e=100;
	
	static int computernumber()
	{
		return (int) Math.floor(Math.random()*(s-e+1)+e);
	}
	public static void numgame()
	{
		int g,k=100;
		String  name;
		
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		try{
				
			do{
			System.out.print("Enter your name : ");
			name=ob.readLine();
			
			int cno=computernumber();
			
			int i,player;
			System.out.println("Hello "+name+"...");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Hey "+name+" The system generates the random number from 0 to 100.");
			System.out.println("Guess the number generated by the system");
			System.out.println("All The Best!");
			System.out.println("-------------------------------------------------------------------");
		
			for(i=0;i<k;i++)
			{
				System.out.println("Enter your number:");
				
				player= Integer.parseInt(ob.readLine());
				
				if(cno==player)
				{
					System.out.println("congratulations "+name+" you guessed the correct number.");
					System.out.println("-------------------------------------------------------------------");
					break;
				}
				else if(cno>player)
				{
					 System.out.println("Your No. is Small than computer No.");
				}
				else if(cno<player)
				{
					 System.out.println("Your No. is Big than computer No.");
				}
	
			}
			  System.out.println("Hey "+name+" you guess the no. in "+i+" itterations");
			
			 System.out.println("\n\tdo u want to continue...(yes=1/no=0) :");
	   	
			g=Integer.parseInt(ob.readLine());
			
		}
		while(g==1);
		}catch(IOException e){}
	}

public static void main(String args[])
	{
	numgame();
	}
	

}		