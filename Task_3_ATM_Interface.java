import java.io.*;
import java.lang.*;
class Task_3_ATM_Interface
{
      public static void main(String args[])
    {
	int c,g,achn,n,m,i;
	Double acno,acno1,id,sal,rem,bal,w,d,dd;
	String  name,add,occu,pass="TYCM",check,m1;
	
     BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
     try
     {
        n=pass.length();
        StringBuffer p=new StringBuffer(pass);
        System.out.println("enter the password=");
        check=ob.readLine();
        m=check.length();
       //if(pass.compareTo(check)==0)         //bydefault.compare to(user define)
	if(check.equals(pass))          //user define.equals(bydefault)
        {
           System.out.println("password is correct");
		   do
	{
		 
  
		System.out.print("\n\tEnter your details....");
		
		System.out.print("\n\t account number:=");
	    acno=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t account holder name:");
	    name=ob.readLine();
		
		System.out.print("\n\t enter account holder address:");
	    add=ob.readLine();
	
		System.out.print("\n\t enter account holder occupation:");
	    occu=ob.readLine();
		
		System.out.print("\n\t account holder contact number:=");
	    achn=Integer.parseInt(ob.readLine());
		
		System.out.print("\n\t enter balance:=");
	    bal=Double.parseDouble(ob.readLine());
		
	
		System.out.print("\n\tenter your choice:");
		System.out.print("\n\t1]Withdraw\n\t2]Deposit\n\t3]Transfer\n\t4]quit:");
		System.out.print("\n\tenter 1/3\t\t");
		c=Integer.parseInt(ob.readLine());
		
		
		switch(c)
		{
		case 1:
		{
		System.out.println("\n\tu want to Withdraw Amount...");
		
		System.out.println("\n\t enter withdraw:=");
	    w=Double.parseDouble(ob.readLine());
		
		System.out.println("\n\t=============================================================================");
		System.out.print("\n\t\t\tALL IN ONE ATM\t\t");
		System.out.print("\n\tABCD CHOWK,COMPUTER MARKET,PUNE-410014");
		System.out.print("\n\tCONTACT :1234567890\tBRANCH:PUNE");
		System.out.print("\n\t-------------------------------------------------------------------------------");
		System.out.print("\n\tACC HOLDER INFO:");
		System.out.print("\n\tACC.HOLDER NAME 	:"+name);
		System.out.print("\n\tACC.HOLDER OCCUPATION   :"+occu);
		System.out.print("\n\tACC.IFSC  CODE  	:HDFC0CNAG08");
		System.out.print("\n\tACC.HOLDER ADDRESS 	:"+add);
		System.out.print("\n\tCONTACT NUMBER 	        :"+achn);
		System.out.print("\n\tACC.BANK BALANCE        :"+bal);
		System.out.print("\n\t-----------------------------------------------------------------------------");

		if(w<bal)
		{
		rem=bal-w;
		System.out.print("\n\tAfter Withdraw Your Balance is...:"+rem+"rs.");
		}
		else
		{
		System.out.print("\n\tbank balance is less :");
		}
		System.out.println("\n\t=============================================================================");
		}
		break;
		case 2:
		{
		System.out.println("\n\tu want to Deposit Amount...");
		
		System.out.println("\n\t enter Deposit:=");
	    d=Double.parseDouble(ob.readLine());

		System.out.println("\n\t=============================================================================");
		System.out.print("\n\t\t\tALL IN ONE ATM\t\t");
		System.out.print("\n\tABCD CHOWK,COMPUTER MARKET,PUNE-410014");
		System.out.print("\n\tCONTACT :1234567890\tBRANCH:PUNE");
		System.out.print("\n\t-------------------------------------------------------------------------------");
		System.out.print("\n\tACC HOLDER INFO:");
		System.out.print("\n\tACC.HOLDER NAME 	:"+name);
		System.out.print("\n\tACC.HOLDER OCCUPATION   :"+occu);
		System.out.print("\n\tACC.IFSC  CODE  	:HDFC0CNAG08");
		System.out.print("\n\tACC.HOLDER ADDRESS 	:"+add);
		System.out.print("\n\tCONTACT NUMBER 	        :"+achn);
		System.out.print("\n\tACC.BANK BALANCE        :"+bal);
		System.out.print("\n\t-----------------------------------------------------------------------------");
	
		rem=bal+d;
		System.out.print("\n\tAfter Deposit Your Balance is...:"+rem+"rs.");
		
		System.out.println("\n\t=============================================================================");
		}
		break;
		case 3:
		{
		System.out.println("\n\tu want to Transfer Amount...");
		
		System.out.print("\n\t enter Amount:=");
	    dd=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\tenter transfer account number:=");
	    acno1=Double.parseDouble(ob.readLine());

		System.out.println("\n\t=============================================================================");
		System.out.print("\n\t\t\tALL IN ONE ATM\t\t");
		System.out.print("\n\tABCD CHOWK,COMPUTER MARKET,PUNE-410014");
		System.out.print("\n\tCONTACT :1234567890\tBRANCH:PUNE");
		System.out.print("\n\t-------------------------------------------------------------------------------");
		System.out.print("\n\tACC HOLDER INFO:");
		System.out.print("\n\tACC.HOLDER NAME 	:"+name);
		System.out.print("\n\tACC.HOLDER OCCUPATION   :"+occu);
		System.out.print("\n\tACC.IFSC  CODE  	:HDFC0CNAG08");
		System.out.print("\n\tACC.HOLDER ADDRESS 	:"+add);
		System.out.print("\n\tCONTACT NUMBER 	        :"+achn);
		System.out.print("\n\tACC.BANK BALANCE        :"+bal);
		System.out.print("\n\tTRANSFER BALANCE        :"+dd);
		System.out.print("\n\tTRANSFER ACC_NO		:"+acno1);
		System.out.print("\n\t-----------------------------------------------------------------------------");
	
		if(dd<bal)
		{
		rem=bal-dd;
		System.out.print("\n\tAfter Transfer of Amount Your Balance is...:"+rem+"rs.");
		}
		else
		{
		System.out.print("\n\tbank balance is less :");
		}
		
		System.out.println("\n\t=============================================================================");
		}
		break;
		default:
		System.out.println("\n\t-------------------------------------------------------");
		System.out.println("\n\tquit....");
		System.out.println("\n\t-------------------------------------------------------");
		}
	   System.out.print("\n\tdo u want to continue...(yes=1/no=0) :");
	   g=Integer.parseInt(ob.readLine());
	}while(g==1);
		}  
  

else
        {
           System.out.println("Invalid password....try again");
        }
     }catch(Exception e){}
   }
}

