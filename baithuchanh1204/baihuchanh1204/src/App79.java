public  static  void  main ( String [] args ) {
        
        NhanVienFullTime  sep = new  NhanVienFullTime ( "Tran Van Sep" );
        lá đài . setLoaiChucVu ( Cấu hình . NHAN_VIEN_SEP );
        NhanVienFullTime  linh1 = new  NhanVienFullTime ( "Nguyen Van Linh" );
         NhanVienFullTime linh2 = new NhanVienFullTime  ( " Le Thi Linh" , 3 );
        linh1 . setLoaiChucVu ( Cấu hình . NHAN_VIEN_LINH );
        linh2 . setLoaiChucVu ( Cấu hình . NHAN_VIEN_LINH );
        
         NhanVienPartTime thoiVu = new NhanVienPartTime  ( " Phan Thi Thoi Vu" , 240 );
       
        Hệ thống . ra ngoài . println ( "Loai chuc vu:" );
        Hệ thống . ra ngoài . println ( "\ t1 = sep" );
        Hệ thống . ra ngoài . println ( "\ t2 = linh" );
        lá đài . tinhLuong ();
        linh1 . tinhLuong ();
        linh2 . tinhLuong ();
        thoiVu . tinhLuong ();
      
        lá đài . xuatThongTin ();
        linh1 . xuatThongTin ();
        linh2 . xuatThongTin ();
        thoiVu . xuatThongTin ();
    }

}