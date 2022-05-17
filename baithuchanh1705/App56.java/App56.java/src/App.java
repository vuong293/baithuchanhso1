import java.util.HashSet;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        // them cac phan tu vao hashSetString
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        //hien thi cac phan tu trong hashSetInteger

        System.out.println("cac  phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can them: ");
        name = scanner.nextLine();
        // neu phan tu can xoa co ton tai hashSetString thi se thong bao xoa thanh cong
        // va hien thi phan tu con lai nguoc lai thong bao xoa khong thanh cong
        if (!hashSetString.contains(name)){
            hashSetString.add(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        }else{
            System.out.println("xoa khong thanh cong!");
        }
    }
}