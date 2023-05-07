import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array = new int[10];
        int[] copyArray = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = random.nextInt(10)+1;
        }
        System.out.println("Заполненный массив случайными числами");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив после сортировки");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        copyArray = Arrays.copyOf(array,10);
        System.out.println("Скопированный массив");
        System.out.println(Arrays.toString(copyArray));
        System.out.println("Сравнение двух массивов");
        System.out.println(Arrays.equals(array,copyArray));
    }
}
