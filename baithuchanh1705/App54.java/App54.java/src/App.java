import java.util.HashSet;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        // them cac phan tu vao hashSetInteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        //hien thi cac phan tu trong hashSetInteger

        System.out.println("cac  phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();
        // them mot phan tu moi vao hashSetInteger tu ban phim
        // neu phan tu do da ton tai thi thong bao daax ton tai nguoc lai thi them vao
        if (!hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("them thanh cong!");
            System.out.println("cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        }else{
            System.out.println("phan tu" + number + " da ton tai");
        }
    }
}