package Basicjava;

public class StringOne {

	/* Driver Code */
	public static void main(String args[]) {
		String text = new String("Hello, My name is Sachin");
		/* Splits the sentence by the delimeter passed as an argument */
		String[] sentences = text.split("\\.");
		System.out.println(text);
		
		//System.out.println(Array.toString(sentence));
	}
}
