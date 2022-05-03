public static void main(String[] args){
    //khai báo 1 ArryList có tên là arrListString
    //có kiểu String
    ArayList<Integer> arrListInteger = new ArrayList<>();

     //thêm các phần tử sử dụng phương thức add()
     //chữ f cho biết các số thêm vào là số thực
     //nếu không có chữ này thì trình biên dịch sẽ hiểu đây là số double
     //và se báo lỗi dữ liệu
     arrListString.add(0.7f);
     arrListString.add(7.26f);
     arrListString.add(1.02f);
     arrListString.add(9.3f);
     // duyệt theo kích thước của arrListString
     //sử dụng vòng lặp for thông thường
     //phương thức arrListString.size() sẽ trả về số phần tử của arrlistString
     //và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
     //sau đó hiển thị giá trị phần tử đó ra
     system.out.println("Các phần tử có trong arrListString là: ");
     for (int i = 0; i< arrListString.size(); i++){
         system.out.print(arrListString.het(i) + "\t");
     }
}