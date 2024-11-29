public static void main(String[] args) throws IOException {
    Integer[] num = { 1, 23, 45, 67, 89, 10, 11, 21, 34, 29, 69, 50, 99, 70, 1234, 651, 85 };
    List<Integer> List = new ArrayList<Integer>(Arrays.asList(num));
    System.out.println("oringal list: " + list);
    keepOnlyCompositeNumbers(list);
    System.out.println("Final episode of list: " + list);
}

public static void keepOnlyCompositeNumbers(List<Integer> num) {
    for (int i = 0; i < num.size(); i++) {
        if (isPrime(num.get(i))) {
            num.remove(i);
        }
    }
}

public static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}