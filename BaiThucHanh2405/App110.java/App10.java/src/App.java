import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua list: ");
        n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + (i+1));
            n = sc.nextInt();
            a.add(n);
        }
        sapxep(a);
        System.out.println("List's max: " + a.get(a.size()-1));
        System.out.println("Nhap vao so nguyen can xoa: ");
        n = sc.nextInt();
        sc.close();
        for (int j : a){
            if (j == n){
                a.remove(j);
            }
        }
        System.out.println("Array list after sort and remove: ");
        System.out.println(a);
        

    }
    public static void sapxep(ArrayList<Integer> a){
        for(int i = 0; i < a.size()-2; i++){
            for (int j = i+1; j<a.size()-1; j++){
                if (a.get(i).compareTo(a.get(j)) > 0){
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }
}