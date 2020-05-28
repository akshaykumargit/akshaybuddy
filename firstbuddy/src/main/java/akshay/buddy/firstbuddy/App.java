package akshay.buddy.firstbuddy;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to SI calculator" );
        
        //mention amount, years and rate of interest
        double result = SimpleInterest.calculateSimpleInterest(10000, 5, 7);
        System.out.println("The simple interest is:" + result);
    }
}
