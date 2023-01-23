import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    public static void Task1() {
        System.out.println("Задание1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
        double[] numberN = {1.57, 7.654, 9.985,};
        for (int i = 0; i < 3; i++) {
            System.out.println(numberN[i]);
        }
        int[] appleCase = {12, 49, 52, 11, 5};
        for (int i = 0; i < appleCase.length; i++) {
            System.out.println(appleCase[i]);
        }
    }

    public static void Task2() {
        System.out.println("Задание2");
        int[] nubmer = new int[3];
        nubmer[0] = 1;
        nubmer[1] = 2;
        nubmer[2] = 3;
        System.out.println(Arrays.toString(nubmer));
        double[] numberN = {1.57, 7.654, 9, 985,};
        System.out.println(Arrays.toString(numberN));
        int[] appleCase = {12, 49, 52, 11, 5};
        System.out.println(Arrays.toString(appleCase));
    }

    public static void Task3() {
        System.out.println("Задание3");
        int [] number = {1,2,3};
        double [] numberN = {1.57, 7.654, 9.985,};
        int []  appleCase = {12,49,52,11,5};
        for (int i = number.length-1;i>=0; i--){
            System.out.print(number[i]);
            if (i != 0){
                System.out.print(", ");
            }System.out.println();
        for (int y = numberN.length -1; i>=0; i--) {
            System.out.print(numberN[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }System.out.println();
        for (int z = appleCase.length -1; z>=0; z--) {
            System.out.print(appleCase[z]);
            if (z != 0){
                System.out.print(", ");
            }System.out.println();
        }
        }
    }

    public static void Task4(){
        System.out.println("Задание4");
        int [] number = {1, 2, 3};
        for (int i =0; i < number.length; i++) {
           if(number[i] % 2 != 0) {
               number[i] +=1;
           }

        } System.out.print(Arrays.toString(number));


    }
}