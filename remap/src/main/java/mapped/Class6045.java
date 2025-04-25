// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import com.google.common.cache.CacheLoader;

public class Class6045 extends CacheLoader<GameProfile, Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>>
{
    private static String[] field24594;
    public final /* synthetic */ Class7665 field24595;
    
    public Class6045(final Class7665 field24595) {
        this.field24595 = field24595;
    }
    
    public Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> load(final GameProfile gameProfile) throws Exception {
        try {
            return Minecraft.getInstance().method5301().getTextures(gameProfile, false);
        }
        catch (final Throwable t) {
            return Maps.newHashMap();
        }
    }
}
