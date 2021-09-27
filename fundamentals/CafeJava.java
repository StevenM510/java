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
        double coffeePrice = 2.5;
        double lattePrice = 1.75;
        double cappuccinoPrice = 3.5;
    

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;


        // What Cindhuri orders //
        System.out.println(generalGreeting + customer1 + pendingMessage + readyMessage + " " + isReadyOrder2 + " " + displayTotalMessage +      coffeePrice);


        // What Noah orders //
        System.out.println(generalGreeting + customer4 );

        if( isReadyOrder1 ) {
            System.out.println( customer4 + pendingMessage );
        } else {
            System.out.println( customer4 + readyMessage );
        }

        System.out.println( displayTotalMessage + " " + cappuccinoPrice);


        // What Sam ordered //
        System.out.println(generalGreeting + customer2 );
        System.out.println( displayTotalMessage + " " + (lattePrice + lattePrice));
        
        if( isReadyOrder2) {
            System.out.println( customer2 + readyMessage);
        } else {
            System.out.println( customer2 + pendingMessage);
        }

        // What Jimmy Ordered //
        System.out.println(generalGreeting + customer3 );
        System.out.println( displayTotalMessage + " " + (coffeePrice - lattePrice));
    }
}