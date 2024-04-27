import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class SemicolonStore {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int count = 0;

double subTotal = 0; 

Date date = new Date();

String addItems = null;

     ArrayList<String> items = new ArrayList<String>();

     ArrayList<Integer> price = new ArrayList<Integer>();

     ArrayList<Integer> quantity = new ArrayList<Integer>();

     ArrayList<Integer> sum = new ArrayList<Integer>();

System.out.println("What is the customer's Name");
String customerName = scanner.nextLine();


 do { 
     System.out.println("What Did The User Buy");
     String userBuys = scanner.nextLine();

     System.out.println("How Many pieces");
     int pieces = scanner.nextInt();

     System.out.println("How Much Per Unit");
     int perUnits = scanner.nextInt();

     int total = pieces * perUnits;
	
     System.out.println("Add More Items");
     scanner.nextLine();
     addItems = scanner.nextLine();


         items.add(userBuys);

	 quantity.add(pieces);

	 price.add(perUnits);
 
         sum.add(total);

     if(addItems.equals("no")){
	 break;}

     } while(addItems.equals("yes"));
          
    
         System.out.println("What is your name(cashier name)?");         
         String cashierName = scanner.nextLine();

         System.out.println("How Much Discount wil He Get");
         double percentageDiscount = scanner.nextInt(); 

         System.out.println("How much Did The Customer Give You");
         double paid = scanner.nextDouble();
          
    
	String Prompt = """

              SEMICOLON STORES

              MAIN BRANCH
              
              LOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS.
 
              TELL: 03293828343
              
              """;
             
                     
         

System.out.println(Prompt);

System.out.println(date);

System.out.println("Cashier Name: " + cashierName);

System.out.println("Customer Name: "  + customerName);


System.out.println("===========================================================================");
                           
System.out.println("ITEM" + "\t\t" + "QUantity" + "\t\t"  + "PRICE" + "\t\t" + "TOTAL");

System.out.println("---------------------------------------------------------------------------");
  
                  
 for (count = 0; count < items.size(); count++) {
      System.out.println(items.get(count) + "\t\t" + quantity.get(count) + "\t\t" + price.get(count) + "\t\t" + sum.get(count));
	 subTotal += sum.get(count);
            }

         double discount = (percentageDiscount * subTotal) / 100;

         double vat = 17.50 / 100 * subTotal;

         double billTotal = subTotal + discount + vat; 
      
         double balance = paid - billTotal;         

    
System.out.println("-------------------------------------------------------------------------------");

System.out.printf("\t\tSubtotal: \t\t%.2f%n", subTotal);

System.out.printf("\t\tDiscount: \t\t%.2f%n", discount);

System.out.printf("\t\tVAT  @17.50 : \t\t%.2f%n", vat);

System.out.println("===============================================================================");

System.out.printf("Bill Total:                                %.2f%n", billTotal);

System.out.printf("Amount Paid:                               %.2f%n", paid);

System.out.printf("Balance:                                   %.2f%n", balance);

System.out.println("================================ ==============================================");

System.out.printf("ThIS IS NOT A RECEIPT KINDLY PAY %.2f%n", billTotal);

System.out.println("===============================================================================");





   }         
}

             
