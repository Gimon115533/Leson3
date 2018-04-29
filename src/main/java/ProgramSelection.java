import java.util.Scanner;

public class ProgramSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 если Вы хотите запустить Калькулятор или 2 для ввода Массива слов");
        byte e = scanner.nextByte();
        if (e == 1) {
            Calculator2 calculator2 = new Calculator2();
            Calculator2.cal();
        }
        if (e == 2) {
            MassivSlov massivSlov = new MassivSlov();
            MassivSlov.mas();
        }
        if ((e != 1) & (e != 2)) {
            System.out.println("Вы ввели " + e);
        }
    }
}

