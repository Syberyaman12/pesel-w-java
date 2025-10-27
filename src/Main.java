import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("podaj pesel");
        long Pesel = read.nextLong();

        List<Long> intList = new ArrayList<>();
        while (Pesel > 0){
            intList.add(Pesel % 10);
            Pesel /=10;
        }
        if(intList.get(1)%2==0){
            System.out.println("Kobieta");
        } else {
            System.out.println("Męższczyzna");
        }

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int S = 0;

        for (int i = 0; i < 10; i++) {
            S += intList.get(i) * wagi[i];
        }

        int M = S%10, R;
        R = M==0 ? 0 : 10-M;

        if(intList.get(0)==R){
            System.out.println("Pesel poprawny");
        }

    }
}