package in.himanshu.beans;

public class Car {
	
	 private IEngine eng;
	 
	 public void setengl(IEngine eng) {
		 System.out.println("seteng called");
		 this.eng =eng;
	 }
	 
	 public void drive() {
		 int status=eng.start();
		 if(status>=1) {
			 System.out.println("Jouny started..");
			 
		 }else {
			 System.out.println("sorry..");
		 }
	 }

}
