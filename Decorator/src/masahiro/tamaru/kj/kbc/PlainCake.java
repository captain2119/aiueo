package masahiro.tamaru.kj.kbc;

/**
 * 普通のケーキのクラス。
 * @author kbc11a07
 *
 */
public class PlainCake implements Cake {

	/**
	 * 画面にケーキの種類を表示する。
	 */
	@Override
	public void display() {
		System.out.println("普通のケーキ");
	}

}
