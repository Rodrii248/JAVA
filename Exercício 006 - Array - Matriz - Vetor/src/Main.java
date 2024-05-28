import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                String [] array = new String[3];



                for (Integer i = 0; i < 3; i++){
                    array[i] = new Scanner(System.in).nextLine();
                }

                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);




    }
}