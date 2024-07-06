import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Nhập số tiền vay: ");
        double tien = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("nhập số tháng");
        double thang = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("Nhập lãi xuất theo %");
        double laixuat = c.nextDouble();
    double tongTienLai = 0;
        for(int i = 0; i < thang; i++){
            tongTienLai += tien * (laixuat/100)/12 * thang;
        }
        System.out.println("Tổng ố tiền phải trả là : " + tongTienLai);
    }
}

