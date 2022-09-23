import java.util.*;
public class CheckMutability {
    private String data;
    private List<Integer> numbers;
    public CheckMutability(String data, List<Integer> numbers)
    {
        this.data = data;
        this.numbers = numbers;
    }
    public void printDetails()
    {
        System.out.println(this.data);
        if(this.numbers==null)
        {
            return;
        }
        for(Integer i:this.numbers)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        String abc = "Hello World";
        List<Integer> numbers = new ArrayList<>();
        numbers = Arrays.asList(1,2,3,4);
        CheckMutability cm = new CheckMutability(abc, numbers);
        cm.printDetails();
        abc = "Hello Home";
        numbers = Arrays.asList(1,2,3,5);
        cm.printDetails();
    }
}
