// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class4664 implements Emitter.Listener
{
    public final /* synthetic */ Class4968 field20177;
    public final /* synthetic */ Class4968 field20178;
    
    public Class4664(final Class4968 field20178, final Class4968 field20179) {
        this.field20178 = field20178;
        this.field20177 = field20179;
    }
    
    @Override
    public void call(final Object... array) {
        Class4968.method15139(this.field20177, "transport close");
    }
}
