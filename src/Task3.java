import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 1-ше дробове число:");
        if(scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
            System.out.println("Введіть 2-ге дробове число:");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                System.out.println("Введіть 3-тє число");
                if (scanner.hasNextDouble()) {
                    num3 = scanner.nextDouble();
                    if(num1 > num2 && num1 > num3){
                        System.out.println("Перше число найбільше");
                    }
                    if(num2 > num1 && num2 > num3){
                        System.out.println("Друге число найбільше");
                    }
                    if(num3 > num2 && num3 > num1){
                        System.out.println("Третє число найбільше");
                    }
                    if(num1 > num2 && num1 == num3){
                        System.out.println("Перше і третє число найбільше");
                    }
                    if(num1 > num3 && num1 == num2){
                        System.out.println("Перше і друге число найбільше");
                    }
                    if(num2 > num1 && num2 == num3){
                        System.out.println("Друге і третє число найбільше");
                    }
                    if(num1 == num2 && num2  == num3) {
                        System.out.println("Всі числа рівні");
                    }
                } else {
                    System.out.println("Ви ввели не число");
                }
            } else {
                System.out.println("Ви ввели не число");
            }
        }
        else {
            System.out.println("Ви ввели не число");
        }

    }
}
