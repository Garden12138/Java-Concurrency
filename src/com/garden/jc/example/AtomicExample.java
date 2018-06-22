package com.garden.jc.example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子例子类
 * @author Garden
 * 2018年6月22日
 */
public class AtomicExample {
	
    private AtomicInteger cnt = new AtomicInteger();
    public void add() {
        cnt.incrementAndGet();
    }
    public int get() {
        return cnt.get();
    }
}
