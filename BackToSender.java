	public class BackToSender{
	public static int llc(int collectionRate) {
	
        int amountPerPercel = 0;
        int basePay = 0;
        int total = 0;

        if (collectionRate >= 70) {
         amountPerPercel = 500;
         basePay = 5000;
        }

       else if (collectionRate >= 60 & collectionRate <= 69) {
                  amountPerPercel = 250;
                  basePay = 5000;
                }

       else if (collectionRate >= 50 & collectionRate <= 59) {
                  amountPerPercel = 200;
                  basePay = 5000;
                }

      else if (collectionRate < 50) {
                  amountPerPercel = 160;
                  basePay = 5000;
                }

    total = collectionRate * amountPerPercel + basePay;

return total;

}
}
         



               



