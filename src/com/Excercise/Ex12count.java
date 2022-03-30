import java.util.*;
class List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cars = {"tata", "audi", "mahi", "tata", "audi", "maruti"};
        System.out.println("enter the car name");
        String n = scan.nextLine();
        int a = list(cars, n);
        System.out.println(a);
    }

    public static int list(String[] cars, String n) {
        int count = 0;
        int letter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(n)) {
                count++;

            }


        }
        return count;
    }
}