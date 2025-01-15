// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public final class Native$1 implements Callback$UncaughtExceptionHandler
{
    @Override
    public void uncaughtException(final Callback c, final Throwable e) {
        System.err.println("JNA: Callback " + c + " threw the following exception:");
        e.printStackTrace();
    }
}
