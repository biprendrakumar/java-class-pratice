import java.util.*;
public class decision1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temp.:");
        int temp = sc.nextInt();
        if(temp <= 0){
            System.out.println("too cold and unsafe");
        } else {
            System.out.println("safe for outdoor");
        }
    }
}