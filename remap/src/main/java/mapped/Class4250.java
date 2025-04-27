// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;

import java.util.Timer;

public class Class4250 implements Handle
{
    private static String[] field19073;
    public final /* synthetic */ Timer field19074;
    public final /* synthetic */ Manager field19075;
    
    public Class4250(final Manager field19075, final Timer field19076) {
        this.field19075 = field19075;
        this.field19074 = field19076;
    }
    
    @Override
    public void destroy() {
        this.field19074.cancel();
    }
}
