import java.util.Scanner;
public class SinhVien {
    String MaSinhVien, DiaChi, HoTen;
    String dob;
    Boolean GioiTinh;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        String gt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        HoTen = sc.nextLine();
        System.out.print("Ngay thang nam sinh (dd/mm/yyyy): ");
        dob = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.print("Nhap gioi tinh (nam/nu): ");
        gt = sc.nextLine();
        if (gt == "nam")
        {
            GioiTinh = true;
        }
        else GioiTinh =false;
        sc.close();
    }
    void output()
    {
        System.out.println("Ho ten: " + HoTen);
        if (GioiTinh == true)
        {
            System.out.println("Gioi tinh: nam");
        }
        else System.out.println("Gioi tinh: nu");
        System.out.println("Ngay sinh: " + dob);
        System.out.println("Address: " + DiaChi);
    }

}