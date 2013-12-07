public class swapnumbers {
   
	public static void main(String[] args) {
        //set up variables to be swapped
		int a = 3;
		int b = 5;
		
		//output inital values
		System.out.println("A is "+a+" and B is "+b);
		
		//B is added to A and stored in A
		a = a + b; 
		System.out.println("A is "+a+" and B is "+b);
		//a  = 8 b = 3

		//B is substracted from A and stored in B
		b = a - b;
		System.out.println("A is "+a+" and B is "+b);
		//a  = 8 b = 3

		//Finaly b is substracted from a and stored in A
		a = a - b;
		System.out.println("A is "+a+" and B is "+b);
		//a  = 5 b = 3
		
		


		
       }
 
    
}