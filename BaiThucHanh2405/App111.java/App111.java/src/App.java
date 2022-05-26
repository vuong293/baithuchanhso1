import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int n;
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap vao so phan tu cua LinkedList: ");
         n = sc.nextInt();
         int d = 0, t = 0;
         sc.close();
         LinkedList<Integer> link = new LinkedList<>();
         for (int i = 0; i < n; i++){
             System.out.println("Nhap phan tu thu " + i + ": ");
             int a = sc.nextInt();
             link.add(a);
             if (a % 2 == 0){
                d += 1;
                t += a;
             }
         }
         System.out.println("Trung binh cong cua cac so chan co trong linkedList la: " + t/d);
    }
}