// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

public final class Class8358 implements ProfileLookupCallback
{
    public final /* synthetic */ MinecraftServer field34290;
    public final /* synthetic */ Class8008 field34291;
    
    public Class8358(final MinecraftServer field34290, final Class8008 field34291) {
        this.field34290 = field34290;
        this.field34291 = field34291;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.field34290.method1556().method29193(gameProfile);
        ((Class8006<K, Class6023>)this.field34291).method26206(new Class6023(gameProfile, this.field34290.method1448(), false));
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        Class7450.method22935().warn("Could not lookup oplist entry for {}", (Object)gameProfile.getName(), (Object)ex);
        if (ex instanceof ProfileNotFoundException) {
            return;
        }
        throw new Class2371("Could not request user " + gameProfile.getName() + " from backend systems", ex, null);
    }
}
