// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public class CallbackThreadInitializer
{
    private boolean daemon;
    private boolean detach;
    private String name;
    private ThreadGroup group;
    
    public CallbackThreadInitializer() {
        this(true);
    }
    
    public CallbackThreadInitializer(final boolean daemon) {
        this(daemon, false);
    }
    
    public CallbackThreadInitializer(final boolean daemon, final boolean detach) {
        this(daemon, detach, null);
    }
    
    public CallbackThreadInitializer(final boolean daemon, final boolean detach, final String name) {
        this(daemon, detach, name, null);
    }
    
    public CallbackThreadInitializer(final boolean daemon, final boolean detach, final String name, final ThreadGroup group) {
        this.daemon = daemon;
        this.detach = detach;
        this.name = name;
        this.group = group;
    }
    
    public String getName(final Callback cb) {
        return this.name;
    }
    
    public ThreadGroup getThreadGroup(final Callback cb) {
        return this.group;
    }
    
    public boolean isDaemon(final Callback cb) {
        return this.daemon;
    }
    
    public boolean detach(final Callback cb) {
        return this.detach;
    }
}
