package remapped;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableMap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import java.util.Map;
import java.util.UUID;

public class class_173 extends CacheLoader<String, Map<Type, MinecraftProfileTexture>> {
   public class_173(class_9593 var1, MinecraftSessionService var2) {
      this.field_565 = var1;
      this.field_563 = var2;
   }

   public Map<Type, MinecraftProfileTexture> load(String var1) {
      GameProfile var4 = new GameProfile((UUID)null, "dummy_mcdummyface");
      var4.getProperties().put("textures", new Property("textures", var1, ""));

      try {
         return this.field_563.getTextures(var4, false);
      } catch (Throwable var6) {
         return ImmutableMap.of();
      }
   }
}
