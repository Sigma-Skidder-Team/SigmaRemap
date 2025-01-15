// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import com.mojang.authlib.GameProfile;

public class Class8426
{
    private static String[] field34582;
    private final GameProfile field34583;
    private final Date field34584;
    public final /* synthetic */ Class8608 field34585;
    
    private Class8426(final Class8608 field34585, final GameProfile field34586, final Date field34587) {
        this.field34585 = field34585;
        this.field34583 = field34586;
        this.field34584 = field34587;
    }
    
    public GameProfile method28143() {
        return this.field34583;
    }
    
    public Date method28144() {
        return this.field34584;
    }
}
