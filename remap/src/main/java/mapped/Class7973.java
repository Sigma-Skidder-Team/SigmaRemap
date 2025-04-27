// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

public final class Class7973 implements ProfileLookupCallback
{
    public final /* synthetic */ MinecraftServer field32805;
    public final /* synthetic */ Class8010 field32806;
    
    public Class7973(final MinecraftServer field32805, final Class8010 field32806) {
        this.field32805 = field32805;
        this.field32806 = field32806;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.field32805.method1556().method29193(gameProfile);
        this.field32806.method26206(new Class6027(gameProfile));
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        Class7450.method22935().warn("Could not lookup user whitelist entry for {}", (Object)gameProfile.getName(), (Object)ex);
        if (ex instanceof ProfileNotFoundException) {
            return;
        }
        throw new Class2371("Could not request user " + gameProfile.getName() + " from backend systems", ex, null);
    }
}
