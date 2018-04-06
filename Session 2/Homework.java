import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {
//     3.2
//    - After call the first ping(), the state is "No, I wug."

//      3.3
        public static void zool (int a, String b, String c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        };

//      3.4.1
        public static void printAmerican (String day, int date, String month, int year){
            System.out.println(String.format("%s, %s %s, %s", day, month, date, year));
        }
        ;

//      3.4.3
        public static void printEuropean(String day, int date, String month, int year){
            System.out.println(String.format("%s, %s %s, %s", day, date, month, year));
        };

//      12.1
        public static int[] cloneArray(int array[]){
            int[] newArray = array;
            return newArray;
        };

//      12.2
        public static double randonDouble(double low, double high){
            Random random = new Random();
            double x = ThreadLocalRandom.current().nextDouble(low, high);
            System.out.println(x);
            return x;
        };

//      12.3
        public static int randomInt(int low, int high){
            Random random = new Random();
            int x = random.nextInt(high - low + 1) + low;
            System.out.println(x);
            return x;
        };

//      12.5
        public static boolean areFactors(int array[],int n) {
            boolean check = false;
            for (int i = 0; i < array.length; i++) {
                if (n % array[i] == 0) {
                    check = true;
                }
                else {
                    check = false;
                }
            }
            System.out.println(check);
            return check;
        };

        public static void main(String[] args) {
            int[] abc = {7, 235, 3};
            int[] xyz = {1, 2, 4};
            zool(11,"dog","Tay Son");
            printAmerican("Monday", 5, "April", 2018);
            printEuropean("Monday", 5, "April", 2018);
            cloneArray(abc);
            randonDouble(1,10);
            randomInt(1,10);
            areFactors(xyz,8);
        }
}
