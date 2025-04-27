// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4694 implements Emitter.Listener
{
    private static String[] field20255;
    public final /* synthetic */ Manager field20256;
    
    public Class4694(final Manager field20256) {
        this.field20256 = field20256;
    }
    
    @Override
    public void call(final Object... array) {
        Manager.method15088(this.field20256, (String)array[0]);
    }
}
