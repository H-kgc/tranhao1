import java.util.Scanner;
// mo rong 3 chieu
class Diem {
    protected int x; // Hoành độ
    protected int y; // Tung độ
    protected int z; // cao do

    // Hàm gán tọa độ cho điểm
    public void Gan(int hoanh, int tung, int cao) {
        this.x = hoanh;
        this.y = tung;
        this.z = cao;
    }

    // Hàm nhập tọa độ cho điểm
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hoành độ (x): ");
        this.x = scanner.nextInt();
        System.out.print("Nhập tung độ (y): ");
        this.y = scanner.nextInt();

    }

    // Hàm in ra tọa độ điểm
    public void Indiem() {
        System.out.printf("Tọa độ điểm 2D: (%d, %d, %d)\n", x, y,z);
    }

    // Hàm xuất giá trị hoành độ
    public int PutX() {
        return x;
    }

    // Hàm xuất giá trị tung độ
    public int PutY() {
        return y;
    }
    public int PutZ(){
        return z;
    }

    // Hàm tính khoảng cách từ điểm đến gốc tọa độ
    public double KhoangCachGoc() {
        return Math.sqrt(x * x + y * y + z*z);
    }
}

class Diem3D extends Diem {
    private int z; // Cao độ

    // Hàm gán tọa độ cho điểm 3D
    public void Gan(int hoanh, int tung, int cao) {
        super.Gan(hoanh, tung,cao); // Gọi hàm Gan của lớp cha
        this.z = cao;
    }

    // Hàm nhập tọa độ cho điểm 3D
    @Override
    public void Nhap() {
        super.Nhap(); // Nhập x và y từ lớp cha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cao độ (z): ");
        this.z = scanner.nextInt();
    }

    // Hàm in ra tọa độ điểm 3D
    @Override
    public void Indiem() {
        System.out.printf("Tọa độ điểm 3D: (%d, %d, %d)\n", x, y, z);
    }

    // Hàm tính khoảng cách từ điểm 3D đến gốc tọa độ
    public double KhoangCachGoc() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Hàm tính khoảng cách giữa hai điểm 3D
    public double KhoangCach(Diem3D other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) + Math.pow(this.z - other.z, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo điểm A với tọa độ (3, 4, 5)
        Diem3D A = new Diem3D();
        A.Gan(3, 4, 5);
        A.Indiem();

        // Tạo điểm B với giá trị nhập từ bàn phím
        Diem3D B = new Diem3D();
        B.Nhap();
        B.Indiem();

        // Tính khoảng cách từ điểm A đến B
        double khoangCachAB = A.KhoangCach(B);
        System.out.printf("Khoảng cách từ điểm A đến điểm B: %.2f\n", khoangCachAB);

        // Tạo điểm C đối xứng với B qua gốc tọa độ
        Diem3D C = new Diem3D();
        C.Gan(-B.PutX(), -B.PutY(), -B.PutZ()); // Sử dụng phương thức PutX() và PutY() va PutZ()
        C.Indiem();

        // Tính khoảng cách từ điểm B đến gốc tọa độ
        double khoangCachB = B.KhoangCachGoc();
        System.out.printf("Khoảng cách từ điểm B đến gốc tọa độ: %.2f\n", khoangCachB);
    }
}
