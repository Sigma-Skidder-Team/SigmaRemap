// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1031 implements Runnable
{
    public final /* synthetic */ Throwable field5529;
    public final /* synthetic */ Class9344 field5530;
    
    public Class1031(final Class9344 field5530, final Throwable field5531) {
        this.field5530 = field5530;
        this.field5529 = field5531;
    }
    
    @Override
    public void run() {
        Class4964.method15013(this.field5530.field40118, "websocket error", (Exception)this.field5529);
    }
}
