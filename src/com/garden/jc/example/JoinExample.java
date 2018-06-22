package com.garden.jc.example;
/**
 * 线程调用例子类
 * @author Garde
 * 2018年6月20日
 */
public class JoinExample {
	
	private class A extends Thread{
		@Override
		public void run(){
			System.out.println("Thread A Running...");
		}
	}
	
	private class B extends Thread{
		
		private A a;	
		public B(A a){
			this.a = a;
		}
		
		@Override
		public void run(){
			try {
				a.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread B Running...");
		}
	}
	
	public void test(){
		A a = new A();
		B b = new B(a);
		b.start();
		a.start();
	}
}
