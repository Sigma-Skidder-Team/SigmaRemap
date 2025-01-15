// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

import java.util.Locale;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import com.mojang.authlib.ProfileLookupCallback;

public final class Class6578 implements ProfileLookupCallback
{
    public final /* synthetic */ MinecraftServer field26100;
    public final /* synthetic */ Map field26101;
    public final /* synthetic */ Class8007 field26102;
    
    public Class6578(final MinecraftServer field26100, final Map field26101, final Class8007 field26102) {
        this.field26100 = field26100;
        this.field26101 = field26101;
        this.field26102 = field26102;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.field26100.method1556().method29193(gameProfile);
        final String[] array = this.field26101.get(gameProfile.getName().toLowerCase(Locale.ROOT));
        if (array != null) {
            ((Class8006<K, Class6025>)this.field26102).method26206(new Class6025(gameProfile, (array.length <= 1) ? null : Class7450.method22936(array[1], null), (array.length <= 2) ? null : array[2], (array.length <= 3) ? null : Class7450.method22936(array[3], null), (array.length <= 4) ? null : array[4]));
            return;
        }
        Class7450.method22935().warn("Could not convert user banlist entry for {}", (Object)gameProfile.getName());
        throw new Class2371("Profile not in the conversionlist", (Class6578)null);
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        Class7450.method22935().warn("Could not lookup user banlist entry for {}", (Object)gameProfile.getName(), (Object)ex);
        if (ex instanceof ProfileNotFoundException) {
            return;
        }
        throw new Class2371("Could not request user " + gameProfile.getName() + " from backend systems", ex, null);
    }
}
