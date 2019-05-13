package com.m2q.day13_多线程卖票案例;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketsDemo implements Runnable{
	private int count = 1000;
	//private Object obj = new Object();
	Lock l = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			l.lock();
			if (count >0){ {
					System.out.println(Thread.currentThread().getName()+"卖出第"+ count + "张票");
					count --;
				}
				
			}
			l.unlock();
				
			}
		}
	}


