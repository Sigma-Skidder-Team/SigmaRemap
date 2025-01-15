// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class936 implements Runnable
{
    public final /* synthetic */ Object[] field4934;
    public final /* synthetic */ Class4667 field4935;
    
    public Class936(final Class4667 field4935, final Object[] field4936) {
        this.field4935 = field4935;
        this.field4934 = field4936;
    }
    
    @Override
    public void run() {
        Class4966.method15035(this.field4935.field20190, "xhr poll error", (this.field4934.length > 0 && this.field4934[0] instanceof Exception) ? ((Exception)this.field4934[0]) : null);
    }
}
