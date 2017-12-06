package thread.thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	//余额属性
	private int balance;
	//加锁
	//private Lock lock = new ReentrantLock();
	//存余额的方法
	//public synchronized void save(int money){
	public void save(int money){
//		lock.lock();
//		try{
//			int newBalance = balance + money;
//			try {
//				Thread.sleep(1000);
//			} 
//			catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			balance = newBalance;
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		finally{
//			lock.unlock();
//		}
		int newBalance = balance + money;
		try {
			//模拟业务 1秒停顿
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = newBalance;
	}
	//获取余额的方法
	public int getBalance(){
		return balance;
	}
}
