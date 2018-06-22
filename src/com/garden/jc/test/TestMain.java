package com.garden.jc.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.garden.jc.example.AtomicExample;
import com.garden.jc.example.AwaitSignalExample;
import com.garden.jc.example.ForkJoinExample;
import com.garden.jc.example.FutureTaskExample;
import com.garden.jc.example.JoinExample;
import com.garden.jc.example.ProducerConsumerExample;
import com.garden.jc.example.ReentrantLockExample;
import com.garden.jc.example.SemaphoreExample;
import com.garden.jc.example.SynchronizedExample;
import com.garden.jc.example.ThreadUnsafeExample;
import com.garden.jc.example.WaitNotifyExample;
import com.garden.jc.task.MyCallable;
import com.garden.jc.task.MyRunnable;
import com.garden.jc.thread.MyThread;

/**
 * 测试类
 * 
 * @author Garden 2018年6月14日
 */
public class TestMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 测试实现Runnale接口使用线程
		// MyRunnable mr = new MyRunnable();
		// Thread thread = new Thread(mr);
		// thread.start();

		// 测试实现Callable接口使用线程
		// MyCallable mc = new MyCallable();
		// FutureTask ft = new FutureTask(mc);
		// Thread thread = new Thread(ft);
		// thread.start();
		// System.out.println("MyCallable Task Running... on" + ft.get());

		// 测试继承Thread使用线程
		// MyThread mt = new MyThread();
		// mt.start();

		// 测试Executor的使用
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// for(int i = 0; i < 5; i++){
		// executorService.execute(new MyRunnable());
		// }

		// 测试Daemon的使用
		// Thread thread = new Thread(new MyRunnable());
		// thread.setDaemon(true);

		// 测试sleep()的使用
		// Thread thread = new Thread(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// try {
		// Thread.sleep(1000);
		// System.out.println("Sub Thread End Of Sleeping...");
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }});
		// thread.start();

		// 测试yield()
		// ExecutorService executorService = Executors.newFixedThreadPool(1);
		// executorService.execute(new Runnable() {
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// Thread.yield();
		// System.out.println("first Sub Running...");
		// }
		// });
		// executorService.execute(new Runnable() {
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// System.out.println("Second Sub Running...");
		// }
		// });

		// 测试interrupt的使用
		// Thread thread = new Thread(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// try {
		// Thread.sleep(2000);
		// System.out.println("Sub Thread Starting...");
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// });
		// thread.start();
		// thread.interrupt();

		// Thread thread = new Thread(new Runnable() {
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// while (!Thread.interrupted()) {
		// System.out.println("in while()...");
		// }
		// System.out.println("out while()...");
		// }
		// });
		// thread.start();
		// thread.interrupt();

		// 测试Executor的中断操作
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// try {
		// Thread.sleep(2000);
		// System.out.println("Sub Thread Starting...");
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// });
		// //executorService.shutdown();
		// executorService.shutdownNow();

		// 测试synchronized同步同一代码块与同步同一方法
		// SynchronizedExample se1 = new SynchronizedExample();
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// //se1.fun1();
		// se1.fun2();
		// }
		// });
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// //se1.fun1();
		// se1.fun2();
		// }
		// });

		// 测试synchronized同步同类与同步静态方法
		// SynchronizedExample se1 = new SynchronizedExample();
		// SynchronizedExample se2 = new SynchronizedExample();
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// //se1.fun3();
		// se1.fun4();
		// }
		// });
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// //se2.fun3();
		// se2.fun4();
		// }
		// });

		// 测试ReentrantLock
		// ReentrantLockExample rle = new ReentrantLockExample();
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// rle.fun();
		// }
		// });
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// rle.fun();
		// }
		// });

		// 线程调用的使用
		// JoinExample je = new JoinExample();
		// je.test();

		// 线程等待与唤醒的使用
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// WaitNotifyExample wne = new WaitNotifyExample();
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// wne.waitTask();
		// }
		// });
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// wne.notifyTask();
		// }
		// });
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// AwaitSignalExample ase = new AwaitSignalExample();
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// ase.awaitTask();
		// }
		// });
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// ase.signalTask();
		// }
		// });

		// CountDownLatch的使用
		// final int totalThread = 10;
		// CountDownLatch countdownLatch = new CountDownLatch(totalThread);
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// for(int i = 0; i < totalThread; i++){
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// System.out.println("running...");
		// countdownLatch.countDown();
		// }
		// });
		// }
		// countdownLatch.await();
		// executorService.shutdown();
		// System.out.println("Main Thread waiting end...");

		// CyclicBarrier的使用
		// final int totalThread = 10;
		// CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// for (int i = 0; i < totalThread; i++) {
		// executorService.execute(new Runnable() {
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// System.out.println("before...");
		// try {
		// cyclicBarrier.await();
		// } catch (InterruptedException | BrokenBarrierException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println("after....");
		// }
		// });
		// }
		// executorService.shutdown();

		// Semaphore的使用
		// final int clientCount = 3;
		// final int totalThread = 10;
		// SemaphoreExample se = new SemaphoreExample(clientCount);
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// for(int i = 0; i < totalThread; i++){
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// se.semaphoreTask();
		// }
		// });
		// }
		// executorService.shutdown();

		// FutureTask的使用，若计算任务线程未执行完，调用get()方法的线程会阻塞
		// FutureTaskExample fte = new FutureTaskExample();
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// FutureTask<Integer> ft = fte.futureTask();
		// executorService.execute(ft);
		// executorService.execute(new Runnable(){
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println("waiting for result:");
		// }
		// });
		// System.out.println("result is "+ ft.get());

		// BlockingQueue的使用
		// ProducerConsumerExample pce = new ProducerConsumerExample();
		// pce.test();

		// ForkJoin的使用
		// ForkJoinExample example = new ForkJoinExample(1, 10000);
		// ForkJoinPool forkJoinPool = new ForkJoinPool();
		// Future result = forkJoinPool.submit(example);
		// System.out.println(result.get());

		// 线程不安全实例
		// final int threadSize = 1000;
		// ThreadUnsafeExample example = new ThreadUnsafeExample();
		// final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// for (int i = 0; i < threadSize; i++) {
		// executorService.execute(() -> {
		// example.add();
		// countDownLatch.countDown();
		// });
		// }
		// countDownLatch.await();
		// executorService.shutdown();
		// System.out.println(example.get());
		
		 //线程安全实例
		// final int threadSize = 1000;
		// AtomicExample example = new AtomicExample();
		// final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// for (int i = 0; i < threadSize; i++) {
		// executorService.execute(() -> {
		// example.add();
		// countDownLatch.countDown();
		// });
		// }
		// countDownLatch.await();
		// executorService.shutdown();
		// System.out.println(example.get());

		System.out.println("Main Thread Starting...");
	}
}
