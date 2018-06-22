package com.garden.jc.example;

/**
 * 互斥同步例子类
 * 
 * @author Garden 2018年6月15日
 */
public class SynchronizedExample {

	/**
	 * 同步同一代码块，只作用于相同对象
	 */
	public void fun1() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * 同步同一方法，只作用于相同对象
	 */
	public synchronized void fun2() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}

	/**
	 * 同步同类，作用于相同类型
	 */
	public void fun3() {
		synchronized (SynchronizedExample.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * 同步同静态方法，作用于相同类型
	 */
	public synchronized static void fun4() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}
}
