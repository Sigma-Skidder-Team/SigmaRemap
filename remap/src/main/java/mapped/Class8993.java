// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.Call;
import okhttp3.RealCall;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
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
    private final Deque<RealCall.AsyncCall> field37946;
    private final Deque<RealCall.AsyncCall> field37947;
    private final Deque<RealCall> field37948;
    
    public Class8993(final ExecutorService field37945) {
        this.field37942 = 64;
        this.field37943 = 5;
        this.field37946 = new ArrayDeque<RealCall.AsyncCall>();
        this.field37947 = new ArrayDeque<RealCall.AsyncCall>();
        this.field37948 = new ArrayDeque<RealCall>();
        this.field37945 = field37945;
    }
    
    public Class8993() {
        this.field37942 = 64;
        this.field37943 = 5;
        this.field37946 = new ArrayDeque<RealCall.AsyncCall>();
        this.field37947 = new ArrayDeque<RealCall.AsyncCall>();
        this.field37948 = new ArrayDeque<RealCall>();
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
    
    public synchronized void enqueue(final RealCall.AsyncCall asyncCall) {
        if (this.field37947.size() < this.field37942 && this.method32092(asyncCall) < this.field37943) {
            this.field37947.add(asyncCall);
            this.method32083().execute(asyncCall);
        }
        else {
            this.field37946.add(asyncCall);
        }
    }
    
    public synchronized void method32090() {
        final Iterator<RealCall.AsyncCall> iterator = this.field37946.iterator();
        while (iterator.hasNext()) {
            iterator.next().get().cancel();
        }
        final Iterator<RealCall.AsyncCall> iterator2 = this.field37947.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().get().cancel();
        }
        final Iterator<RealCall> iterator3 = this.field37948.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().cancel();
        }
    }
    
    private void method32091() {
        if (this.field37947.size() >= this.field37942) {
            return;
        }
        if (!this.field37946.isEmpty()) {
            final Iterator<RealCall.AsyncCall> iterator = this.field37946.iterator();
            while (iterator.hasNext()) {
                final RealCall.AsyncCall asyncCall = iterator.next();
                if (this.method32092(asyncCall) < this.field37943) {
                    iterator.remove();
                    this.field37947.add(asyncCall);
                    this.method32083().execute(asyncCall);
                }
                if (this.field37947.size() < this.field37942) {
                    continue;
                }
            }
        }
    }
    
    private int method32092(final RealCall.AsyncCall asyncCall) {
        int n = 0;
        final Iterator<RealCall.AsyncCall> iterator = this.field37947.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().host().equals(asyncCall.host())) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public synchronized void executed(final RealCall realCall) {
        this.field37948.add(realCall);
    }
    
    public void method32094(final RealCall.AsyncCall asyncCall) {
        this.method32096(this.field37947, asyncCall, true);
    }
    
    public void finished(final RealCall realCall) {
        this.method32096(this.field37948, realCall, false);
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
    
    public synchronized List<Call> method32097() {
        final ArrayList list = new ArrayList();
        final Iterator<RealCall.AsyncCall> iterator = this.field37946.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().get());
        }
        return (List<Call>)Collections.unmodifiableList((List<?>)list);
    }
    
    public synchronized List<Call> method32098() {
        final ArrayList list = new ArrayList();
        list.addAll(this.field37948);
        final Iterator<RealCall.AsyncCall> iterator = this.field37947.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().get());
        }
        return (List<Call>)Collections.unmodifiableList((List<?>)list);
    }
    
    public synchronized int method32099() {
        return this.field37946.size();
    }
    
    public synchronized int method32100() {
        return this.field37947.size() + this.field37948.size();
    }
}
