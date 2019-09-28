//Сумма
//(Время: 1 сек. Память: 16 Мб Сложность: 19%)
//Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.
//
//Входные данные
//В единственной строке входного файла INPUT.TXT записано единственное целое число N, не превышающее по абсолютной величине 104.
//
//Выходные данные
//В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел, расположенных между 1 и N включительно.

import java.util.*;

public class ID_0002 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int result = 0;
        int start = 0;
        int finish = 0;
        int a = in.nextInt();
        if (a >= 1) {
            start = 1;
            finish = a;
        } else{
            start = a;
            finish = 1;
        }

        for (int i = start; i <=finish ; i++) {
            result+=i;
        }

        System.out.println(result);
    }
}