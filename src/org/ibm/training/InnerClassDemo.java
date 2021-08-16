package org.ibm.training;


class OuterClass{
	
	private int i;
	
	public OuterClass(int i) {
			super();
			this.i = i;
		}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public void display() {
		//System.out.println(i);
	}
	
	class InnerClass{//Employee$EmployeeService
		private int j;
		
		public InnerClass(int j) {
			this.j = j;
		}

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}
		
		public void display() {
			//System.out.println(j);
		}
		
		class InnermostClass{
			private int k;
			
			public InnermostClass(int k) {
				this.k = k;
			}
			
			public void display() {
				System.out.println(i+" " + j + " "+k);
			}
		}
	}
}







public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass(5);
		obj.display();
		OuterClass.InnerClass obj1 = obj.new InnerClass(10);
		obj1.display();
		OuterClass.InnerClass.InnermostClass obj2 = obj1.new InnermostClass(15);
		obj2.display();
		// TODO Auto-generated method stub

	}

}
