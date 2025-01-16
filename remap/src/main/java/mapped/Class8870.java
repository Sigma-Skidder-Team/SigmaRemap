// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.exploit.disablers.ViperDisabler;

public class Class8870
{
    private static String[] field37285;
    private long field37286;
    private IPacket field37287;
    public final /* synthetic */ ViperDisabler field37288;
    
    public Class8870(final ViperDisabler field37288, final IPacket<?> field37289, final long n) {
        this.field37288 = field37288;
        this.field37287 = field37289;
        this.field37286 = System.currentTimeMillis() + n;
    }
    
    public boolean method31165() {
        return this.field37286 - System.currentTimeMillis() < 0L;
    }
    
    public IPacket method31166() {
        return this.field37287;
    }
}
