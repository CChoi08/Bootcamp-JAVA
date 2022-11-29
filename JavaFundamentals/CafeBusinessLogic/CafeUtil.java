import java.util.ArrayList;

class CafeUtil {


    // implement a reward system for customers, write a method that sums
    // together every consecutive integer from 1 to 10 and returns a sum
    int getStreakGoal(int numWeeks) {
        int sum = 0;

        // ninja bonus - add a parameter numWeeks so that admin can change
        // the number from 10 to whatever they want
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }


    // given an array of item prices from an order, sum all of the prices
    // and return the total
    double getOrderTotal(double[]prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }


    // given ArrayList of menu items (strings), print out each index and
    // menu item
    void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }


    // adding a customer
    void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");

        // add this line of code to get user input from the terminal and
        // store it in a variable userName
        String userName = System.console().readLine();

        System.out.println("Hello " + userName + "!");
        System.out.println("There are " + customers.size() + 
                            " people in front of you");
        customers.add(userName);
    }
}