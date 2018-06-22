package com.garden.jc.example;

import java.util.concurrent.Semaphore;

/**
 * 信号量例子类
 * @author Garden
 * 2018年6月21日
 */
public class SemaphoreExample {
	
	private int clientCount;
	private Semaphore semaphore;
	
	public SemaphoreExample(int clientCount){ 
		this.clientCount = clientCount;
		this.semaphore = new Semaphore(this.clientCount);
	}
	
	public void semaphoreTask(){
		try {
			semaphore.acquire();
			System.out.println("availablePermits:"+semaphore.availablePermits());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			semaphore.release();
		}
	}
}
