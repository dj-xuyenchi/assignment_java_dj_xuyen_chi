/**
 * @author: DJ Bé Xinh;
 */
public class person {
    String person_fisrt_name;
    String person_midle_name;
    String person_last_name;
    int person_born;
    boolean person_sex;
    String person_address;

    public person() {

    }

    public person(String person_fisrt_name,
            String person_midle_name,
            String person_last_name,
            int person_born,
            boolean person_sex,
            String person_address) {
        this.person_fisrt_name = person_fisrt_name;
        this.person_midle_name = person_midle_name;
        this.person_last_name = person_last_name;
        this.person_born = person_born;
        this.person_sex = person_sex;
        this.person_address = person_address;
    }
}
// Main.Class (Bao gồm hàm main, menu)
// Person.Class(Lớp cha - Bao gồm các thuộc tính: Ho, Ten, TenDem, NamSinh,
// GioiTinh, QueQuan - inRaManHinh())
// GiaoVien.Class (Bao gồm các thuộc tính của đối tượng như: MaGv, Email,
// SoGioDay -int - Hàm ToString() và kế thừa hàm inRaManHinh() từ lớp cha)
// ServiceGiaoVien.Class(Bao gồm các chức năng của bài toán)
