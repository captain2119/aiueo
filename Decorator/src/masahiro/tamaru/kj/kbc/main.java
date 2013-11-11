package masahiro.tamaru.kj.kbc;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Cake cake = new PlainCake();
		Scanner in = new Scanner(System.in);


		System.out.println("チョコレートいる？(Y/N)");
		if("Y".equals(in.next()))
			cake = new ChocolateDecorator(cake);

		System.out.println("苺いる？(Y/N)");
		if("Y".equals(in.next()))
			cake = new StrawberryDecorator(cake);

		System.out.println("クリームいる？(Y/N)");
		if("Y".equals(in.next()))
			cake = new CreamDecorator(cake);

		in.close();

		System.out.println("ケーキ完成！");
		cake.display();


	}

}
