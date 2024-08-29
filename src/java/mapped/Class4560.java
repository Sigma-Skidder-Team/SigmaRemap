package mapped;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableMap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import java.util.Map;
import java.util.UUID;

public class Class4560 extends CacheLoader<String, Map<Type, MinecraftProfileTexture>> {
   public final MinecraftSessionService field21995;
   public final SkinManager field21996;

   public Class4560(SkinManager var1, MinecraftSessionService var2) {
      this.field21996 = var1;
      this.field21995 = var2;
   }

   public Map<Type, MinecraftProfileTexture> load(String var1) {
      GameProfile var4 = new GameProfile((UUID)null, "dummy_mcdummyface");
      var4.getProperties().put("textures", new Property("textures", var1, ""));

      try {
         return this.field21995.getTextures(var4, false);
      } catch (Throwable var6) {
         return ImmutableMap.of();
      }
   }
}
