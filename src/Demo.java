public class Demo {
    // Lớp là 1 khuôn mẫu , sinh ra các đối tượng cụ thể gồm có :
    //Thuộc tinh : các dữ liệu mà đối tượng có , đại diện cho đăcj điểm của dối tượng (biến toàn cục )
    //Construstor : Là một hàm thực hiện tạo ra các đối tượng , contrustor thì trung tên với class ,có giá trị trả về
    // có thể nhiều contrustor
    //Các thuocc tính đều có giá trị măc định nếu kh quy định , thì mặc định sẽ phụ thuộc vào kiểu giá trị
    // double : 0.0 , int : 0 , string : null , bôlean : false ...
    // khi không có construstor nào thì sẽ tự tạo ra một construsrot rổng không có tham số

    // Method (Phương thức ) Đại diện cho hành động của các đối tướng


    public String name ;
    public int age ;
    public String gender ;

    public Demo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return "Helooo" + this.name;
    }
    public void go (String from) {
        System.out.println(this.name + " is going to " + from);
    }


}
// Main.java


