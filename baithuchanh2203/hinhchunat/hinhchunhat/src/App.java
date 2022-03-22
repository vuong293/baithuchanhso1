import java.util.Scanner;

public class HinhChuNhat {
    float d;
    float r;
    void nhaphcn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        d = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        r = sc.nextFloat();
        sc.close();
    }
    float dienTich()
    {
        return d * r;
    }
    float chuVi()
    {
        return 2 * (d + r);
    }
}