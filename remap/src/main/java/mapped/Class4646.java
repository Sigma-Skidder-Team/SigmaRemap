// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.text.ITextComponent;

public class Class4646
{
    private final int field20112;
    private final Class101 field20113;
    private final GameProfile field20114;
    public ITextComponent field20115;
    public final /* synthetic */ Class4330 field20116;
    
    public Class4646(final Class4330 field20116, final GameProfile field20117, final int field20118, final Class101 field20119, final ITextComponent field20120) {
        this.field20116 = field20116;
        this.field20114 = field20117;
        this.field20112 = field20118;
        this.field20113 = field20119;
        this.field20115 = field20120;
    }
    
    public GameProfile method13869() {
        return this.field20114;
    }
    
    public int method13870() {
        return this.field20112;
    }
    
    public Class101 method13871() {
        return this.field20113;
    }
    
    @Nullable
    public ITextComponent method13872() {
        return this.field20115;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("latency", this.field20112).add("gameMode", (Object)this.field20113).add("profile", (Object)this.field20114).add("displayName", (Object)((this.field20115 != null) ? Class5953.method17869(this.field20115) : null)).toString();
    }
}
