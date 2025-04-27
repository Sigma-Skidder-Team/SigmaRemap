// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4683 implements Emitter.Listener
{
    public final /* synthetic */ Emitter.Listener field20226;
    public final /* synthetic */ Class4968 field20227;
    
    public Class4683(final Class4968 field20227, final Emitter.Listener field20228) {
        this.field20227 = field20227;
        this.field20226 = field20228;
    }
    
    @Override
    public void call(final Object... array) {
        this.field20226.call("transport closed");
    }
}
