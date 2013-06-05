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

public class TaskWrapper implements Runnable {
  
  //Task
  private Runnable task;
  
  //callback
  private Callback callback;
  
  public TaskWrapper(Runnable task, Callback callback) {
    //
    this.task = task;
    this.callback = callback;
    
  }

  @Override
  public void run() {
    
    //before
    callback.preExecute(Thread.currentThread(), task);
    
    try {
      
      task.run();
      
      //after
      callback.postExecute(Thread.currentThread(), task, null);
      
    } catch (Exception e) {
      callback.postExecute(Thread.currentThread(), task, e);
    } finally {
      
    }

  }

}
