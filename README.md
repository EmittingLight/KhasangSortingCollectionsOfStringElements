Домашнее задание 2
Есть коллекция элементов String. Вам нужно сортировать эту коллекцию по длине строки. Используйте Collections.sort(List<T> list, Comparator<? super T> cmp)

// You need to implement LengthComparator implements Comparator
    public static void test() {
       List<String> s = Arrays.asList("aaa", "b", "cd");
       // Should return {b, cd , aaa}
       Collections.sort(s, new LengthComparator());
}
