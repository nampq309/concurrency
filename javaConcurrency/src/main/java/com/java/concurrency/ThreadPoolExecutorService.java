/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU Affero General Public License
* as published by the Free Software Foundation; either version 3
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package com.java.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorService extends ThreadPoolExecutor {

  
  
  public ThreadPoolExecutorService(int corePoolSize,
                                   int maximumPoolSize,
                                   long keepAliveTime,
                                   TimeUnit unit,
                                   BlockingQueue<Runnable> workQueue) {
    super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
  }

  /**
   * {@inheritDoc}
   */
  public void beforeExecute(Thread t, Runnable r) {
    //System.out.println("Start of thread "+ t.getName());
    //System.out.println("With Runnable "+ r.toString());
  }
  
  /**
   * {@inheritDoc}
   */
  public void afterExecute(Runnable r, Throwable t) {
    //System.out.println("Finish of thread "+ t);
    //System.out.println("With Runnable "+ r.toString());
  }
  
  
}
