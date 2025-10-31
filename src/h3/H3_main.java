package h3;

public class H3_main {

	public static void main(String args[]) {
		
		int i=8, j=6, k=-10;
		// System.out.println(z);
		
		boolean ausdruck1,ausdruck2,ausdruck3;
		
		if (i>j)
			ausdruck1= true;
		else
			ausdruck1 = false;
		
		if (i>200)
			ausdruck2= true;
		else
			ausdruck2 = false;
		
		if (j>100)
			ausdruck3= true;
		else
			ausdruck3 = false;
		
		if (ausdruck1 & ausdruck2 & ausdruck3) 
			k=3;
		
		if (ausdruck1 & ausdruck2 & !ausdruck3) 
			k=2;
		
		if (ausdruck1 & !ausdruck2 & !ausdruck3) 
			k=1;
		
		if (!ausdruck1 & !ausdruck2 & !ausdruck3) 
			k=4;
		
		System.out.println((k ));
	}
}