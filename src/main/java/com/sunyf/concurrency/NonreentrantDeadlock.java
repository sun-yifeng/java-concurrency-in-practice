package com.sunyf.concurrency;

/**
 * NonreentrantDeadlock
 * <p/>
 * Code that would deadlock if intrinsic locks were not reentrant
 *
 * @author Brian Goetz and Tim Peierls
 */

class Widget {
    // do sth
    public synchronized void doSomething() {
    }
}

class LoggingWidget extends Widget {
    // do sth
    public synchronized void doSomething() {
        System.out.println(toString() + ": calling doSomething");
        super.doSomething();
    }
}
