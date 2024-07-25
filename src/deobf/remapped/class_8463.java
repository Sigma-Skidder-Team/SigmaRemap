package remapped;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;

public final class class_8463 extends CacheLoader<String, GameProfile> {
   public GameProfile load(String var1) throws Exception {
      GameProfile var4 = class_9539.method_43979().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(var1), (String)null), false);
      if (var4 != null) {
         return var4;
      } else {
         throw new Exception("Couldn't get profile");
      }
   }
}
