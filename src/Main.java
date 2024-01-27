
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        System.out.println("Задача1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] arr = generateRandomArray();
        int maxSum = -1;
        int minSum = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];

            } else if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

    }

    public static void task3() {
        System.out.println("Задача3");
        int[] arr = generateRandomArray();
        double midSum = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            midSum = midSum + arr[i];
            sum = midSum;
        }
        midSum = midSum / 30;
        midSum = Math.round(midSum * 100.0) / 100.0;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + midSum + " рублей");
    }

    public static void task4() {
        System.out.println("Задача4");
        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}