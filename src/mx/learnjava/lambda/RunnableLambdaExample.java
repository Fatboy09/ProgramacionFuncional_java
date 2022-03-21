package mx.learnjava.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		/*
		 * prior java 8
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");	
			}
		};
		new Thread(runnable).start();
		
		/*
		 * java 8 lambda () -> {};
		 */
		Runnable runnablelambda = () -> {
			System.out.println("Inside Runnable 2");
		};
		Runnable runnablelambda1 = () -> System.out.println("Inside Runnable 3");
		new Thread(runnablelambda).start();
		new Thread(runnablelambda1).start();
		new Thread(()->System.out.println("Inside Runnable 4")).start();
	}

}
