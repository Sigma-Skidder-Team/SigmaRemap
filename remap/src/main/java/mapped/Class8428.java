// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

public class Class8428
{
    private static final YggdrasilAuthenticationService field34589;
    private static final MinecraftSessionService field34590;
    public static LoadingCache<String, GameProfile> field34591;
    
    public static String method28146(final String s) throws Exception {
        return ((GameProfile)Class8428.field34591.get((Object)s)).getName();
    }
    
    public static Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> method28147(final String s) {
        try {
            return Class8428.field34590.getTextures((GameProfile)Class8428.field34591.get((Object)s), false);
        }
        catch (final Exception ex) {
            return Maps.newHashMap();
        }
    }
    
    public static void method28148(final String s) {
        Realms.method25375(s);
    }
    
    public static String method28149(final Long n) {
        if (n < 0L) {
            return "right now";
        }
        final long lng = n / 1000L;
        if (lng < 60L) {
            return ((lng != 1L) ? (lng + " seconds") : "1 second") + " ago";
        }
        if (lng < 3600L) {
            final long lng2 = lng / 60L;
            return ((lng2 != 1L) ? (lng2 + " minutes") : "1 minute") + " ago";
        }
        if (lng >= 86400L) {
            final long lng3 = lng / 86400L;
            return ((lng3 != 1L) ? (lng3 + " days") : "1 day") + " ago";
        }
        final long lng4 = lng / 3600L;
        return ((lng4 != 1L) ? (lng4 + " hours") : "1 hour") + " ago";
    }
    
    static {
        field34589 = new YggdrasilAuthenticationService(Realms.method25352(), UUID.randomUUID().toString());
        field34590 = Class8428.field34589.createMinecraftSessionService();
        Class8428.field34591 = (LoadingCache<String, GameProfile>)CacheBuilder.newBuilder().expireAfterWrite(60L, TimeUnit.MINUTES).build((CacheLoader)new Class6049());
    }
}
