package shuo.laoma.concurrent.c67;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue 也是 Java 集合框架中定义的一种接口，直接继承自 Collection 接口。除了基本的 Collection 接口规定测操作外，Queue 接口还定义一组针对队列的特殊操作。通常来说，Queue 是按照先进先出(FIFO)的方式来管理其中的元素的，但是优先队列是一个例外。
 *
 * Deque 接口继承自 Queue接口，但 Deque 支持同时从两端添加或移除元素，因此又被成为双端队列。鉴于此，Deque 接口的实现可以被当作 FIFO队列使用，也可以当作LIFO队列（栈）来使用。官方也是推荐使用 Deque 的实现来替代 Stack。
 *
 * ArrayDeque 是 Deque 接口的一种具体实现，是依赖于可变数组来实现的。ArrayDeque 没有容量限制，可根据需求自动进行扩容。ArrayDeque不支持值为 null 的元素。
 *
 * 参考：http://blog.jrwang.me/2016/java-collections-deque-arraydeque/
 */

public class ProducerConsumerDemo1 {

	static class MyBlockingQueue<E> {
		private Queue<E> queue = null;
		private int limit;

		public MyBlockingQueue(int limit) {
			this.limit = limit;
//			双端队列（deque，全名double-ended queue）是一种具有队列和栈性质的抽象数据类型。
			queue = new ArrayDeque<>(limit);
		}



		public  void put(E e) throws InterruptedException {
			while (queue.size() == limit) {
//				wait();
			}
			queue.add(e);
//			notifyAll();
		}




		public  E take() throws InterruptedException {
			while (queue.isEmpty()) {
//				wait();
			}
			E e = queue.poll();
//			notifyAll();
			return e;
		}
	}

	static class Producer extends Thread {
		MyBlockingQueue<String> queue;

		public Producer(MyBlockingQueue<String> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			int num = 0;
			try {
				while (true) {
					String task = String.valueOf(num);
					queue.put(task);
					System.out.println("produce task " + task);
					num++;
					Thread.sleep((int) (Math.random() * 100));
				}
			} catch (InterruptedException e) {
			}
		}
	}

	static class Consumer extends Thread {
		MyBlockingQueue<String> queue;

		public Consumer(MyBlockingQueue<String> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			try {
				while (true) {
					String task = queue.take();
					System.out.println("handle task " + task);
					Thread.sleep((int) (Math.random() * 100));
				}
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		MyBlockingQueue<String> queue = new MyBlockingQueue<>(10);
		new Producer(queue).start();
		new Consumer(queue).start();
	}

}
/**
 * Exception in thread "Thread-1" java.lang.IllegalMonitorStateException
 * 	at java.base/java.lang.Object.wait(Native Method)
 * 	at java.base/java.lang.Object.wait(Object.java:328)
 *
 * 	wait notify notifyAll 不在synchronized{} 块内会报错的。如以上情况
 *
 */


/**
 *  如果不使用线程，生产消费一段时间后，就无法生产消费了。
 *
 */