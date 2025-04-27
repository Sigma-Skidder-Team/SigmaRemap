// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5725 implements CancellableEvent, Class5724
{
    private static String[] field23276;
    public boolean field23277;
    
    public Class5725() {
        this.field23277 = false;
    }
    
    @Override
    public boolean setCancelled(final boolean field23277) {
        return this.field23277 = field23277;
    }
    
    @Override
    public boolean isCancelled() {
        return this.field23277;
    }
}
