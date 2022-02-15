import java.util.Scanner;

ứng dụng lớp công cộng30 {
    chính khoảng trống tĩnh công cộng (String[] args) ném Ngoại lệ {
       Máy quét = máy quét mới (Hệ thống. vào);
       int n, t = 0, a;
       Hệ thống. ra ngoài. println("Nhap vao so nguyen n: ");
 n = máy quét. nextInt();
       trong khi (n != 0)
       {
           a = n % 10;
           n =  n / 10;
           t += a;
       }
       Hệ thống. ra ngoài. println("Tong cac phan tu cua n la: " + t);
    }
}