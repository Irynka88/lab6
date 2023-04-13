import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рядок №1");
        String str1 = sc.nextLine();
        System.out.println("Введіть рядок №2");
        String str2 = sc.nextLine();
        if(str1.length() < str2.length()){
            System.out.println("Рядок №2 містить більше символів");
        }
        else if(str1.length() > str2.length()){
            System.out.println("Рядок №1 містить більше символів");
        }
        else if(str1.length() == str2.length()){
            System.out.println("Рядки містять однакову кількість символів");
        }
    }
}
