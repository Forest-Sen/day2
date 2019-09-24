public class Test6 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int a = i / 100; //取百位数
            int b = i / 10 % 10; //取十位数
            int c = i % 10;  //取个位数
            int d = a * a * a + b * b * b + c * c * c;  //水仙花数字
            if (d==i){
                System.out.println(i);
            }
        }
    }
}
