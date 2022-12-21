package interfaces;

public class NanaumiMain {
	public static void main(String[] args) {
		Nanaumi Nanaumi = new Nanaumi("七海", "2022/12");
		
		final String message = Nanaumi.doCreateJavaCurriculum();
		System.out.println("message = " + message);
		
	}
}
