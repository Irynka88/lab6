import java.util.Scanner;
public class Task2 {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введіть слово №" + i + ": ");
            String word = sc.nextLine();
            String firstLetter = word.substring(0, 1);
            System.out.println("Перша літера слова №" + i + " - " + firstLetter);
        }
    }
}
