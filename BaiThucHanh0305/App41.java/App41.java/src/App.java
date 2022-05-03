import java.util.Scanner;
import java.util.LinkedList;
public class date {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //khai bao 1 danh sach lien ket
        //luu tru cac thang trong nam
        linkedList<String> linkedList = new linkedList<>();
        linkedList.add("tháng1");
        linkedList.add("tháng2");
        linkedList.add("tháng3");
        linkedList.add("tháng4");
        linkedList.add("tháng5");
        linkedList.add("tháng6");
        linkedList.add("tháng7");
        linkedList.add("tháng8");
        linkedList.add("tháng9");
        linkedList.add("tháng10");
        linkedList.add("tháng11");
        linkedList.add("tháng12");
        System.out.println("nhap vao chi so cua phan tu can lay: ");
        int index = scanner.nextInt();
        //kiểm tra nếu chỉ số lớn hơn hoặc bằng 0
        //và nhỏ hơn kích thước của linkedlist -1 thì mới lấy
        //ngược lại thông báo lỗi
        if ((index <0)|| (index > (linkedList.size()-1))){
            System.out.println("chi so can lay phai lon hon so 0 va nho hon" + (linkedList.size()-1));      
        }
        else{
            //truy cập phần tử có chỉ số index trong linkedlist
            //vì linkedList có kiểu là String
            //nên các phần tử con của nó cũng có kiểu dữ liệu là String
            String node = linkedList.get(index);
            System.out.println("phan tu chi so = " + index + " trong linkedList laf " + node);
        }
        //truy cập phần tử đầu tiên trong danh sách
        //sử dụng phương thức getFirst()
        String firstNode = linkedList.getlast();
        System.out.println("\nphan tu dau tien trong danh sach laf " + firstNode + " ; phan tu cuoi cung trong danh sach laf " + lastNode);
    }
}