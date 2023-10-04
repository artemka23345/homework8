public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        String msg = "Сумма трат за месяц составила %d рублей\n";
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf(msg,sum);
    }

    public static void task2() {
        String msg = "Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n";
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.printf(msg, min, max);
    }

    public static void task3() {
        String msg = "Средняя сумма трат за месяц составила %.2f рублей\n";
        double average = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            average += arr[i] / arr.length;
        }

        System.out.printf(msg, average);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        for (int i = 0; i < n / 2; i++) {
            char a = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = a;
        }
        System.out.println(reverseFullName);
    }
}
