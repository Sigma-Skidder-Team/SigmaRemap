// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4692 implements Emitter.Listener
{
    private static String[] field20250;
    public final /* synthetic */ Manager field20251;
    
    public Class4692(final Manager field20251) {
        this.field20251 = field20251;
    }
    
    @Override
    public void call(final Object... array) {
        Manager.method15085(this.field20251);
    }
}
