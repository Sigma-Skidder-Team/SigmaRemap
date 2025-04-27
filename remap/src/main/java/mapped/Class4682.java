// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4682 implements Emitter.Listener
{
    private static String[] field20223;
    public final /* synthetic */ Runnable field20224;
    public final /* synthetic */ Class4968 field20225;
    
    public Class4682(final Class4968 field20225, final Runnable field20226) {
        this.field20225 = field20225;
        this.field20224 = field20226;
    }
    
    @Override
    public void call(final Object... array) {
        this.field20224.run();
    }
}
