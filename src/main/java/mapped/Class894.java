// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class894 implements Runnable
{
    public final /* synthetic */ Object[] field4833;
    public final /* synthetic */ Class4669 field4834;
    
    public Class894(final Class4669 field4834, final Object[] field4835) {
        this.field4834 = field4834;
        this.field4833 = field4835;
    }
    
    @Override
    public void run() {
        Class4966.method15034(this.field4834.field20195, "xhr post error", (this.field4833.length > 0 && this.field4833[0] instanceof Exception) ? ((Exception)this.field4833[0]) : null);
    }
}
