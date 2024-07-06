public class HienThiRaCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tó nhỏ hơn 100 là:");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
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
