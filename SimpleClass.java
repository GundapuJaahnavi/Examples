import java.util.*;

public class SimpleClass {
    public static void main(String[] args){
        System.out.println("Hello world!!");
        Scanner c = new Scanner(System.in);
        System.out.println("Enter a number:");
        Integer number= c.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " Is an even digit");
        }
        else {
            System.out.println(number + " Is an odd digit");
        }

    }
}
