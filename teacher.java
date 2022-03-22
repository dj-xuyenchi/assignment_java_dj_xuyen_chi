import java.util.Scanner;
/**
 * @author: DJ Bé Xinh;
 */
class teacher extends person {
    static Scanner scanner = new Scanner(System.in);
    String teacher_id;
    String teacher_email;
    int hours_on_stream;
    String full_name = person_fisrt_name+" "+person_midle_name+" "+person_last_name;
    String sex = person_sex == true ? "Nam" : "Nu";
    teacher() {
    }

    public teacher(String person_fisrt_name, String person_midle_name, String person_last_name, int person_born,
            boolean person_sex,
            String person_address, String teacher_id, String teacher_email, int hours_on_stream) {
        super(person_fisrt_name, person_midle_name, person_last_name, person_born, person_sex, person_address);
        this.teacher_id = teacher_id;
        this.teacher_email = teacher_email;
        this.hours_on_stream = hours_on_stream;
    }

    public void printf_infor() {
       // String sex = person_sex == true ? "Nam" : "Nu";
        //String full_name = person_fisrt_name+" "+person_midle_name+" "+person_last_name;
        System.out.printf("%s%23s%15s%16s%14s%27s%20s","Ma giao vien","Ho Ten Giao Vien","Nam Sinh","Gioi Tinh","Dia Chi","Email","So Gio Da Day");
        System.out.println("");
        System.out.printf("%12s%23s%15d%16s%14s%27s%20d",teacher_id,full_name,person_born,sex,person_address,teacher_email,hours_on_stream);
        System.out.println("");
    }
    public static String person_sex() {
        String input = scanner.nextLine();
        System.out.println("Vui lòng nhập 2 giá trị nam hoặc nu.");
        if (input.equals("nam")) {
            return "nam";
        } else
        if (input.equals("nu")) {
            return "nu";
        }
        return person_sex();
    }

    public void remix_infor() {
        System.out.println("Bạn muốn sửa thông tin nào.???");
        System.out.println("1. Họ");
        System.out.println("2. Tên đệm");
        System.out.println("3. Tên");
        System.out.println("4. Năm sinh");
        System.out.println("5. Giới tính");
        System.out.println("6. Địa chỉ");
        System.out.println("7. Mã giáo viên");
        System.out.println("8. Email");
        System.out.println("9. Số giờ đã dạy");
        System.out.println("10. Nhập lại tất cả");
        String choss_function = scanner.nextLine();
        switch (choss_function) {
            case "1":
                System.out.println("Nhập họ mới");
                person_fisrt_name = scanner.nextLine();
                full_name = person_fisrt_name+" "+person_midle_name+" "+person_last_name;
                break;
            case "2":
                System.out.println("Nhập tên đệm mới");
                person_midle_name = scanner.nextLine();
                full_name = person_fisrt_name+" "+person_midle_name+" "+person_last_name;
                break;
            case "3":
                System.out.println("Nhập tên mới");
                person_last_name = scanner.nextLine();
                full_name = person_fisrt_name+" "+person_midle_name+" "+person_last_name;
                break;
            case "4":
                System.out.println("Nhập năm sinh mới");
                person_born = Integer.parseInt(scanner.nextLine());
                break;
            case "5":
                System.out.println("Nhấp giới tính mới");
                String check_sex = person_sex();
                person_sex = check_sex.equals("nam") ? true : false;
                break;
            case "6":
                System.out.println("Nhập địa chỉ mới");
                person_address = scanner.nextLine();
                break;
            case "7":
                System.out.println("Nhập mã giáo viên mới");
                teacher_id = scanner.nextLine();
                break;
            case "8":
                System.out.println("Nhập email mới");
                teacher_email = scanner.nextLine();
                break;
            case "9":
                System.out.println("Nhập số giờ dạy mới");
                hours_on_stream = Integer.parseInt(scanner.nextLine());
                break;
            case "10":
                System.out.println("Nhập họ");
                person_fisrt_name = scanner.nextLine();
                System.out.println("Nhập tên đệm");
                person_midle_name = scanner.nextLine();
                System.out.println("Nhập tên");
                person_last_name = scanner.nextLine();
                System.out.println("Nhập năm sinh");
                person_born = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính");
                String check_sex_case_10 = person_sex(); // viet ham su ly du lieu vao chi 2 truong hop nam ho                      // nu
                person_sex = check_sex_case_10.equals("nam") ? true : false;
                System.out.println("Nhập địa chỉ");
                person_address = scanner.nextLine();
                System.out.println("Nhập mã giáo viên");
                teacher_id = scanner.nextLine();
                System.out.println("Nhập email");
                teacher_email = scanner.nextLine();
                System.out.println("Nhập số giờ dạy");
                hours_on_stream = Integer.parseInt(scanner.nextLine());
                break;
        }
    }
}
// Main.Class (Bao gồm hàm main, menu)
// Person.Class(Lớp cha - Bao gồm các thuộc tính: Ho, Ten, TenDem, NamSinh,
// GioiTinh, QueQuan - inRaManHinh())
// GiaoVien.Class (Bao gồm các thuộc tính của đối tượng như: MaGv, Email,
// SoGioDay -int - Hàm ToString() và kế thừa hàm inRaManHinh() từ lớp cha)
// ServiceGiaoVien.Class(Bao gồm các chức năng của bài toán)
