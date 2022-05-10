package model;
import util.Configs;
public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;
public void NhanVienFullTime(String ten, int gioLamViec){
    this.ten = ten;
    this.gioLamViec = gioLamViec;
}
public String loatNhanVien(){
    return "Part time";
}
void tinhLuong(){
    luong = Configs.LUONG_PART_TIME_MOI_GIO * gioLamViec;
}
}