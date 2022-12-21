package abstracts;

public abstract class JavaCurriculumTrainee {
	
	private String name;
	
	public JavaCurriculumTrainee(String name ) {
		this.name = name;
	}
	
	public abstract void daJavaCurriculum();
	
	protected String getName() {
		return name;
	}
	
}
