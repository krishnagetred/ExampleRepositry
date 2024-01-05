package Basicjava;

public class ReverseSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name ="krishna";
     int leng = name.length()
;
     String rev ="";
     for(int i =leng-1;i>=0;i--)
     {
    	 rev = rev +name.charAt(i);
     }
     System.out.println("reverce of " + name + "is " +rev);
	}

}
