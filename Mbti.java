import java.util.Scanner;

public class Mbti {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int selectionA1 = 0;
	int selectionB1 = 0;
	int selectionA2 = 0;
	int selectionB2 = 0;
	int selectionA3 = 0;
	int selectionB3 = 0;
	int selectionA4 = 0;
	int selectionB4 = 0;	

	System.out.println("What is your name");
	String name = scanner.nextLine();

	//Extroverted Vs Introverted questions

	System.out.println("A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one");
	char question1 = scanner.next().charAt(0);

	if (question1 == 'A' | question1 == 'a') {
	selectionA1++;
	}
	
	else if (question1 == 'B' | question1 == 'b') {
	selectionB1++;
	}

	else if (question1 !='A' | question1 !='a' | question1 !='B' | question1 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	
	System.out.println("A. More outgoing, think out loud         B. More reserved, think to yourself");
	char question2 = scanner.next().charAt(0);

	if (question2 == 'A' | question2 == 'a') {
	selectionA1++;
	}
	
	else if (question2 == 'B' | question2 == 'b') {
	selectionB1++;
	}

	else if (question2 !='A' | question2 !='a' | question2 !='B' | question2 !='b') {
		System.out.println("Error expected A or B as a respose");
	}


	System.out.println("A. Seek many tasks, Public activities, Interation with Others         B. Seek private, Solitary activities with quiet to concentrate");
	char question3 = scanner.next().charAt(0);

	if (question3 == 'A' | question3 == 'a') {
	selectionA1++;
	}
	
	else if (question3 == 'B' | question3 == 'b') {
	selectionB1++;
	}

	else if (question3 !='A' | question3 !='a' | question3 !='B' | question3 !='b') {
		System.out.println("Error expected A or B as a respose");
	}


	System.out.println("A. External, Communicate, Express yourself         B. Internal, Reticient, keep to yourself");
	char question4 = scanner.next().charAt(0);

	if (question4 == 'A' | question4 == 'a') {
	selectionA1++;
	}
	
	else if (question4 == 'B' | question4 == 'b') {
	selectionB1++;
	}

	else if (question4 !='A' | question4 !='a' | question4 !='B' | question4 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Active, Initiate         B. Reflective, Deliberate");
	char question5 = scanner.next().charAt(0);

	if (question5 == 'A' | question5 == 'a') {
	selectionA1++;
	}
	
	else if (question5 == 'B' | question5 == 'b') {
	selectionB1++;
	}

	else if (question5 !='A' | question5 !='a' | question5 !='B' | question5 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("Number of A selected is: " + selectionA1);
	System.out.println("Number of B selected is: " + selectionB1);

	//Sensing Vs Intuitive

	System.out.println("A. Intercept literally         B. Look for meaning and possibility");
	char question6 = scanner.next().charAt(0);

	if (question6 == 'A' | question6 == 'a') {
	selectionA2++;
	}
	
	else if (question6 == 'B' | question6 == 'b') {
	selectionB2++;
	}

	else if (question6 !='A' | question6 !='a' | question6 !='B' | question6 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Practical, realistic, experiential         B. Imaginative, Inovative Theoretical");
	char question7 = scanner.next().charAt(0);

	if (question7 == 'A' | question7 == 'a') {
	selectionA2++;
	}
	
	else if (question7 == 'B' | question7 == 'b') {
	selectionB2++;
	}

	else if (question7 !='A' | question7 !='a' | question7 !='B' | question7 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Standard, Usual, conventional         B. Different, Novel, Unique");
	char question8 = scanner.next().charAt(0);

	if (question8 == 'A' | question8 == 'a') {
	selectionA2++;
	}
	
	else if (question8 == 'B' | question8 == 'b') {
	selectionB2++;
	}

	else if (question8 !='A' | question8 !='a' | question8 !='B' | question8 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Focus on here-and-now, Look at the future         B. Global pespective, Big picture");
	char question9 = scanner.next().charAt(0);

	if (question9 == 'A' | question9 == 'a') {
	selectionA2++;
	}
	
	else if (question9 == 'B' | question9 == 'b') {
	selectionB2++;
	}

	else if (question9 !='A' | question9 !='a' | question9 !='B' | question9 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Facts, Things, What is          B. ideas, dreams, waht could be philosophical ");
	char question10 = scanner.next().charAt(0);

	if (question10 == 'A' | question10 == 'a') {
	selectionA2++;
	}
	
	else if (question10 == 'B' | question10 == 'b') {
	selectionB2++;
	}

	else if (question10 !='A' | question10 !='a' | question10 !='B' | question10 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("Number of A selected is: " + selectionA2);
	System.out.println("Number of B selected is: " + selectionB2);
	
	//Thinking Vs Feeling

	System.out.println("A. Logical, Thinking, Questioning         B. Empatethic, Feeling, Accomodating");
	char question11 = scanner.next().charAt(0);

	if (question11 == 'A' | question11 == 'a') {
	selectionA3++;
	}
	
	else if (question11 == 'B' | question11 == 'b') {
	selectionB3++;
	}

	else if (question11 !='A' | question11 !='a' | question11 !='B' | question11 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Candid, Straight Forward, Frank         B. Tactful, Kind, Encouraging");
	char question12 = scanner.next().charAt(0);

	if (question12 == 'A' | question12 == 'a') {
	selectionA3++;
	}
	
	else if (question12 == 'B' | question12 == 'b') {
	selectionB3++;
	}

	else if (question12 !='A' | question12 !='a' | question12 !='B' | question12 !='b') {
		System.out.println("Error expected A or B as a respose");
	}
	
	System.out.println("A. Firm, Tend to critisize, Hold the line         B. Gentle, tend to appreciate, conciliate");
	char question13 = scanner.next().charAt(0);

	if (question13 == 'A' | question13 == 'a') {
	selectionA3++;
	}
	
	else if (question13 == 'B' | question13 == 'b') {
	selectionB3++;
	}

	else if (question13 !='A' | question13 !='a' | question13 !='B' | question13 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Tough minded, just         B. Tender Hearted, Merciful");
	char question14 = scanner.next().charAt(0);

	if (question14 == 'A' | question14 == 'a') {
	selectionA3++;
	}
	
	else if (question14 == 'B' | question14 == 'b') {
	selectionB3++;
	}

	else if (question14 !='A' | question14 !='a' | question14 !='B' | question14 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Matter of fact, Issue-Oriented         B. Sensitive, People Oriented, Passionate");
	char question15 = scanner.next().charAt(0);

	if (question15 == 'A' | question15 == 'a') {
	selectionA3++;
	}
	
	else if (question15 == 'B' | question15 == 'b') {
	selectionB3++;
	}

	else if (question15 !='A' | question15 !='a' | question15 !='B' | question15 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("Number of A selected is: " + selectionA3);
	System.out.println("Number of B selected is: " + selectionB3);

	//Judging Vs Perceptive

	System.out.println("A. Organized, Orderly         B. Flexible, Adaptable");
	char question16 = scanner.next().charAt(0);

	if (question16 == 'A' | question16 == 'a') {
	selectionA4++;
	}
	
	else if (question16 == 'B' | question16 == 'b') {
	selectionB4++;
	}

	else if (question16 !='A' | question16 !='a' | question16 !='B' | question16 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Plan, Schedule         B. Unplanned, Spontaneous");
	char question17 = scanner.next().charAt(0);

	if (question17 == 'A' | question17 == 'a') {
	selectionA4++;
	}
	
	else if (question17 == 'B' | question17 == 'b') {
	selectionB4++;
	}

	else if (question17 !='A' | question17 !='a' | question17 !='B' | question17 !='b') {
		System.out.println("Error expected A or B as a respose");
	}
	
	System.out.println("A. Regulated, Structured         B. Easy going, Live and let live");
	char question18 = scanner.next().charAt(0);

	if (question18 == 'A' | question18 == 'a') {
	selectionA4++;
	}
	
	else if (question18 == 'B' | question18 == 'b') {
	selectionB4++;
	}

	else if (question18 !='A' | question18 !='a' | question18 !='B' | question18 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Preparation, Plan ahead         B. Go with the flow, Adapt as you go");
	char question19 = scanner.next().charAt(0);

	if (question19 == 'A' | question19 == 'a') {
	selectionA4++;
	}
	
	else if (question19 == 'B' | question19 == 'b') {
	selectionB4++;
	}

	else if (question19 !='A' | question19 !='a' | question19 !='B' | question19 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("A. Control, Govern         B. Latitude, Freedom");
	char question20 = scanner.next().charAt(0);

	if (question20 == 'A' | question20 == 'a') {
	selectionA4++;
	}
	
	else if (question20 == 'B' | question20 == 'b') {
	selectionB4++;
	}

	else if (question20 !='A' | question20 !='a' | question20 !='B' | question20 !='b') {
		System.out.println("Error expected A or B as a respose");
	}

	System.out.println("Number of A selected is: " + selectionA4);
	System.out.println("Number of B selected is: " + selectionB4);


	if (selectionA1 > selectionB1) {
		System.out.print("E");
		}

	else {
		System.out.print("I");
		}

	if (selectionA2 > selectionB2) {
		System.out.print("S");
		}

	else {
		System.out.print("N");
		}

	if (selectionA3 > selectionB3) {
		System.out.print("T");
		}

	else {
		System.out.print("F");
		}

	if (selectionA4 > selectionB4) {
		System.out.print("J");
		}

	else {
		System.out.print("P");
		}

	



 

















}
}