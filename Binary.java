package Assignment;
import java.util.*;

public class Binary { 
	public static void main(String args[])
	{ 
		System.out.println("Enter a how many number you want to add?");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		HashMap<Integer,List<Integer>> m=new HashMap<>();
		List<Integer> l=new ArrayList<>();
		List<Integer>p=new ArrayList<>();
		m.put(0, l);
		m.put(1, p);
		
		System.out.println(m);
		
		while(x>0)
		{ 
			
			int n = scn.nextInt();
			int i=n >> 0;
			if((i&1)==0)
			{ 
				System.out.println(n+" "+(i&1));
				//if(m.containsKey(0))
				//{ 
					m.get(0).add(n);
				
				//}
				//else 
					//m.put(0, l);
			}
			else 
			{ 
				System.out.println(n+" "+(i&1));
				//if(m.containsKey(1))
				//{ 
					m.get(1).add(n);
				
				//}
				//else 
					//m.put(1, p);
			
			
			}
			x=x-1;
			
			
		
		
		}
		System.out.println(m);
		
		
		
		
		
	}

}
