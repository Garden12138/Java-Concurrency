package com.garden.jc.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁例子类
 * 
 * @author Garden 2018年6月19日
 */
public class ReentrantLockExample {

	private Lock lock;

	public ReentrantLockExample() {
		this.lock =  new ReentrantLock();
	}

	public void fun() {
		lock.lock();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
		} finally {
			lock.unlock();
		}
	}
}
