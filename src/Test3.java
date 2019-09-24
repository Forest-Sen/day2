public class Test3 {
    public static void main(String[] args) {
        int a = 0;
        for (int sum = 1; sum <= 100; sum++) {
            if (sum % 3 == 0 && sum % 5 == 0) {
                System.out.println(sum);
                a += sum;
            }
        }
        System.out.println("1-100之间既是3的倍数又是5倍数的数字之和：" +a);
    }

}
