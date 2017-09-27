package red;

import java.util.Scanner;
import java.util.Random;

public class Red {
	public static void main(String[] args) {
		
		//输入钱数和人数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入红包总价格（单位：元）: " );
		double money = input.nextDouble();
		
		System.out.println("请输入人数: " );
		int people = input.nextInt();
		
		input.close();
		
		//一个人得到的钱
		double ones_money;
		
		//随机数
		Random random_float = new Random(),random_int = new Random();
		int i=0;
		for(i=1 ; i<=people ; ++i) {
			//生成每个人的随机钱数 
			do {
				ones_money = random_int.nextInt((int)money+1) + random_float.nextInt(100) /100.0;
			}while(ones_money < 0 || ones_money > money);
			
			System.out.println("第"+ i + "人：" + ones_money);
			money -= ones_money;
		}
	}
}
