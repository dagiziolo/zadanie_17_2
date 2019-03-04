public class Euler6 {


    public static void main(String[] args) {
        Euler6 euler6 = new Euler6();
        System.out.println(euler6.diffSumSquarAndSquarSum(100));
    }

    public int diffSumSquarAndSquarSum(int maxNumber) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i <= maxNumber; i++) {
            sum += i;
            sum2 += Math.pow(i, 2);
        }
        return (int) (Math.pow(sum, 2) - sum2);
    }
}
