package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 30, 200, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(5));

		for (int i = 0; i < 10; i++) {
			MyTask myTask1 = new MyTask("a");
			MyTask myTask2 = new MyTask("b");
			MyTask myTask3 = new MyTask("c");
			executor.execute(myTask1);
			Thread.currentThread().sleep(1000);
			executor.execute(myTask2);
			Thread.currentThread().sleep(1000);
			executor.execute(myTask3);
//			System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" + executor.getQueue().size()
//					+ "，已执行完别的任务数目：" + executor.getCompletedTaskCount());
		}
		executor.shutdown();
	}
}

class MyTask implements Runnable {

	private String taskStr;

	public MyTask(String str) {
		this.taskStr = str;
	}

	@Override
	public void run() {
		System.out.println("正在执行task " + taskStr);
	//	System.out.println("task " + taskStr + "执行完毕");
	}
}
