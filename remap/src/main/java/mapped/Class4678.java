// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4678 implements Emitter.Listener
{
    private static String[] field20215;
    public final /* synthetic */ Manager field20216;
    
    public Class4678(final Manager field20216) {
        this.field20216 = field20216;
    }
    
    @Override
    public void call(final Object... array) {
        Manager.method15086(this.field20216);
    }
}
