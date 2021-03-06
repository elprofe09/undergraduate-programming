/*
 * Here is a starting point for your Matrix tester. You will have to fill in the rest of "main" with
 * more code to sufficiently test your Matrix class. We will be using our own MatrixTester for grading. 
*/
package lab02;

public class MatrixTester {
	public static void main(String[] args)
	{	
		//Experiment 1
		//Matrix M1 = new Matrix(2, 3);
		
		//Experiment 2 - do not uncomment before you finish the steps required
		//Matrix M1 = new Matrix(); // I am not getting a complie error
		
		//Experiment 3
		//Matrix M1 = new Matrix(new int[][]
       //         {{1, 2, 3},
		//		  {2, 5, 6}});		
		
		/*
		 * This is another example Matrix you can try 
		*/
		Matrix M2 = new Matrix(new int[][]
		                                 {{4, 5},
										  {3, 2},
										  {1, 1}});
		
		Matrix M3 = M2.transpose();
		System.out.println(M3);
		
		/* 
		 * Note that the print will not be correct until you have implemented the toString method.
		 * This is just one example of a test of making sure your constructor is working
		 * You should write more test and experiment with various constructor cases
		 */
		
		System.out.println("M2 is: " +'\n'+ M2 + "done.");		
	}
}
