//Золото племени АББА
//(Время: 1 сек. Память: 16 Мб Сложность: 30%)
//Главный вождь племени Абба не умеет считать. В обмен на одну из его земель вождь другого племени предложил ему выбрать одну из трех куч с золотыми монетами. Но вождю племени Абба хочется получить наибольшее количество золотых монет. Помогите вождю сделать правильный выбор!
//
//Входные данные
//В первой строке входного файла INPUT.TXT записаны три натуральных числа через пробел. Каждое из чисел не превышает 10100. Числа записаны без ведущих нулей.
//
//Выходные данные
//В выходной файл OUTPUT.TXT нужно вывести одно целое число — максимальное количество монет, которые может взять вождь.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ID_0007 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] s = reader.readLine().split("\\s");
        BigInteger max = new BigInteger(s[0]);
        for (int i = 0; i <s.length ; i++) {
            BigInteger n = new  BigInteger(s[i]);
            if (max.compareTo(n) < 0 ){
                max = n;
            }
        }
        System.out.println(max);
    }
}
