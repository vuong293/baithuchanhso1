import javs.util.arrList;
import java.util.Scanner;
public class Max{
    public static void main(string[] args){
        ArryList<Integer> arrListInteger = new arrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number; //phần tử của mảng
        System.out.println("nhập số phần tử của ArrayList: ");
        int n = scanner.nextInt();
        //nhap va them phan tu cho ArrayList
        for (int i = 0; i<n; i++){
            System.out.print("nhap phan tu thu " + i +"; ");
            number = scanner.nestInt();
            arrListInteger.add(number)
        }
        //tim phan tu lon nhat trong mang su dung phuong thuc compareTo()
        //giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
        int max = arrListInteger.get(0);
        for (int i = 1; i < arrListInteger.size(); i ++){
            // nếu kết quả của phép so sánh này lớn hơn 0
            //tức biến max nhỏ hơn phần tử tạ vị trí thứ i trong ArrList
            //thì gán max = phần tưt tại vị trí i
            //và đó chính là phần tử lớn nhất
            If ( arrListInteger.get(i).compareTo(max)>0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arrlistInteger = " = max);
    }
}