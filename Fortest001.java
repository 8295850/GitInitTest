import java.util.Scanner;
public class Fortest001{
	public static void main(String[] args) {
		Scanner MyScanner = new Scanner (System.in);
		
		// ����һ��jΪ 1-100 9�ı����м���
		int j = MyScanner.nextInt();
		int o = 0;
		// ����һ��jΪ 1-100�ĺ�
		int sum = 0;
		// ����һ��jΪ 1-100 9�ı����ĺ�
		int s = 0;
		for(int i = 1; i <= j; i++){
			if(i%9==0){
				o++;
				s+=i;
			}
			sum+=i;
			System.out.println(i);

		}
		System.out.println("9�ı���һ����"+o);
		System.out.println("1-100�ĺ���"+sum);
		System.out.println("9�ı����ĺ���"+s);
		
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