import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i=0; i <= 10; i++){
            sum += i;
        }
        return sum;
    }


    public void printPriceChart(String name, double price, int maxNumber){
        System.out.println(name);
        // System.out.println(price);
        // System.out.println(maxNumber);
        double sum =price;
        for(int i=1; i<= maxNumber; i++){
            System.out.println(i + " - $" +  sum * i);
        }

    }


    public double getOrderTotal(double[] line){
        System.out.println(Arrays.toString(line));
        double sum = 0.0;
        for(int i =0; i<line.length; i++){
            // System.out.println(line[i]);
            sum = sum + line[i];
            System.out.println(sum);
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices){
            // System.out.println(menu);
            // System.out.println(prices);
        for (int i =0; i < menu.size(); i++){
            System.out.println(i+1 + " " + menu.get(i) + " -- $" + prices.get(i));
        }
    }

    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("what is your name?");
        String userName = System.console().readLine();
        // System.out.println("your name is = " + userName);
        customers.add(userName);
        System.out.println("you have " + (customers.size() - 1) + " ahead of you");
    }
}