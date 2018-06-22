package com.garden.jc.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 生产者消费者例子类
 * @author Garden
 * 2018年6月22日
 */
public class ProducerConsumerExample {
	
	private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
	
	private class Producer extends Thread{ 
		@Override
		public void run(){
			try {
				queue.put("product");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("produce...");
		}
	}
	
	private class Consumer extends Thread{ 
		@Override
		public void run(){
			String product = "";
			try {
				product = queue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("consume-"+product);
		}
	}
	
	public void test(){
	    for (int i = 0; i < 2; i++) {
	        Producer producer = new Producer();
	        producer.start();
	    }
	    for (int i = 0; i < 5; i++) {
	        Consumer consumer = new Consumer();
	        consumer.start();
	    }
	    for (int i = 0; i < 3; i++) {
	        Producer producer = new Producer();
	        producer.start();
	    }
	}
	
}
