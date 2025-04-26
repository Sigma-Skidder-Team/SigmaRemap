// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.List;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.net.Socket;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.Deque;
import java.util.concurrent.Executor;

public final class Class8015
{
    private static final Executor field33013;
    private final int field33014;
    private final long field33015;
    private final Runnable field33016;
    private final Deque<Class5040> field33017;
    public final Class9482 field33018;
    public boolean field33019;
    public static final /* synthetic */ boolean field33020;
    
    public Class8015() {
        this(5, 5L, TimeUnit.MINUTES);
    }
    
    public Class8015(final int field33014, final long n, final TimeUnit timeUnit) {
        this.field33016 = new Class1496(this);
        this.field33017 = new ArrayDeque<Class5040>();
        this.field33018 = new Class9482();
        this.field33014 = field33014;
        this.field33015 = timeUnit.toNanos(n);
        if (n > 0L) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + n);
    }
    
    public synchronized int method26262() {
        int n = 0;
        final Iterator<Class5040> iterator = this.field33017.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().field21594.isEmpty()) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public synchronized int method26263() {
        return this.field33017.size();
    }
    
    @Nullable
    public Class5040 method26264(final Class6353 class6353, final StreamAllocation class6354, final Class7465 class6355) {
        if (!Class8015.field33020 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (final Class5040 class6356 : this.field33017) {
            if (!class6356.method15341(class6353, class6355)) {
                continue;
            }
            class6354.method31377(class6356);
            return class6356;
        }
        return null;
    }
    
    @Nullable
    public Socket method26265(final Class6353 class6353, final StreamAllocation class6354) {
        if (!Class8015.field33020 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (final Class5040 class6355 : this.field33017) {
            if (!class6355.method15341(class6353, null)) {
                continue;
            }
            if (!class6355.method15349()) {
                continue;
            }
            if (class6355 == class6354.method31371()) {
                continue;
            }
            return class6354.method31379(class6355);
        }
        return null;
    }
    
    public void method26266(final Class5040 class5040) {
        if (!Class8015.field33020 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.field33019) {
            this.field33019 = true;
            Class8015.field33013.execute(this.field33016);
        }
        this.field33017.add(class5040);
    }
    
    public boolean method26267(final Class5040 class5040) {
        if (!Class8015.field33020 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!class5040.field21591 && this.field33014 != 0) {
            this.notifyAll();
            return false;
        }
        this.field33017.remove(class5040);
        return true;
    }
    
    public void method26268() {
        final ArrayList list = new ArrayList();
        synchronized (this) {
            final Iterator<Class5040> iterator = this.field33017.iterator();
            while (iterator.hasNext()) {
                final Class5040 class5040 = iterator.next();
                if (class5040.field21594.isEmpty()) {
                    class5040.field21591 = true;
                    list.add(class5040);
                    iterator.remove();
                }
            }
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            Class7690.method24433(((Class5040)iterator2.next()).method15330());
        }
    }
    
    public long method26269(final long n) {
        int n2 = 0;
        int n3 = 0;
        Class5040 class5040 = null;
        long n4 = Long.MIN_VALUE;
        synchronized (this) {
            for (final Class5040 class5041 : this.field33017) {
                if (this.method26270(class5041, n) > 0) {
                    ++n2;
                }
                else {
                    ++n3;
                    final long n5 = n - class5041.field21595;
                    if (n5 <= n4) {
                        continue;
                    }
                    n4 = n5;
                    class5040 = class5041;
                }
            }
            if (n4 >= this.field33015 || n3 > this.field33014) {
                this.field33017.remove(class5040);
            }
            else {
                if (n3 > 0) {
                    return this.field33015 - n4;
                }
                if (n2 > 0) {
                    return this.field33015;
                }
                this.field33019 = false;
                return -1L;
            }
        }
        Class7690.method24433(class5040.method15330());
        return 0L;
    }
    
    private int method26270(final Class5040 class5040, final long n) {
        final List<Reference<StreamAllocation>> field21594 = class5040.field21594;
        int i = 0;
        while (i < field21594.size()) {
            final Reference reference = field21594.get(i);
            if (reference.get() == null) {
                Class6550.method19842().method19849("A connection to " + class5040.method15329().method23001().method18889() + " was leaked. Did you forget to close a response body?", ((Class2)reference).field2);
                field21594.remove(i);
                class5040.field21591 = true;
                if (!field21594.isEmpty()) {
                    continue;
                }
                class5040.field21595 = n - this.field33015;
                return 0;
            }
            else {
                ++i;
            }
        }
        return field21594.size();
    }
    
    static {
        field33020 = !Class8015.class.desiredAssertionStatus();
        field33013 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Class7690.method24439("OkHttp ConnectionPool", true));
    }
}
