// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4689 implements Emitter.Listener
{
    private static String[] field20241;
    public final /* synthetic */ Runnable field20242;
    public final /* synthetic */ Runnable field20243;
    public final /* synthetic */ Class1001 field20244;
    
    public Class4689(final Class1001 field20244, final Runnable field20245, final Runnable field20246) {
        this.field20244 = field20244;
        this.field20242 = field20245;
        this.field20243 = field20246;
    }
    
    @Override
    public void call(final Object... array) {
        if (!Class4968.method15153(this.field20244.field5342)) {
            this.field20243.run();
        }
        else {
            this.field20242.run();
        }
    }
}
