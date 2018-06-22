package com.garden.jc.example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 等待唤醒例子类
 * @author Garden 
 * 2018年6月21日 
 * PS:使用J.U.C的ReentrantLock同步
 */
public class AwaitSignalExample {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void signalTask() {
		lock.lock();
		try {
			System.out.println("signaling...");
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public void awaitTask() {
		lock.lock();
		try {
			condition.await();
			System.out.println("awaiting end...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
