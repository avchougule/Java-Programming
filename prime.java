import java.util.Scanner;
public class prime {
    public static void main(String[] args) 
	{
		int count;
        Scanner sc=new Scanner(System.in); 
        int A=sc.nextInt();
		
		System.out.println(" Prime Numbers are: ");	
		for(int no = 1; no <=A; no++)
		{
			count = 0;
		    for (int i=2; i<=no/2; i++)
		    {
		    	if(no % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && no != 1 )
		    {
		    	System.out.print(no + " ");
		    }  
		}
	}
}
    

