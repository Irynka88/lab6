import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Імена ідентичні");
        }
        else {
            System.out.println("Імена різні");
        }
    }
}
