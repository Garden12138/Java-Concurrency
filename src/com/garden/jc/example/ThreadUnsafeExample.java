package com.garden.jc.example;
/**
 * 线程不安全例子类
 * @author Garden
 * 2018年6月22日
 */
public class ThreadUnsafeExample {
	
	private int count = 0;
	public void add(){
		count++;
	}
	public int get(){
		return count;
	}
}
