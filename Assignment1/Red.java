package red;

import java.util.Scanner;
import java.util.Random;

public class Red {
	public static void main(String[] args) {
		
		//����Ǯ��������
		Scanner input = new Scanner(System.in);
		System.out.println("���������ܼ۸񣨵�λ��Ԫ��: " );
		float money = input.nextFloat();
		
		System.out.println("����������: " );
		int people = input.nextInt();
		
		input.close();
		
		//һ���˵õ���Ǯ
		float ones_money;
		
		//�����
		Random random_float = new Random(),random_int = new Random();
		int i=0;
		for(i=1 ; i<=people ; ++i) {
			//����ÿ���˵����Ǯ��
			do {
				ones_money = random_int.nextInt((int)money+1) + random_float.nextFloat();
			}while(ones_money < 0 || ones_money > money);
			
			System.out.println("��"+ i + "�ˣ�" + ones_money);
			money -= ones_money;
		}
	}
}
