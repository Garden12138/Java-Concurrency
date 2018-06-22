package com.garden.jc.example;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author Garden
 * 2018年6月22日
 */
public class FutureTaskExample {
	
	public FutureTask<Integer> futureTask(){
		FutureTask<Integer> ft = new FutureTask<Integer>(new Callable<Integer>(){
			int result = 0;
			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				for(int i = 0; i < 100; i++){
					Thread.sleep(20);
					result += i;
				}
				return result;
			}

		});
		return ft;
	}
	
}
