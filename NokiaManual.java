import java.util.Scanner;
     
       public class NokiaManual {
       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	 String menu = """

       1 -> Phonebook
       2 -> Messages
       3 -> Chat
       4 -> Call register
       5 -> Tones
       6 -> Settings 
       7 -> Call divert
       8 -> Games
       9 -> Calculator
       10 -> Remainders
       11 -> ClockS
       12 -> Profiles
       13 -> Sim services
       """;

         System.out.println(menu);

	 String phoneBook = """

         1 -> Search
         2 -> Service Nos
         3 -> Add Name 
         4 -> Erase
         5 -> Edit
         6 -> Assign Tone
         7 -> Send b' card 
         8 -> Options 
         9 -> Speed Dials
        10 -> Voice Tags
                """;

         //System.out.println(phoneBook);

	String options = """
	
	1 -> Type of view
	2 -> Memory status 
	""";
	
       //System.out.println(options);

	 String messages = """

       1 -> Write messages
       2 -> Inbox
       3 -> Outbox
       4 -> Picture Message
       5 -> Templates
       6 -> Smileys 
       7 -> Message Settings
       8 -> Info Services
       9 -> Voice Mailbox Number
       10 -> Service Command Editor
       11 -> Back
       """;

         //System.out.println(messages);

	 String messageSettings = """

       1 -> Set
       2 -> Common
       """;

         //System.out.println(messageSettings);

	String set = """

       1 -> Message centre number
       2 -> Message sent as
       3 -> Message Validity
       """;
	//System.out.println(set);

        String common = """

       1 -> Delivery reports
       2 -> Reply via same centre
       3 -> Character support
       """;
	//System.out.println(common);

	 String infoService = """

       1 -> Info Service
       """;
	//System.out.println(infoService);

	 String voiceMailBoxNumber = """

       1 -> Voice Mailbox Number
       """;
	//System.out.println(voiceMailBoxNumber);

	 String serviceCommandEditor = """

       1 -> Service Command Editor
       """;
	//System.out.println(serviceCommandEditor);

	String chat = """
	  1 -> Chat
	""";
	//System.out.println(chat);

	String callRegister = """

       1 -> Missed Calls
       2 -> Recieved calls
       3 -> Dialled numbers
       4 -> Erase recent call lists
	
       """;
	//System.out.println(callRegister);

	String showCallDuration = """

       1 -> Last Call Duration
       2 -> All calls duration
       3 -> Recieved calls duration
       4 -> Dialled calls duration
       5 -> Clear timers	
       """;
	//System.out.println(showCallDuration);

	String showCallCost = """

       1 -> Last Call cost
       2 -> All calls cost
       3 -> Clear Counters
       """;
	//System.out.println(showCallCost);

	String callCostSettings = """

       1 -> Call cost limit
       2 -> Show Cost In
       """;
	//System.out.println(callCostSettings);

	String prepaidCredit = """
	 1 -> PrePaid Credit
	""";
	//System.out.println(prepaidCredit);

	 String tones = """

       1 -> Ringing tone
       2 -> Ringing volume
       3 -> Incoming call alert
       4 -> Composer
       5 -> Message alert tone
       6 -> Keypad tones 
       7 -> Warning and game tones
       8 -> Vibrating alert
       9 -> Screen saver
	""";
	//System.out.println(tones);

	 String settings = """

       1 -> Call settings
       2 -> Phone Settings
       3 -> Security Settings
       4 -> Restore Factory settings
	""";
	//System.out.println(settings);

	String callSettings = """
	
       1 -> Automatic Redial
       2 -> Speed dialing
       3 -> Call waiting options
       4 -> Own number sending
       5 -> Phone line use
       6 -> Automatic answer 
	""";
	//System.out.println(callSettings);

	String phoneSettings = """
	
       1 -> Language
       2 -> Cell info display
       3 -> Welcome note
       4 -> Network Selection
       5 -> Lights
       6 -> Confirm Sim Service Actions 
	""";
	//System.out.println(phoneSettings);

	String securitySettings = """
	
       1 -> PIN code request
       2 -> Call barring service
       3 -> Fixed dialling
       4 -> Closed user group
       5 -> Phone security
       6 -> Change Access codes 
	""";
	//System.out.println(securitySettings);

	String restoreFactorySettings = """
	
         1 -> Restore Factory Settings
	""";
	//System.out.println(restoreFactorySettings);
	
	 String callDivert = """
	
         1 -> Call Divert
	""";
	//System.out.println(callDivert);

	 String games = """
	
         1 -> Game
	""";
	//System.out.println(games);

	 String calculator = """
	
         1 -> Calculator
	""";
	//System.out.println(calculator);

	 String reminder = """
	
         1 -> Reminders
	""";
	//System.out.println(reminder);

	 String clock = """

       1 -> Alarm Clock
       2 -> Clock settings
       3 -> Date setting
       4 -> Stop Wash
       5 -> Countdown Timer
       6 -> Auto update Of Date And Time
	""";
	//System.out.println(clock);

	String profiles = """
	
         1 -> Profiles
	""";
	//System.out.println(profiles);

	String simServices = """
	
         1 -> Sim Services
	""";
	//System.out.println(simServices);

	System.out.println("Enter number");
	int userInput1 = scanner.nextInt();

	switch(userInput1) {
	case 1: System.out.println(phoneBook);
	break;

	case 2: System.out.println(messages);
	break;

	case 3: System.out.println(chat);
	break;

	case 4: System.out.println(callRegister);
	break;

	case 5: System.out.println(tones);
	break;

	case 6: System.out.println(settings);
	break;

	case 7: System.out.println(callDivert);
	break;

	case 8: System.out.println(games);
	break;

	case 9: System.out.println(calculator);
	break;

	case 10: System.out.println(reminder);
	break;

	case 11: System.out.println(clock);
	break;

	case 12: System.out.println(profiles);
	break;

	case 13: System.out.println(simServices);
	break;
         }

	System.out.println("Enter number");
	int userInput2 = scanner.nextInt();

	switch(userInput2) {
	
	case 8: System.out.println(options);
	break;

	case 7: System.out.println(messageSettings);
	break;

	case 4: System.out.println(callRegister);
	break;

	}

	System.out.println("Enter number");
	int userInput9 = scanner.nextInt();

	switch(userInput9) {
        case 1: System.out.println(set);
	break;

	case 2: System.out.println(common);
	break;
	}
	
	System.out.println("Enter number");
	int userInput8 = scanner.nextInt();

	switch(userInput8) {	

	case 5: System.out.println(showCallDuration);
	break;

	case 6: System.out.println(showCallCost);
	break;

	case 7: System.out.println(callCostSettings);
	break;
	}

	


		


}
}