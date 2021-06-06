import java.util.*;

public class Calc {
    public static void main(String[] args) {
        double a = getFirstOperand();
        char act = getOperation();
        double b = getSecondOperand();
        System.out.println("Выполнено следующее действие: " + a + " " + act + " " + b + " = " + calculate(a, act, b));
        System.out.println(5/2d);
        System.out.println("Введен второй операнд: " + getSecondOperand());    }

        public static int getFirstOperand() {
        System.out.println("Пожалуйста, введите первый целочисленный операнд:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
        public static int getSecondOperand() {
        System.out.println("Пожалуйста, введите второй целочисленный операнд:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
        public static char getOperation() {
        System.out.println("Пожалуйста, введите матеатическое действие (+,-,* или /):");
            System.out.println("Пожалуйста, введите матеатическое действие (+,-,* или /):");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
        public static double calculate(double a1, char act1, double b1) {
        double res = 0;
        switch (act1) {
            case '+':
                res = (a1 + b1);
                break;
            case '-':
                res = a1 - b1;
                break;
            case '*':
                res =  a1 * b1;
                break;
            case '/':
                res =  (a1 / b1);
                break;
            default:
                System.out.println("Неверно указана математическая операция!");
        }
        return (double) res;
    }}
