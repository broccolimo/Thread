package thread.thread1;
/**
 * ´æÇ®Ïß³Ì
 * @author broccoli
 *
 */
public class AddMoney implements Runnable{
	private Account account;
	private int money;
	public AddMoney(Account account, int money){
		this.account = account;
		this.money = money;
	}
	
	@Override
	public void run() {
//		synchronized (account) {
//			account.save(money);
//		}
		account.save(money);
	}
}
