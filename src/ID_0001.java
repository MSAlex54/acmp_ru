//A+B
//(Время: 1 сек. Память: 16 Мб Сложность: 2%)
//Требуется сложить два целых числа А и В.
//
//Входные данные
//В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.
//
//Выходные данные
//В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.
import java.util.Scanner;
public class ID_0001 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print(i.nextInt()+i.nextInt());
    }
}
