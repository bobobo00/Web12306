package thread;
/**
 * Runnableʵ��һ����Դ�������
 * ������Դ���������ƣ���Դ��ȫ��
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
				System.out.println(Thread.currentThread().getName()+"������"+ticketNums--);
			}
		}
	}
	
	public static void main(String[] args) {
		//һ����Դ
		Web12306 web=new Web12306();
		System.out.println(Thread.currentThread().getName());//��ȡ��ǰ�߳�����
		//�������
		new Thread(web,"aaa").start();
		new Thread(web,"sss").start();
		new Thread(web,"ddd").start();
		new Thread(web,"fff").start();
	}
	
	
	

}
