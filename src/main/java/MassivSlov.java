import java.util.Scanner;

public class MassivSlov {
    public static void mas()/*main(String[] args)*/ {
        int y = 0;
        double t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива");
        int razmerMassiva = scanner.nextInt();
        String massiv[] = new String[razmerMassiva];
        for (int i = 0; i < razmerMassiva; i++) {
            System.out.println("Введите " + (i + 1) + " слово");
            massiv[i] = scanner.next();
        }
        scanner.close();
        for (int u = 0; u < razmerMassiva; u++) {
            y = massiv[u].length() + y;
        }
        t = (double) y / razmerMassiva;
        for (int r = 0; r < razmerMassiva; r++) {
            if (massiv[r].length() >= t) {
                System.out.println(massiv[r] + " " + (r+1)+"слово самое длинное");
            }
        }
    }
}
