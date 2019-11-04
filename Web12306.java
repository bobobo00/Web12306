package thread;
/**
 * Runnable实现一份资源多个共享。
 * 共享资源，并发控制（资源安全）
 * @author dell
 *
 */

public class Web12306 implements Runnable {
	private int ticketNums=99;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticketNums<0) {
				break;
			}else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				System.out.println(Thread.currentThread().getName()+"——》"+ticketNums--);
			}
		}
	}
	
	public static void main(String[] args) {
		//一份资源
		Web12306 web=new Web12306();
		System.out.println(Thread.currentThread().getName());//获取当前线程名称
		//多个代理
		new Thread(web,"aaa").start();
		new Thread(web,"sss").start();
		new Thread(web,"ddd").start();
		new Thread(web,"fff").start();
	}
	
	
	

}
