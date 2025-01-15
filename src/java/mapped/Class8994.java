// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import java.util.List;
import com.mojang.authlib.ProfileLookupCallback;

public final class Class8994 implements ProfileLookupCallback
{
    public final /* synthetic */ Class394 field37949;
    public final /* synthetic */ List field37950;
    
    public Class8994(final Class394 field37949, final List field37950) {
        this.field37949 = field37949;
        this.field37950 = field37950;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.field37949.method1556().method29193(gameProfile);
        this.field37950.add(gameProfile);
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        Class7450.method22935().warn("Could not lookup user whitelist entry for {}", (Object)gameProfile.getName(), (Object)ex);
    }
}
