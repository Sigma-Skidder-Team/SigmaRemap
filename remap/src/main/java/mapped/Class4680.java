// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;
import io.socket.emitter.Emitter;

public class Class4680 implements Emitter.Listener
{
    private static String[] field20218;
    public final /* synthetic */ Manager field20219;
    public final /* synthetic */ Class1040 field20220;
    
    public Class4680(final Class1040 field20220, final Manager field20221) {
        this.field20220 = field20220;
        this.field20219 = field20221;
    }
    
    @Override
    public void call(final Object... array) {
        Manager.method15077(this.field20219);
        if (this.field20220.field5574 != null) {
            this.field20220.field5574.method27770(null);
        }
    }
}
