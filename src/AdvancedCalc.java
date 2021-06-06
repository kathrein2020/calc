import java.util.*;
public class AdvancedCalc extends Calc {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        boolean isExit = true;
        do {
            System.out.println("Введите математическую операцию (+,-,* или /), либо управляющую команду" +
                    " (s-выход из калькулятора, c - очистить результаты :");
            Scanner scanner = new Scanner(System.in);
            char act = scanner.next().charAt(0);
            switch (act) {
                case 's': {
                    System.exit(0);
                }
                case 'c': {
                    a = 0;
                    b = 0;
                    System.out.println("Очистка операндов: a=" + a + ": b=" + b);
                    isExit = false;
                    break;
                }
                default:
                    b = getSecondOperand();
                    a =  calculate(a ,act, b);
                    System.out.println("Результат: " + a);
                    isExit = false;
                    break;
            }
        }
        while (isExit = true);
    }
}
