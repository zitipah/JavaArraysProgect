package by.itstep.YURY.javalessons;

package by.itstep.YURY.javalessons18.vien.Printer;

import javafx.print.Printer;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print("input size of array;");
            size = scanner.nextInt();
            while (size <= 0) ;

            int[] array = new int[size];
            ArrayInitializer.ramdomInit(array);

            Printer.print(Convertor.toString(array));

          //       logic

            int s = ArrayWorker.sum(array);
            int max = ArrayWorker.max(array);
            int min = ArrayWorker.min(array);
            int avg = ArrayWorker.avg(array);

            String
        }
    }
}
