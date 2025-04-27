// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4700 implements Emitter.Listener
{
    private static String[] field20269;
    public final /* synthetic */ boolean[] field20270;
    public final /* synthetic */ Runnable[] field20271;
    public final /* synthetic */ Class4963[] field20272;
    public final /* synthetic */ Class4968 field20273;
    
    public Class4700(final Class4968 field20273, final boolean[] field20274, final Runnable[] field20275, final Class4963[] field20276) {
        this.field20273 = field20273;
        this.field20270 = field20274;
        this.field20271 = field20275;
        this.field20272 = field20276;
    }
    
    @Override
    public void call(final Object... array) {
        if (!this.field20270[0]) {
            this.field20270[0] = true;
            this.field20271[0].run();
            this.field20272[0].method14998();
            this.field20272[0] = null;
        }
    }
}
