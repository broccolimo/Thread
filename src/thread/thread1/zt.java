package thread.thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zt {
	public static void main(String[] args) {
		Account account = new Account();
		ExecutorService threadpool = Executors.newFixedThreadPool(10);
		//10����ͬʱ����˻���1��Ǯ
		for(int i = 1; i <= 10; i++){
			threadpool.execute(new AddMoney(account, 1));
		}
		threadpool.shutdown();
		while(!threadpool.isTerminated()){
		}
		
		System.out.println("����˻����Ϊ" + account.getBalance());
	}
}
