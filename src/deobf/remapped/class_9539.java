package remapped;

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

public class class_9539 {
   private static final YggdrasilAuthenticationService field_48534 = new YggdrasilAuthenticationService(MinecraftClient.getInstance().method_8607());
   private static final MinecraftSessionService field_48532 = field_48534.createMinecraftSessionService();
   public static LoadingCache<String, GameProfile> field_48533 = CacheBuilder.newBuilder().expireAfterWrite(60L, TimeUnit.MINUTES).build(new class_8463());

   public static String method_43982(String var0) throws Exception {
      GameProfile var3 = (GameProfile)field_48533.get(var0);
      return var3.getName();
   }

   public static Map<Type, MinecraftProfileTexture> method_43983(String var0) {
      try {
         GameProfile var3 = (GameProfile)field_48533.get(var0);
         return field_48532.getTextures(var3, false);
      } catch (Exception var4) {
         return Maps.newHashMap();
      }
   }

   public static String method_43980(long var0) {
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

   public static String method_43981(Date var0) {
      return method_43980(System.currentTimeMillis() - var0.getTime());
   }
}
