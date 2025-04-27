// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4701 implements Emitter.Listener
{
    public final /* synthetic */ int[] field20274;
    public final /* synthetic */ Runnable field20275;
    public final /* synthetic */ Class1189 field20276;
    
    public Class4701(final Class1189 field20276, final int[] field20277, final Runnable field20278) {
        this.field20276 = field20276;
        this.field20274 = field20277;
        this.field20275 = field20278;
    }
    
    @Override
    public void call(final Object... array) {
        Class4965.method15024().fine("pre-pause writing complete");
        final int[] field20274 = this.field20274;
        final int n = 0;
        final int n2 = field20274[n] - 1;
        field20274[n] = n2;
        if (n2 == 0) {
            this.field20275.run();
        }
    }
}
