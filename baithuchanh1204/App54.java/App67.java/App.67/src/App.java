public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
public class HinhTron {
    public void xuatThongTin(){
        System.out.println("Đây là hình tròn");
    }
}
public class HinhTru extends HinhTron {
    @Override
    public void xuatThongTin(){
        System.out.println("Đây là hình trụ");
    }
}
public class MainClass {
    public static void main(String[] args) {
        HinhTron hinhtron = new HinhTron();
        HinhTru hinhtru = new HinhTru();
        hinhtron.xuatThongTin();
        hinhtru.xuatThongTin();
    }
}