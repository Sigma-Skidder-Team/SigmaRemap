// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import java.io.File;
import com.mojang.authlib.ProfileLookupCallback;

public final class Class9372 implements ProfileLookupCallback
{
    public final /* synthetic */ Class395 field40192;
    public final /* synthetic */ File field40193;
    public final /* synthetic */ File field40194;
    public final /* synthetic */ File field40195;
    public final /* synthetic */ String[] field40196;
    
    public Class9372(final Class395 field40192, final File field40193, final File field40194, final File field40195, final String[] field40196) {
        this.field40192 = field40192;
        this.field40193 = field40193;
        this.field40194 = field40194;
        this.field40195 = field40195;
        this.field40196 = field40196;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.field40192.method1556().method29193(gameProfile);
        final UUID id = gameProfile.getId();
        if (id != null) {
            this.method34775(this.field40193, this.method34776(gameProfile), id.toString());
            return;
        }
        throw new Class2371("Missing UUID for user profile " + gameProfile.getName(), (Class6578)null);
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        Class7450.method22935().warn("Could not lookup user uuid for {}", (Object)gameProfile.getName(), (Object)ex);
        if (!(ex instanceof ProfileNotFoundException)) {
            throw new Class2371("Could not request user " + gameProfile.getName() + " from backend systems", ex, null);
        }
        final String method34776 = this.method34776(gameProfile);
        this.method34775(this.field40194, method34776, method34776);
    }
    
    private void method34775(final File parent, final String s, final String str) {
        final File file = new File(this.field40195, s + ".dat");
        final File dest = new File(parent, str + ".dat");
        Class7450.method22937(parent);
        if (file.renameTo(dest)) {
            return;
        }
        throw new Class2371("Could not convert file for " + s, (Class6578)null);
    }
    
    private String method34776(final GameProfile gameProfile) {
        String s = null;
        for (final String s2 : this.field40196) {
            if (s2 != null && s2.equalsIgnoreCase(gameProfile.getName())) {
                s = s2;
                break;
            }
        }
        if (s != null) {
            return s;
        }
        throw new Class2371("Could not find the filename for " + gameProfile.getName() + " anymore", (Class6578)null);
    }
}
