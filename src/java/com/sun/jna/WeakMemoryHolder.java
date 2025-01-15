// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import java.util.IdentityHashMap;
import java.lang.ref.ReferenceQueue;

public class WeakMemoryHolder
{
    public ReferenceQueue<Object> referenceQueue;
    public IdentityHashMap<Reference<Object>, Memory> backingMap;
    
    public WeakMemoryHolder() {
        this.referenceQueue = new ReferenceQueue<Object>();
        this.backingMap = new IdentityHashMap<Reference<Object>, Memory>();
    }
    
    public synchronized void put(final Object o, final Memory m) {
        this.clean();
        this.backingMap.put(new WeakReference<Object>(o, this.referenceQueue), m);
    }
    
    public synchronized void clean() {
        for (Reference<?> key = this.referenceQueue.poll(); key != null; key = this.referenceQueue.poll()) {
            this.backingMap.remove(key);
        }
    }
}
