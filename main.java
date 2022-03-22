import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: DJ Bé Xinh;
 */
public class main {
    static Scanner scanner = new Scanner(System.in);
    static List<teacher> list_teacher = new ArrayList<teacher>();

    public static void main(String[] args) {

        list_teacher.add(
                new teacher("Mai", "Thỏ", "Ngọc", 2003, false, "Nam Định", "PH11113", "ngocmt11113@fpt.edu.vn", 766));
        list_teacher.add(
                new teacher("Đỗ", "Quang", "Anh", 1999, true, "Thái Bình", "PH19418", "anhdqph19418@fpt.edu.vn", 766));
        list_teacher.add(
                new teacher("Pé", "Mai", "Mắn", 2006, false, "Thanh Hóa", "PH19992", "pemaimankute@fpt.edu.vn", 299));
        list_teacher.add(
                new teacher("Mèo", "Mập", "Xấu Xí", 1992, false, "Hải Phòng", "PH18876", "meomapxauxi@fpt.edu.vn", 50));
        list_teacher.add(new teacher("DJ", "Xuyến", "Chi", 2000, false, "Vĩnh Long", "PH24534",
                "xuyenchidenday@fpt.edu.vn", 124));
        list_teacher.add(
                new teacher("Hồng", "", "Ngân", 2006, false, "Bến Tre", "PH32123", "nmdhongngane@fpt.edu.vn", 987));
        list_teacher.add(new teacher("Mãi", "Mãi", "Yên Em", 1995, true, "Quảng Bình", "PH13423",
                "yenemratnhieu@fpt.edu.vn", 675));
        list_teacher.add(new teacher("Mói", "Mầm", "Non", 2003, false, "Đắc Lắc", "PH20003",
                "moimoirapper2k3@fpt.edu.vn", 1004));
        list_teacher.add(new teacher("Oppa", "Thần", "Thái", 1994, true, "BàRịaVũngTàu", "PH00291",
                "oppasieukute94@fpt.edu.vn", 387));
        list_teacher.add(new teacher("Shie", "Go", "Tokuda", 1969, true, "Hải Dương", "PH69969",
                "thaythichcacem@fpt.edu.vn", 6996));
        list_teacher.add(
                new teacher("Maria", "", "Ozawa", 1990, false, "Hà Tĩnh", "PH19699", "cogiaodangiu69@fpt.edu.vn", 455));
        list_teacher.add(
                new teacher("Yui", "", "Hanata", 2002, false, "Hậu Giang", "PH65567", "yuihanatakute@fpt.edu.vn", 199));
        list_teacher.add(new teacher("Cristano", "", "Ronaldo", 1980, true, "TP HồChíMinh", "PH19802",
                "junio_cris@fpt.edu.vn", 762));
        list_teacher.add(
                new teacher("Lê", "Thảo", "Vân", 2003, false, "Hà Nội", "PH23142", "vanngu_pewpew@fpt.edu.vn", 912));
        list_teacher.add(new teacher("Nguyễn", "Vũ", "Long", 2004, true, "Bình Phước", "PH23241",
                "longoccho_003@fpt.edu.vn", 102));
        list_teacher.add(new teacher("Shizuka", "Minami", "Koe", 2001, false, "Kon Tum", "PH65735",
                "koeverrynice@fpt.edu.vn", 554));
        list_teacher.add(
                new teacher("Min", "", "Sociu", 1998, false, "Tuyên Quang", "PH19281", "ratlasociu@fpt.edu.vn", 490));
        list_teacher.add(
                new teacher("Hương", "Nghưng", "", 2006, false, "Ninh Bình", "PH92312", "huongnghung@fpt.edu.vn", 902));
        try {
            menu_assignment();
        } catch (Exception e) {
            System.out.println(
                    "Phát hiện Bung tự động về menu vui lòng gửi thông tin đoạn bị crash về email: anhdqph19418@fpt.edu.vn");
            menu_assignment();
        }
    }

