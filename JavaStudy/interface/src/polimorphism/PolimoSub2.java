package polimorphism;

public class PolimoSub2 extends PolimoSuper {

	 @Override
	 protected void call() {
	 super.call();
	 }
	 
	 public static void main(String[] args) {
		 PolimoSuper polimo2 = new PolimoSub2();
		 polimo2.call();
	}
}
