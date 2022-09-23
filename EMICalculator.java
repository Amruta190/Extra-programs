import java.util.*;
public class EMICalculator {
    public static void main(String[] args) {
        double rate=0.10;
        rate=rate/(12*100);
        double durationInYears=10*12;
        double loanAmount=(10000*rate*Math.pow(1+rate,durationInYears))/(Math.pow(1+rate,durationInYears)-1);
        System.out.println(loanAmount);
    }
}
