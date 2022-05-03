public static viod main(String[]args){
    //khai báo 1 ArayList có tên lầ arrListString
    //có kiểu là String
    ArayList<Strng> arrListString = new arrayList<>();

    //thêm các phần tử sử dụng phương thức add()
    arrListString.add("java");
arrListString.add("PHP");
arrListString.add("C#");
arrListString.add("C++");
// duyệt theo kích thước của arrListString
//sử dụng vòng lặp for thông thường
//phương thức arrListString.size() sẽ trả về số phần tử của arrlistString
//và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
//sau đó hiển thị giá trị phần tử đó ra
system.out.println("Các phần tử có trong arrListString là: ");
for (int i = 0; i< arrListString.size(); i++){
    system.out.print(arrListString.het(i) + "\t");
}