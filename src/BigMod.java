import java.util.Scanner;

//����ȡ��:a^b ȡ�� mod 
public class BigMod {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int mod = in.nextInt();
        int result = 0;
        int temp = a;
        long startTime = System.currentTimeMillis();
        for(int i=b; i>0; i--){
            result = a % mod;
            a = temp * result;
        }
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println(startTime - endTime);
    }
}
