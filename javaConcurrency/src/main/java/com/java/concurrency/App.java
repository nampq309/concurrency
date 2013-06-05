package com.java.concurrency;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ThreadPoolExecutorService executorService = new ThreadPoolExecutorService(5, 10, 0L, TimeUnit.SECONDS , 
              new LinkedBlockingQueue<Runnable>());
        
        //
        
        for (int i = 1; i < 10; i++) {
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".1"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".2"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".3"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".4"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".5"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".6"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".7"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".8"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".9"), new CallbackDemo()) );
          executorService.execute(new TaskWrapper(new DemoTask("Task " + i + ".10"), new CallbackDemo()) );
        }
    }
    
}
