// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class NamedRunnable implements Runnable
{
    public final String field8814;
    
    public NamedRunnable(final String s, final Object... array) {
        this.field8814 = Class7690.method24456(s, array);
    }
    
    @Override
    public final void run() {
        final String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.field8814);
        try {
            this.execute();
        }
        finally {
            Thread.currentThread().setName(name);
        }
    }
    
    public abstract void execute();
}
