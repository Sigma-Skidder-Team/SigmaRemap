// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;

public class Class7665
{
    private final Class1663 field30444;
    private final File field30445;
    private final MinecraftSessionService field30446;
    private final LoadingCache<GameProfile, Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>> field30447;
    
    public Class7665(final Class1663 field30444, final File field30445, final MinecraftSessionService field30446) {
        this.field30444 = field30444;
        this.field30445 = field30445;
        this.field30446 = field30446;
        this.field30447 = (LoadingCache<GameProfile, Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>>)CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new Class6045(this));
    }
    
    public ResourceLocation method24292(final MinecraftProfileTexture minecraftProfileTexture, final MinecraftProfileTexture$Type minecraftProfileTexture$Type) {
        return this.method24293(minecraftProfileTexture, minecraftProfileTexture$Type, null);
    }
    
    public ResourceLocation method24293(final MinecraftProfileTexture minecraftProfileTexture, final MinecraftProfileTexture$Type minecraftProfileTexture$Type, final Class7723 class7723) {
        final String string = Hashing.sha1().hashUnencodedChars((CharSequence)minecraftProfileTexture.getHash()).toString();
        final ResourceLocation class7724 = new ResourceLocation("skins/" + string);
        if (this.field30444.method5853(class7724) == null) {
            this.field30444.method5851(class7724, new Class1768(new File(new File(this.field30445, (string.length() <= 2) ? "xx" : string.substring(0, 2)), string), minecraftProfileTexture.getUrl(), Class7634.method24003(), minecraftProfileTexture$Type == MinecraftProfileTexture$Type.SKIN, () -> {
                if (class7725 != null) {
                    class7725.method24658(minecraftProfileTexture$Type2, class7726, minecraftProfileTexture2);
                }
                return;
            }));
        }
        else if (class7723 != null) {
            class7723.method24658(minecraftProfileTexture$Type, class7724, minecraftProfileTexture);
        }
        return class7724;
    }
    
    public void method24294(final GameProfile gameProfile, final Class7723 class7723, final boolean b) {
        Util.method27841().execute(() -> {
            Maps.newHashMap();
            final HashMap hashMap;
            try {
                hashMap.putAll(this.field30446.getTextures(gameProfile2, b2));
            }
            catch (final InsecureTextureException ex) {}
            if (hashMap.isEmpty()) {
                gameProfile2.getProperties().clear();
                if (gameProfile2.getId().equals(Minecraft.method5277().method5287().method33694().getId())) {
                    gameProfile2.getProperties().putAll((Multimap) Minecraft.method5277().method5288());
                    hashMap.putAll(this.field30446.getTextures(gameProfile2, false));
                }
                else {
                    this.field30446.fillProfileProperties(gameProfile2, b2);
                    try {
                        hashMap.putAll(this.field30446.getTextures(gameProfile2, b2));
                    }
                    catch (final InsecureTextureException ex2) {}
                }
            }
            Minecraft.method5277().execute(() -> Class8726.method29991(() -> ImmutableList.of((Object)MinecraftProfileTexture$Type.SKIN, (Object)MinecraftProfileTexture$Type.CAPE).forEach(minecraftProfileTexture$Type -> {
                if (!(!map2.containsKey(minecraftProfileTexture$Type))) {
                    this.method24293(map2.get(minecraftProfileTexture$Type), minecraftProfileTexture$Type, class7724);
                }
            })));
        });
    }
    
    public Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> method24295(final GameProfile gameProfile) {
        return (Map)this.field30447.getUnchecked((Object)gameProfile);
    }
}
