import java.util.Scanner;

/**
 * @author Anton
 */
/*Калькулятор
Урок 2
*/
public class Calculator2 {
    public static void cal()/*main(String[] args)*/ {
        String p;
//форматирование числа Pi System.out.printf("%+020.10f", Math.PI);
        Scanner scanner = new Scanner(System.in);
// ввод первого значения
        System.out.println("Введите первое число");
        double o = scanner.nextDouble();
// ввод второго значения
        System.out.println("Введите второе число");
        double i = scanner.nextDouble();
// ввод действия
        System.out.println("Введите действие + - * /");
        p = scanner.next();
        p=(String) p;


// задается переменная сложения
        double sum;// = o + i;
        if ("+".equals(p)){
            sum=o+i;
            System.out.printf("Сумма равна%020.4f", sum);
        }
        else if ("-".equals(p)){
            sum=o-i;
            System.out.printf("Вычитание равно%020.4f", sum);
        }
        else if ("*".equals(p)){
            sum=o*i;
            System.out.printf("Произведение равно%020.4f", sum);
        }
        else if ("/".equals(p)){
            sum=o/i;
            System.out.printf("Результат деления%020.4f", sum);
        }
        else {
            System.out.println("Вы ввели не верное значение: "+ p);
        }
// вывод результата с форматированием
        // System.out.printf("Сумма равна%+020.4f", sum);
// завершение работы сканера
        scanner.close();
    }
}
