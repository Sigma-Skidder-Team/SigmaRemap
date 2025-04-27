// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4697 implements Emitter.Listener
{
    private static String[] field20261;
    public final /* synthetic */ Class4968 field20262;
    public final /* synthetic */ Class4968 field20263;
    
    public Class4697(final Class4968 field20263, final Class4968 field20264) {
        this.field20263 = field20263;
        this.field20262 = field20264;
    }
    
    @Override
    public void call(final Object... array) {
        Class4968.method15140(this.field20262, (array.length <= 0) ? null : ((Exception)array[0]));
    }
}
