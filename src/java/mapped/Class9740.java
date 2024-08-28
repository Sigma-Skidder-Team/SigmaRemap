package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Class9740 {
   private static final YggdrasilAuthenticationService field45482 = new YggdrasilAuthenticationService(Minecraft.getInstance().method1535());
   private static final MinecraftSessionService field45483 = field45482.createMinecraftSessionService();
   public static LoadingCache<String, GameProfile> field45484 = CacheBuilder.newBuilder().expireAfterWrite(60L, TimeUnit.MINUTES).build(new Class4563());

   public static String method38171(String var0) throws Exception {
      GameProfile var3 = (GameProfile)field45484.get(var0);
      return var3.getName();
   }

   public static Map<Type, MinecraftProfileTexture> method38172(String var0) {
      try {
         GameProfile var3 = (GameProfile)field45484.get(var0);
         return field45483.getTextures(var3, false);
      } catch (Exception var4) {
         return Maps.newHashMap();
      }
   }

   public static String method38173(long var0) {
      if (var0 >= 0L) {
         long var4 = var0 / 1000L;
         if (var4 >= 60L) {
            if (var4 >= 3600L) {
               if (var4 >= 86400L) {
                  long var9 = var4 / 86400L;
                  return (var9 != 1L ? var9 + " days" : "1 day") + " ago";
               } else {
                  long var8 = var4 / 3600L;
                  return (var8 != 1L ? var8 + " hours" : "1 hour") + " ago";
               }
            } else {
               long var6 = var4 / 60L;
               return (var6 != 1L ? var6 + " minutes" : "1 minute") + " ago";
            }
         } else {
            return (var4 != 1L ? var4 + " seconds" : "1 second") + " ago";
         }
      } else {
         return "right now";
      }
   }

   public static String method38174(Date var0) {
      return method38173(System.currentTimeMillis() - var0.getTime());
   }

   // $VF: synthetic method
   public static MinecraftSessionService method38175() {
      return field45483;
   }
}
