package ra;

public class Main {
    public static void main(String[] args) {
//        Playeble audioPlayer = new AudioPlayer("BaiHat1.mp3");
//        Playeble videoPlayer = new VideoPlayer("Video2.mp4");


//        audioPlayer.Play();
//        videoPlayer.Play();
//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//
//        // Nhập dữ liệu cho hình tròn
//        circle.inputData();
//        // Hiển thị diện tích hình tròn
//        circle.display();
//        System.out.println("Diện tích hình tròn: " + circle.getArea());
//
//        // Nhập dữ liệu cho hình chữ nhật
//        rectangle.inputDataRectangle();
//        // Hiển thị diện tích hình chữ nhật
//        rectangle.display();
//        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Thuan", 9, 2);
        System.out.println("Part time Employee");
        System.out.println("Name : "+partTimeEmployee.getName());
        System.out.println("PaymentPerHour : "+partTimeEmployee.getPaymentPerHour());
        System.out.println("Salary: " +partTimeEmployee.calculateSalary());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Tung", 150);
        System.out.println("Full Time Employee");
        System.out.println("Name : "+fullTimeEmployee.getName());
        System.out.println("Salary : "+fullTimeEmployee.calculateSalary());
    }
}
