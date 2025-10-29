package h2;

public class H2_main {
	public static void main(String args[]) {
		
		int i=2, j=4, k=6;
	    int min,max;
		
		 min = i;
		if (min>j)
			min=j;
		if (min>k)
			min=k;
		
		max = i;
		if (max<j)
			max=j;
		if (max<k)
			max=k;

		System.out.println ("min : " + min);
		System.out.println ("max : " + max);
	}

}
