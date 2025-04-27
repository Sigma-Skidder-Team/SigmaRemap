// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4695 implements Emitter.Listener
{
    public final /* synthetic */ Emitter.Listener field20257;
    public final /* synthetic */ Class4968 field20258;
    
    public Class4695(final Class4968 field20258, final Emitter.Listener field20259) {
        this.field20258 = field20258;
        this.field20257 = field20259;
    }
    
    @Override
    public void call(final Object... array) {
        this.field20257.call("socket closed");
    }
}
