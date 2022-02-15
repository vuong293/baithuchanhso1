import java.util.Scanner;

Ứng dụng lớp công cộng {
    chính khoảng trống tĩnh công cộng (String[] args) ném Ngoại lệ {

        Máy quét sc = máy quét mới (Hệ thống. vào); 
        int n, soDu, tong = 0;

        Hệ thống. ra ngoài. println("Nhập vào số nguyên dương bất kỳ: ");
 n = sc. nextInt();

        trong khi (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

        Hệ thống. ra ngoài. println("Tổng các chữ số = " + tong);
    }
}