// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.GameProfile;
import com.google.common.cache.CacheLoader;

public final class Class6049 extends CacheLoader<String, GameProfile>
{
    public GameProfile load(final String s) throws Exception {
        final GameProfile fillProfileProperties = Class8428.method28150().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(s), (String)null), false);
        if (fillProfileProperties != null) {
            return fillProfileProperties;
        }
        throw new Exception("Couldn't get profile");
    }
}
