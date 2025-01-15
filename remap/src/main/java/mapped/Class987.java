// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class Class987 implements Runnable, Class988
{
    private final Object field5267;
    private final Runnable field5268;
    private final long field5269;
    private final long field5270;
    private ScheduledFuture<?> field5271;
    private volatile Thread field5272;
    public final /* synthetic */ Class6558 field5273;
    
    private Class987(final Class6558 field5273, final Object field5274, final Runnable field5275, final long field5276, final long field5277) {
        this.field5273 = field5273;
        this.field5267 = field5274;
        this.field5268 = field5275;
        this.field5269 = field5276;
        this.field5270 = field5277;
    }
    
    public void method5599() {
        if (this.field5270 != 0L) {
            this.field5271 = Class6558.method19880(this.field5273).scheduleAtFixedRate(this, this.field5269, this.field5270, TimeUnit.MILLISECONDS);
        }
        else {
            this.field5271 = Class6558.method19880(this.field5273).schedule(this, this.field5269, TimeUnit.MILLISECONDS);
        }
    }
    
    @Override
    public Object method5600() {
        return this.field5267;
    }
    
    @Override
    public Class2104 method5601() {
        if (this.field5271 == null) {
            return Class2104.field12200;
        }
        if (this.field5271.isCancelled()) {
            return Class2104.field12201;
        }
        if (!this.field5271.isDone()) {
            return Class2104.field12200;
        }
        return Class2104.field12202;
    }
    
    @Override
    public void method5602() {
        if (this.field5271 != null) {
            this.field5271.cancel(false);
            final Thread field5272 = this.field5272;
            if (field5272 != null) {
                field5272.interrupt();
            }
            this.method5603();
        }
    }
    
    @Override
    public void run() {
        Class6558.method19881(this.field5273).execute(() -> {
            this.field5272 = Thread.currentThread();
            try {
                this.field5268.run();
            }
            catch (final Exception ex) {
                Class7618.method23938().error("Exception in task {} by plugin {}", (Object)this.field5268, this.field5267, (Object)ex);
            }
            finally {
                this.field5272 = null;
            }
        });
    }
    
    private void method5603() {
        Class6558.method19879(this.field5273).remove(this.field5267, (Object)this);
    }
}
