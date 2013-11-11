package masahiro.tamaru.kj.kbc;

public class ChocolateDecorator extends Decorator{

	public ChocolateDecorator(Cake cake) {
		super(cake);
	}

	@Override
	public void display() {
		System.out.println("チョコレートつき");
		cake.display();
	}

}
