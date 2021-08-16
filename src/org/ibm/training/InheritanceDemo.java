package org.ibm.training;
//private>default>protected>public
class Human{
	private double height;
	private double weight;
	
	void eat() {
		System.out.println("Eating");
	}
}

class Student{//SUper Class, Parent Class
	private String rollNo;
	private String fathersName;
	private String nationalId;
	
	
	
	public Student(String rollNo, String fathersName, String nationalId) {
		super();
		this.rollNo = rollNo;
		this.fathersName = fathersName;
		this.nationalId = nationalId;
	}
	//void display();
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	protected void study() {
		System.out.println("Studying");
	}
	
	void eat() {
		System.out.println("Eating");
	}
	
	void sleep() {
		System.out.println("Sleeping");
	}
}

//is-A relationship and whether inheritance follows is A rship
class EngineeringStudent extends Student{
	
	public EngineeringStudent(String rollNo, String fathersName, String nationalId) {
		super(rollNo, fathersName, nationalId);
		this.jeeRank = "10000";
		// TODO Auto-generated constructor stub
	}

	private String jeeRank;
	
	public String getJeeRank() {
		return jeeRank;
	}

	public void setJeeRank(String jeeRank) {
		this.jeeRank = jeeRank;
	}
	//Method Overriding
	@Override
	public void study() {
		super.study();
		System.out.println("Studying with some practicals");
	}

	void doSomeEngineeringProject() {
		System.out.println("Working on eng project");
	}
}

class MechanicalEngineeringStudent extends EngineeringStudent{

	public MechanicalEngineeringStudent(String rollNo, String fathersName, String nationalId) {
		super(rollNo, fathersName, nationalId);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void study() {
		super.study();
		System.out.println("Parallel working on workshop.");
	}
	
}

//SUbClass, Child class
class MedicalStudent extends Student{
	public MedicalStudent(String rollNo, String fathersName, String nationalId, String neetRank) {
		super(rollNo, fathersName, nationalId);
		this.neetRank = neetRank;
		// TODO Auto-generated constructor stub
	}
	private String neetRank;
	
	public String getNeetRank() {
		return neetRank;
	}

	public void setNeetRank(String neetRank) {
		this.neetRank = neetRank;
	}
	
	@Override
	void sleep() {
		System.out.println("You should never sleep");
	}
	void doTrainingInSurgery() {
		System.out.println("Performing surgery");
	}
}

public class InheritanceDemo {
	
	public void display(Number i, Number j) {
		System.out.println(i+" "+j);
	}
	

	public static void main(String[] args) {
		
		//Student student = new Student("1","abc","ind1");
		MechanicalEngineeringStudent engStudent = new MechanicalEngineeringStudent("2","xyz","ind2");
		//student.study();
		engStudent.eat();//Student - //grandparent method
		engStudent.doSomeEngineeringProject(); //parent
		engStudent.study();//child
		/*
		 * Student engStudent = new EngineeringStudent("ENG1", "abc",
		 * "IND1","40000");//Run-time polymorphism Student medStudent = new
		 * MedicalStudent("MED1", "xyz", "IND2","7000");
		 * System.out.println(engStudent.getRollNo()+" "+engStudent.getFathersName()+" "
		 * +engStudent.getNationalId());
		 * System.out.println(medStudent.getRollNo()+" "+medStudent.getFathersName()+" "
		 * +medStudent.getNationalId()); engStudent.study(); engStudent.eat();
		 * engStudent.sleep(); medStudent.study(); medStudent.eat(); medStudent.sleep();
		 * InheritanceDemo demo = new InheritanceDemo(); demo.display(10, 20);
		 * demo.display(10.0f, 20.0f); // TODO Auto-generated method stub
		 */
	}

}
