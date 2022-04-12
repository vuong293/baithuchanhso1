hình dạng gói ;

nhập  java . sử dụng . Máy quét ;

public  class  HinhChuNhat  mở rộng  HinhHoc {
    
     phao  dai ; _
    public  float  rong ;

    //Constructor
    public  HinhChuNhat () {
        ten = "Hình Chữ Nhật" ;
    }

    public  void  nhapChieuDai () {
        Hệ thống . ra ngoài . println ( "Chiều dài =" );
         Máy quét Scanner = Máy quét mới  ( Hệ thống . In );
        dai = máy quét . nextFloat ();
    }

    public  void  nhapChieuRong () {
        Hệ thống . ra ngoài . println ( "Chiều rộng =" );
         Máy quét Scanner = Máy quét mới  ( Hệ thống . In );
        rong = máy quét . nextFloat ();
    }

    public  void  tinhChuVi () {
        chuVi = 2 * ( dai + rong );
    }

    public  void  tinhDienTich () {
        dienTich = dai * rong ;
    }
}