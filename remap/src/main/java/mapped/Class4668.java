// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4668 implements Emitter.Listener
{
    private static String[] field20192;
    public final /* synthetic */ Manager field20193;
    
    public Class4668(final Manager field20193) {
        this.field20193 = field20193;
    }
    
    @Override
    public void call(final Object... array) {
        Manager.method15087(this.field20193, (Exception)array[0]);
    }
}
