import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> l = new ArrayList<>();

        System.out.println("Введите 5 чисел:");
        for (int i = 0; i<5;i++){
            int n = Integer.parseInt(r.readLine());
            if (n%2==0)
            l.add(0, n);
            else l.add(n);}

        System.out.println("Итоговый список: ");
        for (int i: l)
            System.out.print(i + " ");


    }
}
