import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSorting {
    public static void test() {
        List<String> s = Arrays.asList("aaa", "b", "cd");

        // Сортировка списка строк по длине
        Collections.sort(s, new LengthComparator());

        // Вывод результата
        System.out.println(s); // Должно вывести [b, cd, aaa]
    }

    public static void main(String[] args) {
        test();
    }
}

