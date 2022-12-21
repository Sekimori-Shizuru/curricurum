package polimorphism;

public class PolimoSub1 extends PolimoSuper {
	
	@Override
	protected void  call() {
		super.call();
	}

	public static void main(String[] args) {
		PolimoSuper polimo1 = new PolimoSub1();
		polimo1.call();
	}
	
}
