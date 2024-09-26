package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.util.ResourceLocation;

import java.io.File;
import java.util.regex.Pattern;

public class Class8156 {
   private static final Pattern field35100 = Pattern.compile("[a-zA-Z0-9_]+");

   public static void method28291(AbstractClientPlayerEntity var0) {
      String var3 = var0.method5379();
      if (var3 != null && !var3.isEmpty() && !var3.contains("\u0000") && field35100.matcher(var3).matches()) {
         String var4 = "http://s.optifine.net/capes/" + var3 + ".png";
         ResourceLocation var5 = new ResourceLocation("capeof/" + var3);
         TextureManager var6 = Minecraft.getInstance().getTextureManager();
         Class290 var7 = var6.getTexture(var5);
         if (var7 != null && var7 instanceof Class294) {
            Class294 var8 = (Class294)var7;
            if (var8.field1147 != null) {
               if (var8.field1147) {
                  var0.method5381(var5);
                  if (var8.method1156() instanceof Class1458) {
                     Class1458 var12 = (Class1458)var8.method1156();
                     var0.method5383(var12.method6463());
                  }
               }

               return;
            }
         }

         Class1458 var11 = new Class1458(var0, var5);
         ResourceLocation var9 = Class8684.field39210;
         Class294 var10 = new Class294((File)null, var4, var9, false, var11);
         var10.field1148 = true;
         var6.method1073(var5, var10);
      }
   }

   public static Class1806 method28292(Class1806 var0) {
      byte var3 = 64;
      byte var4 = 32;
      int var5 = var0.method7886();

      for (int var6 = var0.method7887(); var3 < var5 || var4 < var6; var4 *= 2) {
         var3 *= 2;
      }

      Class1806 var7 = new Class1806(var3, var4, true);
      var7.method7903(var0);
      var0.close();
      return var7;
   }

   public static boolean method28293(Class1806 var0, Class1806 var1) {
      return var0.method7886() > var1.method7887();
   }

   public static void method28294(AbstractClientPlayerEntity var0) {
      String var3 = var0.method5379();
      ResourceLocation var4 = new ResourceLocation("capeof/" + var3);
      TextureManager var5 = Class7944.method26861();
      Class290 var6 = var5.getTexture(var4);
      if (var6 instanceof Class293) {
         Class293 var7 = (Class293)var6;
         var7.method1132();
         var5.method1081(var4);
      }

      var0.method5381((ResourceLocation)null);
      var0.method5383(false);
      method28291(var0);
   }
}
