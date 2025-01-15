// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;

public final class Class9116
{
    private static String[] field38618;
    private final CountDownLatch field38619;
    private long field38620;
    private long field38621;
    
    public Class9116() {
        this.field38619 = new CountDownLatch(1);
        this.field38620 = -1L;
        this.field38621 = -1L;
    }
    
    public void method32979() {
        if (this.field38620 == -1L) {
            this.field38620 = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }
    
    public void method32980() {
        if (this.field38621 == -1L && this.field38620 != -1L) {
            this.field38621 = System.nanoTime();
            this.field38619.countDown();
            return;
        }
        throw new IllegalStateException();
    }
    
    public void method32981() {
        if (this.field38621 == -1L && this.field38620 != -1L) {
            this.field38621 = this.field38620 - 1L;
            this.field38619.countDown();
            return;
        }
        throw new IllegalStateException();
    }
    
    public long method32982() throws InterruptedException {
        this.field38619.await();
        return this.field38621 - this.field38620;
    }
    
    public long method32983(final long timeout, final TimeUnit unit) throws InterruptedException {
        if (!this.field38619.await(timeout, unit)) {
            return -2L;
        }
        return this.field38621 - this.field38620;
    }
}
