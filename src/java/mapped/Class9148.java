// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

public final class Class9148 implements ProfileLookupCallback
{
    private static String[] field38777;
    public final /* synthetic */ GameProfile[] field38778;
    
    public Class9148(final GameProfile[] field38778) {
        this.field38778 = field38778;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.field38778[0] = gameProfile;
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        this.field38778[0] = null;
    }
}
