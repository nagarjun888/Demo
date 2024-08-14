package Gitpack;

import org.testng.annotations.Test;

public class Demo1 
{
@Test
public void reverese() {
	
	String name="mahath";
	String rev="";
	for (int i = name.length()-1; i >=0; i--) {
		 rev= rev+name.charAt(i);
		
	}
	System.out.println(rev);
}
}
