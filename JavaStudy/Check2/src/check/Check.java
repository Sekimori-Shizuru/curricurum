package check;

import constants.Constants;

public class Check {

	//課題①
	private static final String firstName = "関森";
	private static final String lastName = "静流";

	//課題②
	private static String printName(String first, String last) {
		return first + last;

	}

	//課題③
	public static void main(String[] args) {
		System.out.println("printNameメソッド → " + printName(firstName, lastName));

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		pet.introduce();
		rPet.introduce();
	}
}
