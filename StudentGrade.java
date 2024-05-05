import java.util.Scanner;
import java.util.Arrays;


public class StudentGrade {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int i = 0;
	int students;
	int subjects;
	int j;
	int total = 0;
	int m;
	int y;
	int z;
	int average = 0;

	System.out.println("How many students do you have");
	students = scanner.nextInt();

	System.out.println("How many subject do they offer");
	subjects = scanner.nextInt();

	System.out.println();

	int[][] collection = new int[students][subjects];

	int scores;
	int collect = 0;

	int[] tots = new int[students];
	int[] ave = new int[students]; 
	
	for (i = 0; i < students; i++) {
	for (j = 0; j < subjects; j++) {	
	System.out.printf("Entering Score for student %d%n", 1+i);
	System.out.printf("Enter Score for subject %d%n", 1+j);
		 collect = scanner.nextInt();
		total += collect;
		collection[i][j] = collect;
	
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Succesfully");

	System.out.println();
	
	

   }
	average = total / subjects;
	tots[i] = total;
	ave[i] = average;
	total = 0;

	
	
	





}	
		


	System.out.println("======================================================================================================");
	
	System.out.print("STUDENT" + "\t\t");

		for (m = 1; m <= subjects; m++) {
	System.out.printf("%s%d\t", "Sub", m);
	}
		

	System.out.print("TOT" + "\t" + "AVE" + "\t" + "POS");

	System.out.println();	
	
	System.out.println("====================================================================================================");

	for(y = 0; y < students; y++) {
	System.out.print("Students" + (1+y) + "\t");
        for(m = 0; m < subjects; m++) { 
	System.out.printf("%d\t", collection[y][m]);
	}
	System.out.print(tots[y] + "\t");
	System.out.print(ave[y]);
	
	
     System.out.println();
     }
   	

	
		
	
	 


	
}
}