// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.exploit.disablers.PingSpoofDisabler;

public class Class8438
{
    private static String[] field34680;
    private final long field34681;
    private final IPacket<?> field34682;
    public final /* synthetic */ PingSpoofDisabler field34683;
    
    public Class8438(final PingSpoofDisabler field34683, final IPacket<?> field34684, final long n) {
        this.field34683 = field34683;
        this.field34682 = field34684;
        this.field34681 = System.currentTimeMillis() + n;
    }
    
    public boolean method28168() {
        return this.field34681 - System.currentTimeMillis() < 0L;
    }
    
    public IPacket<?> method28169() {
        return this.field34682;
    }
}
