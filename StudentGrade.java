import java.util.Scanner;
import java.util.Arrays;


public class StudentGrade {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int i = 1;
	int students = 0;
	int subjects = 0;
	int j = 0;
	int total = 0;
         
	System.out.println("How many students do you have");
	students = scanner.nextInt();

	System.out.println("How many subject do they offer");
	subjects = scanner.nextInt();

	System.out.println();

        int[][] collection = new int[students][subjects];   

	for (i = 0; i < students; i++) {
	for (j = 0; j < subjects; j++) {
	System.out.printf("Entering Score for student %d%n", i+1);
	System.out.printf("Enter Score for subject %d%n", j +1);
		   collection[i][j] = scanner.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Succesfully");

	System.out.println();

	total = total + subjects;
	int average = total / subjects;	

   }
}


		 		

	System.out.println("======================================================================================================");
	
	System.out.print("STUDENT" + "\t");

		for (int m = 1; m <= subjects; m++) {
	System.out.printf("%5s ","Sub" +m);
	}

	System.out.printf("%4s%5s%5s", "TOT", "AVE", "POS");

	System.out.println();	
	
	System.out.println("====================================================================================================");

	for (int g = 0; g < collection.length; g++) {

	for (int t = 0; t < collection[students].length; t++) {
	
	System.out.println(collection[students][subjects] + "  ");
	
     System.out.println();
         }
	}


}
}