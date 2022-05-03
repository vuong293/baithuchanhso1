import java.util.LinkedList;
public class Linked{
    public static void main(String[] args){
        //khai báo 1 likedList cps tên là list
        // có kiểu là String
        LinkedList<String> list = new LinkedList<String>();
        //add objects to list
        list.add("java");
        list.add("C++");
        list.add("PHP");
        list.add("java");
        System.out.println("vi du su dung phuong thuc addAll()");
        System.out,println("__________________________________");
        //thêm các phần tử của list vapf listA
        LinkedList<String> listA = new LinkedList<String>();
        ListA.addAll(list);
        System.out.print("lisrA:");
        showList(listA);
        System.out.println("\n vi du su dung phuong thuc retainAll()");
        System.out.println("__________________________________________");
        // khoi tao listB
        LinkedList<String> listB = new LinkedList,String>();
        listB.add("java");
        //xoa nhung phan tu khong thuoc listB khoir listA
        listA.retainAll(listB);
        System.out.print("listA;");
        showList(list);

    }
    public static void showList(LinkedList<String> list){
        //show list through for-each
        for (String obj : list){
            System.out.print("\t" + obj + ", ");
        }
        System.out.primtln();
    }
}