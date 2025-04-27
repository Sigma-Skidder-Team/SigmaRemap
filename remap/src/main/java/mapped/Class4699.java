// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4699 implements Emitter.Listener
{
    public final /* synthetic */ Manager field20267;
    public final /* synthetic */ Class1040 field20268;
    
    public Class4699(final Class1040 field20268, final Manager field20269) {
        this.field20268 = field20268;
        this.field20267 = field20269;
    }
    
    @Override
    public void call(final Object... array) {
        final Object o = (array.length <= 0) ? null : array[0];
        Manager.method15073().fine("connect_error");
        Manager.method15078(this.field20267);
        this.field20267.readyState = Manager.ReadyState.CLOSED;
        Manager.method15079(this.field20267, "connect_error", new Object[] { o });
        if (this.field20268.field5574 == null) {
            Manager.method15080(this.field20267);
        }
        else {
            this.field20268.field5574.method27770(new Class2346("Connection error", (o instanceof Exception) ? ((Exception)o) : null));
        }
    }
}
