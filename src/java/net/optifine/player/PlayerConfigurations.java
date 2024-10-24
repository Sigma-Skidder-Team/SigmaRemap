package net.optifine.player;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.BipedModel;
import mapped.Class7733;
import mapped.Class7773;
import mapped.ClientPlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;

import java.util.HashMap;
import java.util.Map;

public class PlayerConfigurations {
   private static Map field33267 = null;
   private static boolean field33268 = Boolean.getBoolean("player.models.reload");
   private static long field33269 = System.currentTimeMillis();

   public static void method25667(BipedModel var0, AbstractClientPlayerEntity var1, MatrixStack var2, Class7733 var3, int var4, int var5) {
      Class7773 var8 = getPlayerConfiguration(var1);
      if (var8 != null) {
         var8.method25749(var0, var1, var2, var3, var4, var5);
      }
   }

   public static synchronized Class7773 getPlayerConfiguration(AbstractClientPlayerEntity var0) {
      if (field33268 && System.currentTimeMillis() > field33269 + 5000L) {
         ClientPlayerEntity var3 = Minecraft.getInstance().player;
         if (var3 != null) {
            method25669(var3.getNameClear(), (Class7773)null);
            field33269 = System.currentTimeMillis();
         }
      }

      return null;
   }

   public static synchronized void method25669(String var0, Class7773 var1) {
      method25670().put(var0, var1);
   }

   private static Map method25670() {
      if (field33267 == null) {
         field33267 = new HashMap();
      }

      return field33267;
   }
}
