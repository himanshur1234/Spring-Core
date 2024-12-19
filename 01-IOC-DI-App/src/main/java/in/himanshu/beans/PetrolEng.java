package in.himanshu.beans;

public class PetrolEng implements IEngine {

	public PetrolEng() {
		System.out.println("petrol class caled");
	}
	@Override
	public int start() {
		System.out.println("Petrol engine started");
		return 1;
	}

}
