package com.m2q.day13_���߳���Ʊ����;

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
					System.out.println(Thread.currentThread().getName()+"������"+ count + "��Ʊ");
					count --;
				}
				
			}
			l.unlock();
				
			}
		}
	}


