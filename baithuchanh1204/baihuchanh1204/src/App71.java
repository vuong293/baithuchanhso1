gói  App71 ;

public  class  main71 {
    
    public  static  void  main ( String [] args ) {
        // Khởi tạo hinhTron đối tượng từ lớp HinhTron
        HinhTron  hinhTron = new  HinhTron ();

        // set bán kính cho hinhTron thông qua setter phương thức
        hinhTron . setBanKinh ( 10 );

        // Khác tính toán
        float  chuVi = hinhTron . tinhChuVi ();
        float  dienTich = hinhTron . tinhDienTich ();
        Hệ thống . ra ngoài . println ( "Chu vi hình tròn:" + chuVi + "; và diện tích:" + dienTich );
    }
}