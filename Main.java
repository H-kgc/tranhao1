import Mylib.PhepTinh;
import Mylib.PhepTinhKhac;
import java.util.Scanner;

class TestPackage{
    public static void main (String agrs[]){
        int a,b;
        PhepTinh phepTinh = new PhepTinh();
        PhepTinhKhac phepTinhKhac = new PhepTinhKhac();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a: ");
        a = nhap.nextInt();
        System.out.println("Nhap vao so nguyen b: ");
        b = nhap.nextInt();

        System.out.println(" Tong cua " + a+ "+" +b+"="+phepTinh.cong(a,b));
        System.out.println(" Hieu cua " + a+ "-"+b +"="+phepTinh.tru(a,b));
        System.out.println(" Tich cua " + a+"*"+b+"="+phepTinh.nhan(a,b));
        System.out.println(" Thuong cua " + a+"/"+b+"="+phepTinh.chianguyen(a,b));
        System.out.println(" Thuong du cua " + a+"%"+b+ "="+phepTinh.chiadu(a,b));


        System.out.println(" Ket qua " + a+"^"+b+"="+phepTinhKhac.luythua(a,b));
    }
}