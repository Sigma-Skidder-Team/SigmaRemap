package mapped;

import com.google.common.cache.CacheBuilder;
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
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SkinManager {
   private final TextureManager field45648;
   private final File field45649;
   private final MinecraftSessionService field45650;
   private final LoadingCache<String, Map<Type, MinecraftProfileTexture>> field45651;

   public SkinManager(TextureManager var1, File var2, MinecraftSessionService var3) {
      this.field45648 = var1;
      this.field45649 = var2;
      this.field45650 = var3;
      this.field45651 = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new Class4560(this, var3));
   }

   public ResourceLocation method38344(MinecraftProfileTexture var1, Type var2) {
      return this.method38345(var1, var2, (Class7979)null);
   }

   private ResourceLocation method38345(MinecraftProfileTexture var1, Type var2, Class7979 var3) {
      String var6 = Hashing.sha1().hashUnencodedChars(var1.getHash()).toString();
      ResourceLocation var7 = new ResourceLocation("skins/" + var6);
      Class290 var8 = this.field45648.getTexture(var7);
      if (var8 == null) {
         File var9 = new File(this.field45649, var6.length() <= 2 ? "xx" : var6.substring(0, 2));
         File var10 = new File(var9, var6);
         Class294 var11 = new Class294(var10, var1.getUrl(), Class7209.method22636(), var2 == Type.SKIN, () -> {
            if (var3 != null) {
               var3.method27117(var2, var7, var1);
            }
         });
         this.field45648.method1073(var7, var11);
      } else if (var3 != null) {
         var3.method27117(var2, var7, var1);
      }

      return var7;
   }

   public void method38346(GameProfile var1, Class7979 var2, boolean var3) {
      Runnable var6 = () -> {
         HashMap var6x = Maps.newHashMap();

         try {
            var6x.putAll(this.field45650.getTextures(var1, var3));
         } catch (InsecureTextureException var9) {
         }

         if (var6x.isEmpty()) {
            var1.getProperties().clear();
            if (var1.getId().equals(Minecraft.getInstance().getSession().getProfile().getId())) {
               var1.getProperties().putAll(Minecraft.getInstance().getProfileProperties());
               var6x.putAll(this.field45650.getTextures(var1, false));
            } else {
               this.field45650.fillProfileProperties(var1, var3);

               try {
                  var6x.putAll(this.field45650.getTextures(var1, var3));
               } catch (InsecureTextureException var8) {
               }
            }
         }

         Minecraft.getInstance().execute(() -> RenderSystem.method27810(() -> ImmutableList.of(Type.SKIN, Type.CAPE).forEach(var3xx -> {
                  if (var6x.containsKey(var3xx)) {
                     this.method38345((MinecraftProfileTexture)var6x.get(var3xx), var3xx, var2);
                  }
               })));
      };
      Util.getServerExecutor().execute(var6);
   }

   public Map<Type, MinecraftProfileTexture> method38347(GameProfile var1) {
      Property var4 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
      return (Map<Type, MinecraftProfileTexture>)(var4 != null ? (Map)this.field45651.getUnchecked(var4.getValue()) : ImmutableMap.of());
   }
}