    // ngoc ngu ngoc de thuong
    public static void menu_assignment() {
        System.out.println("1. Thêm giáo viên.");
        System.out.println("2. Xóa giáo viên.");
        System.out.println("3. Sửa thông tin giáo viên.");
        System.out.println("4. Tìm kiếm theo mã giáo viên.");
        System.out.println("5. In toàn bộ giáo viên.");
        System.out.println("6. Tìm kiếm theo tên giáo viên.");
        System.out.println("7. Kinh nghiệm 500h dạy.");
        System.out.println("8. Giáo viên theo miền");
        System.out.println("Nhập lựa chọn: ");
        String choss_function = scanner.nextLine();
        switch (choss_function) {
            case "1":
                list_teacher.add(add_teacher());
                menu_assignment();
                break;
            case "2":
                System.out.println("Nhập mã giáo viên cần xóa: ");
                String id_searching = scanner.nextLine();
                int i = 0;
                for (teacher teacher : list_teacher) {
                    if (teacher.teacher_id.contains(id_searching)) {
                        System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                                "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
                        System.out.println("");
                        System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, teacher.full_name,
                                teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                                teacher.hours_on_stream);
                        System.out.println("");
                        System.out.println("Ban có muốn xóa không? (y/n)");
                        String choice = scanner.nextLine();
                        if (choice.equals("y")) {
                            list_teacher.remove(i);
                            System.out.println("Xóa thành công!");
                            menu_assignment();
                        } else {
                            System.out.println("Xóa không thành công!");
                            menu_assignment();
                        }
                    }
                    i++;
                }
                menu_assignment();
                break;
            case "3":
                System.out.println("Nhập mã giáo viên cần sửa: ");
                String id_searching_2 = scanner.nextLine();
                int i2 = 0;
                for (teacher teacher : list_teacher) {
                    if (teacher.teacher_id.contains(id_searching_2)) {
                        list_teacher.get(i2).remix_infor();
                        System.out.println("Đã sửa thành công.");
                        menu_assignment();
                    }
                    i2++;
                }
                break;
            case "4":
                System.out.println("Nhập mã giáo viên cần tìm: ");
                String id_searching_3 = scanner.nextLine();
                for (teacher teacher_seach : list_teacher) {
                    if (teacher_seach.teacher_id.contains(id_searching_3)) {
                        teacher_seach.printf_infor();
                    }
                }
                menu_assignment();
                break;
            case "5":
                String fix_name_follow_sex;
                System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                        "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
                System.out.println("");
                for (teacher teacher : list_teacher) {
                    fix_name_follow_sex = teacher.person_sex == true ? "Thay " + teacher.full_name
                            : "Co " + teacher.full_name;
                    System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, fix_name_follow_sex,
                            teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                            teacher.hours_on_stream);
                    System.out.println("");
                }
                menu_assignment();
                break;
            case "6":
                System.out.println("Nhap ten giao vien can tim.");
                String name_searching = scanner.nextLine();
                System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                        "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
                System.out.println("");
                for (teacher teacher : list_teacher) {
                    if (teacher.full_name.contains(name_searching)) {
                        System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, teacher.full_name,
                                teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                                teacher.hours_on_stream);
                        System.out.println("");
                    }
                }
                menu_assignment();
                break;
            case "7":
                System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                        "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
                System.out.println("");
                for (teacher teacher : list_teacher) {
                    if (teacher.hours_on_stream > 500) {
                        System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, teacher.full_name,
                                teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                                teacher.hours_on_stream);
                        System.out.println("");
                    }
                }
                menu_assignment();
                break;
            case "8":
                printf_follow_regions();
                menu_assignment();
                break;
            default:
                System.out.println("Nhập sai, vui lòng nhập lại!");
                menu_assignment();
                break;
        }
    }

    // Ham them giao vien
    public static teacher add_teacher() {
        System.out.println("Nhap ho: ");
        String person_fisrt_name = scanner.nextLine();
        System.out.println("Nhap ten dem: ");
        String person_midle_name = scanner.nextLine();
        System.out.println("Nhap ten: ");
        String person_last_name = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        int person_born = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        String check_sex = person_sex();
        boolean person_sex = check_sex.equals("nam") ? true : false;
        System.out.println("Nhap dia chi: ");
        String person_address = scanner.nextLine();
        System.out.println("Nhap ma giao vien: ");
        String teacher_id = scanner.nextLine();
        System.out.println("Nhap email: ");
        String teacher_email = scanner.nextLine();
        System.out.println("Nhap so gio day: ");
        int hours_on_stream = Integer.parseInt(scanner.nextLine());
        return new teacher(person_fisrt_name, person_midle_name, person_last_name, person_born, person_sex,
                person_address, teacher_id, teacher_email, hours_on_stream);
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

    // Pe' ngoc. kute
    public static void printf_follow_regions() {
        String[] north_vn = { "Lào Cai", "Yên Bái", "Điện Biên", "Hoà Bình", "Lai Châu", "Sơn La", "Hà Giang",
                "Cao Bằng", "Bắc Kạn", "Lạng Sơn", "Tuyên Quang", "Thái Nguyên", "Phú Thọ", "Bắc Giang", "Quảng Ninh",
                "Bắc Ninh", "Hà Nam", "Hà Nội", "Hải Dương", "Hải Phòng", "Hưng Yên", "Nam Định", "Ninh Bình",
                "Thái Bình", "Vĩnh Phúc" };
        String[] midle_vn = { "Thanh Hoá", "Nghệ An", "Hà Tĩnh", "Quảng Bình", "Quảng Trị", "Thừa Thiên-Huế", "Kon Tum",
                "Gia Lai", "Đắc Lắc", "Đắc Nông", "Lâm Đồng", "Đà Nẵng", "Quảng Nam", "Quảng Ngãi", "Bình Định",
                "Phú Yên", "Khánh Hoà", "Ninh Thuận", "Bình Thuận" };
        String[] south_vn = { "Bình Phước", "Bình Dương", "Đồng Nai", "Tây Ninh", "Bà Rịa-Vũng Tàu", "TP Hồ Chí Minh",
                "Long An", "Đồng Tháp", "Tiền Giang", "An Giang", "Bến Tre", "Vĩnh Long", "Trà Vinh", "Hậu Giang",
                "Kiên Giang", "Sóc Trăng", "Bạc Liêu", "Cà Mau", "Cần Thơ" };
        System.out.println("Giao vien khu vuc mien Bac");
        System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
        System.out.println("");
        for (teacher teacher : list_teacher) {
            for (String i : north_vn) {
                if (teacher.person_address.contains(i)) {
                    System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, teacher.full_name,
                            teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                            teacher.hours_on_stream);
                    System.out.println("");
                }
            }
        }
        System.out.println("");
        System.out.println("Giao vien khu vuc mien Trung");
        System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
        System.out.println("");
        for (teacher teacher : list_teacher) {
            for (String i : midle_vn) {
                if (teacher.person_address.contains(i)) {
                    System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, teacher.full_name,
                            teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                            teacher.hours_on_stream);
                    System.out.println("");
                }
            }
        }
        System.out.println("");
        System.out.println("Giao vien khu vuc mien Nam");
        System.out.printf("%s%23s%15s%16s%14s%27s%20s", "Mã giáo viên", "Họ tên giáo viên", "Năm sinh",
                "Giới tính", "Địa chỉ", "Email", "Số giờ đã dạy");
        System.out.println("");
        for (teacher teacher : list_teacher) {
            for (String i : south_vn) {
                if (teacher.person_address.contains(i)) {
                    System.out.printf("%12s%23s%15d%16s%14s%27s%20d", teacher.teacher_id, teacher.full_name,
                            teacher.person_born, teacher.sex, teacher.person_address, teacher.teacher_email,
                            teacher.hours_on_stream);
                    System.out.println("");
                }
            }
        }
    }
}
// person_fisrt_name, person_midle_name, person_last_name, person_born,
// person_sex, person_address, teacher_id, teacher_email, hours_on_stream