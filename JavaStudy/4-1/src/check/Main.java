package check;
import constants.Constants;

public class Main {
	
	public static void main(String[] args) {
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		System.out.println("printNameメソッド → " + printName(firstName, lastName));
		pet.introduce();
		rp.introduce();
		
	}
	
	private static final String firstName = "関森" ;
	private static final String lastName = "静流" ;
	
	private static String printName(String first, String last) {
		return first + last;
		}
	}
		
	
