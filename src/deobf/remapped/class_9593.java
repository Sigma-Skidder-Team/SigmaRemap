package remapped;

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
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class class_9593 {
   private final TextureManager field_48888;
   private final File field_48890;
   private final MinecraftSessionService field_48889;
   private final LoadingCache<String, Map<Type, MinecraftProfileTexture>> field_48891;

   public class_9593(TextureManager var1, File var2, MinecraftSessionService var3) {
      this.field_48888 = var1;
      this.field_48890 = var2;
      this.field_48889 = var3;
      this.field_48891 = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new class_173(this, var3));
   }

   public Identifier method_44311(MinecraftProfileTexture var1, Type var2) {
      return this.method_44312(var1, var2, (class_3219)null);
   }

   private Identifier method_44312(MinecraftProfileTexture var1, Type var2, class_3219 var3) {
      String var6 = Hashing.sha1().hashUnencodedChars(var1.getHash()).toString();
      Identifier var7 = new Identifier("skins/" + var6);
      class_8143 var8 = this.field_48888.method_35679(var7);
      if (var8 == null) {
         File var9 = new File(this.field_48890, var6.length() <= 2 ? "xx" : var6.substring(0, 2));
         File var10 = new File(var9, var6);
         class_9211 var11 = new class_9211(var10, var1.getUrl(), class_1512.method_6922(), var2 == Type.SKIN, () -> {
            if (var3 != null) {
               var3.method_14759(var2, var7, var1);
            }
         });
         this.field_48888.method_35682(var7, var11);
      } else if (var3 != null) {
         var3.method_14759(var2, var7, var1);
      }

      return var7;
   }

   public void method_44309(GameProfile var1, class_3219 var2, boolean var3) {
      Runnable var6 = () -> {
         HashMap var6x = Maps.newHashMap();

         try {
            var6x.putAll(this.field_48889.getTextures(var1, var3));
         } catch (InsecureTextureException var9) {
         }

         if (var6x.isEmpty()) {
            var1.getProperties().clear();
            if (var1.getId().equals(MinecraftClient.getInstance().method_8502().method_5370().getId())) {
               var1.getProperties().putAll(MinecraftClient.getInstance().method_8579());
               var6x.putAll(this.field_48889.getTextures(var1, false));
            } else {
               this.field_48889.fillProfileProperties(var1, var3);

               try {
                  var6x.putAll(this.field_48889.getTextures(var1, var3));
               } catch (InsecureTextureException var8) {
               }
            }
         }

         MinecraftClient.getInstance().execute(() -> RenderSystem.method_16474(() -> ImmutableList.of(Type.SKIN, Type.CAPE).forEach(var3xx -> {
                  if (var6x.containsKey(var3xx)) {
                     this.method_44312((MinecraftProfileTexture)var6x.get(var3xx), var3xx, var2);
                  }
               })));
      };
      Util.getMainWorkerExecutor().execute(var6);
   }

   public Map<Type, MinecraftProfileTexture> method_44310(GameProfile var1) {
      Property var4 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
      return (Map<Type, MinecraftProfileTexture>)(var4 != null ? (Map)this.field_48891.getUnchecked(var4.getValue()) : ImmutableMap.of());
   }
}
