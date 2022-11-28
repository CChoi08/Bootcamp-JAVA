public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 3.5;
        double cappuccinoPrice = 4.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);

        // if statement to chek the status of order
        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam ordered 2 lattes, print message to display total | then use if statement to print appropriate
        // order status message. Change the isReady flag value from true to false to test your control logic
        System.out.println(displayTotalMessage + (lattePrice * 2));
        if(isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println("Thank you, " + customer2 + pendingMessage);
        }

        // Jimmy realized he was charged for a coffee but ordered a latte. Print total message with the new
        // calculated total (what he owes) to make up the difference
        System.out.println(displayTotalMessage +(lattePrice - dripPrice));
    }
}