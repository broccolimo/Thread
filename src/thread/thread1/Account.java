package thread.thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	//�������
	private int balance;
	//����
	//private Lock lock = new ReentrantLock();
	//�����ķ���
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
			//ģ��ҵ�� 1��ͣ��
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = newBalance;
	}
	//��ȡ���ķ���
	public int getBalance(){
		return balance;
	}
}
