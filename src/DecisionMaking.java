import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scnr = new Scanner(System.in);
    boolean isEven = false;
    
    System.out.println("Enter your Name :");
    String yourName = scnr.next();
    System.out.println("Enter a integer value between 1 to 100 :");
    int yourChoice = scnr.nextInt();
    
    while(yourChoice<1 || yourChoice >100)
    {
    	System.out.println("Enter a integer value between 1 to 100 :");
        yourChoice = scnr.nextInt();
    }
    
    
    if(yourChoice%2 ==0)
    {
    	isEven = true;
    }
    
    if(!isEven) 
    {
    	if (yourChoice <=60)
    	System.out.println(yourName + ",The number you entered is :" + yourChoice + ".It is Odd" );
    	else
    		System.out.println(yourName + ",The number you entered is :" + yourChoice + ".It is Odd and over 60" );
    }
    else
    {
    	if(yourChoice<=25)
    	{
    		System.out.println(yourName + ",The number you entered is : "  + yourChoice +  ".It is Even and less than 25" );	
    	}
    	else if(yourChoice >=26 && yourChoice <= 60)
    	{
    		System.out.println(yourName + ",The number you entered is " + yourChoice + ".It is Even");
    	}
    	else
    	{
    		System.out.println(yourName + ",The number you entered is " + yourChoice +  ".It is Even and over 60");
    	}    		
    }
    scnr.close();
	}

}
