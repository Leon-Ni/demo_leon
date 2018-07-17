package thread;

import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;


public class ThreadPool {
	ThreadPoolExecutor executorFactory = ThreadPoolExecutorFactory.getThreadPoolExecutor();
	@Test
	public  void main(String[] args) {
		ThreadTest test= new ThreadTest();
		for (int i = 0; i < 10; i++) {
			//调用执行
			executorFactory.execute(test);
			System.out.println("线程池中线程数目：" + executorFactory.getPoolSize() + "，队列中等待执行的任务数目："
					+ executorFactory.getQueue().size() + "，已执行玩别的任务数目：" + executorFactory.getCompletedTaskCount());
		}
	}
}

//创建线程
class ThreadTest implements Runnable {
	@Override
	public void run() {
		System.out.println("执行线程run()!");
	}

}
