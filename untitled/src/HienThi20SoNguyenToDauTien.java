
public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers = 20;
        int counter = 0;
        int n = 2;

        System.out.println("20 số nguyên tố đầu tiên là:");
        while (counter < numbers) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                counter++;
            }
            n++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
