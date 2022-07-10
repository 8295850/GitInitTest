import java.util.Scanner;
public class Fortest001{
	public static void main(String[] args) {
		Scanner MyScanner = new Scanner (System.in);
		
		// 定义一个j为 1-100 9的倍数有几个
		int j = MyScanner.nextInt();
		int o = 0;
		// 定义一个j为 1-100的和
		int sum = 0;
		// 定义一个j为 1-100 9的倍数的和
		int s = 0;
		for(int i = 1; i <= j; i++){
			if(i%9==0){
				o++;
				s+=i;
			}
			sum+=i;
			System.out.println(i);

		}
		System.out.println("9的倍数一共有"+o);
		System.out.println("1-100的和是"+sum);
		System.out.println("9的倍数的和是"+s);
		
		// 2.
		// int j = 0;
		// int s = 0;
		// for(int i = 0; i<=100; i+=9){
		// 	j+=i;
		// 	s+=1;

		// }
		 System.out.println(j);
		 System.out.println(s-1);
		
	
		
	}
}