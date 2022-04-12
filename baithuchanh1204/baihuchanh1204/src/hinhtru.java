 hình dạng gói ;

nhập  java . sử dụng . Máy quét ;

public  class  HinhTru  mở rộng  HinhTron {

    public  float  chieuCao ;

    //Constructor
    public  HinhTru () {
        ten = "Hình Trụ" ;
}

public  void  nhapChieuCao () {
    nhapbanKinh ();

    Hệ thống . ra ngoài . println ( "Chiều cao =" );
     Máy quét Scanner = Máy quét mới  ( Hệ thống . In );
    chieuCao = máy quét . nextFloat ();
}

public  void  tinhTheTich () {
    tinhDienTich ();
    theTich = dienTich * chieuCao ;
}
}