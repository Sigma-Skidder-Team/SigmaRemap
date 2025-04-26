// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.util;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory
{
    private final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String threadPrefix;

    public NamedThreadFactory(String threadPrefix) {
        this.threadPrefix = threadPrefix;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = defaultThreadFactory.newThread(runnable);
        thread.setName(threadPrefix + "-" + threadNumber);
        return thread;
    }
}
