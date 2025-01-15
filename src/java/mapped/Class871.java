// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class871<R extends Runnable> extends Class872<R>
{
    private int field4716;
    
    public Class871(final String s) {
        super(s);
    }
    
    @Override
    public boolean method1560() {
        return this.method5373() || super.method1560();
    }
    
    public boolean method5373() {
        return this.field4716 != 0;
    }
    
    @Override
    public void run(final R r) {
        ++this.field4716;
        try {
            super.run(r);
        }
        finally {
            --this.field4716;
        }
    }
}
