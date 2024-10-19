package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;

import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SkinManager {
   private final TextureManager textureManager;
   private final File skinCacheDir;
   private final MinecraftSessionService sessionService;
   private final LoadingCache<String, Map<Type, MinecraftProfileTexture>> skinCacheLoader;

   public SkinManager(TextureManager var1, File var2, MinecraftSessionService var3) {
      this.textureManager = var1;
      this.skinCacheDir = var2;
      this.sessionService = var3;
      this.skinCacheLoader = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader<String, Map<Type, MinecraftProfileTexture>>()
      {
         public Map<Type, MinecraftProfileTexture> load(String p_load_1_)
         {
            GameProfile gameprofile = new GameProfile((UUID)null, "dummy_mcdummyface");
            gameprofile.getProperties().put("textures", new Property("textures", p_load_1_, ""));

            try
            {
               return sessionService.getTextures(gameprofile, false);
            }
            catch (Throwable throwable)
            {
               return ImmutableMap.of();
            }
         }
      });
   }

   public ResourceLocation method38344(MinecraftProfileTexture var1, Type var2) {
      return this.loadSkin(var1, var2, (ISkinAvailableCallback)null);
   }

   private ResourceLocation loadSkin(MinecraftProfileTexture var1, Type var2, ISkinAvailableCallback skinAvailableCallback) {
      String var6 = Hashing.sha1().hashUnencodedChars(var1.getHash()).toString();
      ResourceLocation var7 = new ResourceLocation("skins/" + var6);
      Texture texture = this.textureManager.getTexture(var7);
      if (texture == null) {
         File var9 = new File(this.skinCacheDir, var6.length() <= 2 ? "xx" : var6.substring(0, 2));
         File var10 = new File(var9, var6);
         DownloadingTexture var11 = new DownloadingTexture(var10, var1.getUrl(), DefaultPlayerSkin.getDefaultSkinLegacy(), var2 == Type.SKIN, () -> {
            if (skinAvailableCallback != null) {
               skinAvailableCallback.onSkinTextureAvailable(var2, var7, var1);
            }
         });
         this.textureManager.loadTexture(var7, var11);
      } else if (skinAvailableCallback != null) {
         skinAvailableCallback.onSkinTextureAvailable(var2, var7, var1);
      }

      return var7;
   }

      public void method38loadProfileTextures346(GameProfile var1, ISkinAvailableCallback var2, boolean var3) {
      Runnable var6 = () -> {
         Map<Type, MinecraftProfileTexture> map = Maps.newHashMap();

         try {
            map.putAll(this.sessionService.getTextures(var1, var3));
         } catch (InsecureTextureException var9) {
         }

         if (map.isEmpty()) {
            var1.getProperties().clear();
            if (var1.getId().equals(Minecraft.getInstance().getSession().getProfile().getId())) {
               var1.getProperties().putAll(Minecraft.getInstance().getProfileProperties());
               map.putAll(this.sessionService.getTextures(var1, false));
            } else {
               this.sessionService.fillProfileProperties(var1, var3);

               try {
                  map.putAll(this.sessionService.getTextures(var1, var3));
               } catch (InsecureTextureException var8) {
               }
            }
         }

         Minecraft.getInstance().execute(() -> RenderSystem.recordRenderCall(() -> ImmutableList.of(Type.SKIN, Type.CAPE).forEach(var3xx -> {
                  if (map.containsKey(var3xx)) {
                     this.loadSkin((MinecraftProfileTexture)map.get(var3xx), var3xx, var2);
                  }
               })));
      };
      Util.getServerExecutor().execute(var6);
   }

   public Map<Type, MinecraftProfileTexture> loadSkinFromCache(GameProfile var1) {
      Property var4 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
      return (Map<Type, MinecraftProfileTexture>)(var4 != null ? (Map)this.skinCacheLoader.getUnchecked(var4.getValue()) : ImmutableMap.of());
   }

   public static interface ISkinAvailableCallback {
      void onSkinTextureAvailable(Type var1, ResourceLocation var2, MinecraftProfileTexture var3);
   }
}
