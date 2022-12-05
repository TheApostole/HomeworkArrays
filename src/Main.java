public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        //Задание 1
        System.out.println("Задание 1");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        System.out.println("Целое число " + integers[0]);
        System.out.println("Целое число " + integers[1]);
        System.out.println("Целое число " + integers[2]);

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println("Дробное число " + fractionalNumbers[0]);
        System.out.println("Дробное число " + fractionalNumbers[1]);
        System.out.println("Дробное число " + fractionalNumbers[2]);

        int[] carsInGarages = {3, 10, 7};
        System.out.println(carsInGarages[0] + " машины в первом гараже");
        System.out.println(carsInGarages[1] + " машин во втором гараже");
        System.out.println(carsInGarages[2] + " машин в третьем гараже");

    }

    public static void task2() {
        //Задание 2
        System.out.println("Задание 2");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print(integers[i]);
            } else
                System.out.print(", " + integers[i]);
        }
        System.out.println();

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print(fractionalNumbers[i]);
            } else
                System.out.print(", " + fractionalNumbers[i]);
        }
        System.out.println();


        int[] carsInGarages = {3, 10, 7};
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print(carsInGarages[i]);
            } else
                System.out.print(", " + carsInGarages[i]);
        }
        System.out.println();

    }

    public static void task3() {
        //Задание 1
        System.out.println("Задание 3");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(integers[i]);
            } else
                System.out.print(integers[i] + ", ");
        }
        System.out.println();

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(fractionalNumbers[i]);
            } else
                System.out.print(fractionalNumbers[i] + ", ");
        }
        System.out.println();

        int[] carsInGarages = {3, 10, 7};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(carsInGarages[i]);
            } else
                System.out.print(carsInGarages[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        //Задание 1
        System.out.println("Задание 4");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] += 1;
            }
            if (i == 0) {
                    System.out.print(integers[i]);
                } else {
                    System.out.print(", " + integers[i]);
                }
            }
        }
    }


