import java.util.Scanner;

public class Person {
    String name, id, add;
    Boolean gender;

    void input()
    {
        String gt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        add = sc.nextLine();
        System.out.print("Nhap gioi tinh (nam/nu): ");
        gt = sc.nextLine();
        if (gt == "nam")
        {
            gender = true;
        }
        else gender =false;
        sc.close();
    }
    void output()
    {
        System.out.println("Ho ten: " + name);
        if (gender == true)
        {
            System.out.println("Gioi tinh: nam");
        }
        else System.out.println("Gioi tinh: nu");
        System.out.println("ID: " + id);
        System.out.println("Address: " + add);
    }
}