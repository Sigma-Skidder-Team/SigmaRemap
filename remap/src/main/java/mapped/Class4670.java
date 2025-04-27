// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4670 implements Emitter.Listener
{
    public final /* synthetic */ Manager field20197;
    public final /* synthetic */ Class1040 field20198;
    
    public Class4670(final Class1040 field20198, final Manager field20199) {
        this.field20198 = field20198;
        this.field20197 = field20199;
    }
    
    @Override
    public void call(final Object... array) {
        this.field20197.emit("transport", array);
    }
}
