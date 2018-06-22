package com.garden.jc.task;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * 实现Callable的任务类
 * @author Garden
 * 2018年6月14日
 */
public class MyCallable implements Callable<Date>{

	@Override
	public Date call() throws Exception {
		// TODO Auto-generated method stub
		return new Date();
	}
}
