package org.ibm.training;
class E{
	int value;
}

class Counter{
	int counter = 0;
	public synchronized void increment() {
		counter++;
	}
}
/*
 * class C implements Runnable{
 * 
 * @Override public void run() {
 * System.out.println(Thread.currentThread().getName()); for(int i=1; i<=5; i++)
 * { System.out.println("Hello"); try { Thread.sleep(1000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } } } }
 * 
 * class D implements Runnable{
 * 
 * @Override public void run() {
 * System.out.println(Thread.currentThread().getName()); for(int i=1;i<=5;i++) {
 * System.out.println("World"); try { Thread.sleep(1000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } } } }
 */

public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Counter obj = new Counter();
		Thread t1 = new Thread(()->{
			for(int i=1;i<=500;i++)
				obj.increment();
			},"Hello Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(()-> {
			for(int i=1;i<=500;i++)
				obj.increment();
		},"World Thread");
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		/*
		 * try { Thread.sleep(10); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.counter);
		System.out.println("End of program");
		

	}

}
