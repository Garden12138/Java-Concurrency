package com.garden.jc.example;
/**
 * 等待唤醒例子类
 * @author Garden
 * 2018年6月21日
 * PS:使用关键字synchronized同步
 */
public class WaitNotifyExample {
	
	public synchronized void notifyTask(){
		System.out.println("notifying...");
		notifyAll();
//		notify();
	}
	
	public synchronized void waitTask(){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("waiting end...");
	}
	
}
