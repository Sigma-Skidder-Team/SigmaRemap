// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;

public final class Class8993
{
    private int field37942;
    private int field37943;
    private Runnable field37944;
    private ExecutorService field37945;
    private final Deque<Class1577> field37946;
    private final Deque<Class1577> field37947;
    private final Deque<Class2306> field37948;
    
    public Class8993(final ExecutorService field37945) {
        this.field37942 = 64;
        this.field37943 = 5;
        this.field37946 = new ArrayDeque<Class1577>();
        this.field37947 = new ArrayDeque<Class1577>();
        this.field37948 = new ArrayDeque<Class2306>();
        this.field37945 = field37945;
    }
    
    public Class8993() {
        this.field37942 = 64;
        this.field37943 = 5;
        this.field37946 = new ArrayDeque<Class1577>();
        this.field37947 = new ArrayDeque<Class1577>();
        this.field37948 = new ArrayDeque<Class2306>();
    }
    
    public synchronized ExecutorService method32083() {
        if (this.field37945 == null) {
            this.field37945 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Class7690.method24439("OkHttp Dispatcher", false));
        }
        return this.field37945;
    }
    
    public synchronized void method32084(final int n) {
        if (n >= 1) {
            this.field37942 = n;
            this.method32091();
            return;
        }
        throw new IllegalArgumentException("max < 1: " + n);
    }
    
    public synchronized int method32085() {
        return this.field37942;
    }
    
    public synchronized void method32086(final int n) {
        if (n >= 1) {
            this.field37943 = n;
            this.method32091();
            return;
        }
        throw new IllegalArgumentException("max < 1: " + n);
    }
    
    public synchronized int method32087() {
        return this.field37943;
    }
    
    public synchronized void method32088(final Runnable field37944) {
        this.field37944 = field37944;
    }
    
    public synchronized void method32089(final Class1577 class1577) {
        if (this.field37947.size() < this.field37942 && this.method32092(class1577) < this.field37943) {
            this.field37947.add(class1577);
            this.method32083().execute(class1577);
        }
        else {
            this.field37946.add(class1577);
        }
    }
    
    public synchronized void method32090() {
        final Iterator<Class1577> iterator = this.field37946.iterator();
        while (iterator.hasNext()) {
            iterator.next().method5663().method9346();
        }
        final Iterator<Class1577> iterator2 = this.field37947.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().method5663().method9346();
        }
        final Iterator<Class2306> iterator3 = this.field37948.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().method9346();
        }
    }
    
    private void method32091() {
        if (this.field37947.size() >= this.field37942) {
            return;
        }
        if (!this.field37946.isEmpty()) {
            final Iterator<Class1577> iterator = this.field37946.iterator();
            while (iterator.hasNext()) {
                final Class1577 class1577 = iterator.next();
                if (this.method32092(class1577) < this.field37943) {
                    iterator.remove();
                    this.field37947.add(class1577);
                    this.method32083().execute(class1577);
                }
                if (this.field37947.size() < this.field37942) {
                    continue;
                }
            }
        }
    }
    
    private int method32092(final Class1577 class1577) {
        int n = 0;
        final Iterator<Class1577> iterator = this.field37947.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method5661().equals(class1577.method5661())) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public synchronized void method32093(final Class2306 class2306) {
        this.field37948.add(class2306);
    }
    
    public void method32094(final Class1577 class1577) {
        this.method32096(this.field37947, class1577, true);
    }
    
    public void method32095(final Class2306 class2306) {
        this.method32096(this.field37948, class2306, false);
    }
    
    private <T> void method32096(final Deque<T> deque, final T t, final boolean b) {
        final int method32100;
        final Runnable field37944;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError((Object)"Call wasn't in-flight!");
            }
            if (b) {
                this.method32091();
            }
            method32100 = this.method32100();
            field37944 = this.field37944;
        }
        if (method32100 == 0 && field37944 != null) {
            field37944.run();
        }
    }
    
    public synchronized List<Class2305> method32097() {
        final ArrayList list = new ArrayList();
        final Iterator<Class1577> iterator = this.field37946.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().method5663());
        }
        return (List<Class2305>)Collections.unmodifiableList((List<?>)list);
    }
    
    public synchronized List<Class2305> method32098() {
        final ArrayList list = new ArrayList();
        list.addAll(this.field37948);
        final Iterator<Class1577> iterator = this.field37947.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().method5663());
        }
        return (List<Class2305>)Collections.unmodifiableList((List<?>)list);
    }
    
    public synchronized int method32099() {
        return this.field37946.size();
    }
    
    public synchronized int method32100() {
        return this.field37947.size() + this.field37948.size();
    }
}
