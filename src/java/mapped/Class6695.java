package mapped;

import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class Class6695 {
   private static Class6963 field29318 = null;
   private static final Random field29319 = new Random();

   public static Class6963 method20415() {
      return field29318;
   }

   public static void method20416() {
      field29318 = null;
      String[] var2 = method20417();
      if (var2.length > 1) {
         Properties[] var3 = method20418(var2);
         int[] var4 = method20419(var3);
         int var5 = method20420(var4);
         String var6 = var2[var5];
         Object var7 = var3[var5];
         if (var7 == null) {
            var7 = var3[0];
         }

         if (var7 == null) {
            var7 = new Class20();
         }

         Class6963 var8 = new Class6963(var6, (Properties)var7);
         field29318 = var8;
      }
   }

   private static String[] method20417() {
      List<String> var2 = new ArrayList();
      var2.add("textures/gui/title/background");

      for (int var3 = 0; var3 < 100; var3++) {
         String var4 = "optifine/gui/background" + var3;
         String var5 = var4 + "/panorama_0.png";
         ResourceLocation var6 = new ResourceLocation(var5);
         if (Class7944.method26866(var6)) {
            var2.add(var4);
         }
      }

      return var2.toArray(new String[var2.size()]);
   }

   private static Properties[] method20418(String[] var0) {
      Properties[] var3 = new Properties[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         String var5 = var0[var4];
         if (var4 == 0) {
            var5 = "optifine/gui";
         } else {
            Class7944.method26810("CustomPanorama: " + var5);
         }

         ResourceLocation var6 = new ResourceLocation(var5 + "/background.properties");

         try {
            InputStream var7 = Class7944.method26863(var6);
            if (var7 != null) {
               Class20 var8 = new Class20();
               var8.load(var7);
               Class7944.method26810("CustomPanorama: " + var6.getPath());
               var3[var4] = var8;
               var7.close();
            }
         } catch (IOException var9) {
         }
      }

      return var3;
   }

   private static int[] method20419(Properties[] var0) {
      int[] var3 = new int[var0.length];

      for (int var4 = 0; var4 < var3.length; var4++) {
         Properties var5 = var0[var4];
         if (var5 == null) {
            var5 = var0[0];
         }

         if (var5 != null) {
            String var6 = var5.getProperty("weight", (String)null);
            var3[var4] = Class7944.method26899(var6, 1);
         } else {
            var3[var4] = 1;
         }
      }

      return var3;
   }

   private static int method20420(int[] var0) {
      int var3 = Class7317.method23168(var0);
      int var4 = field29319.nextInt(var3);
      int var5 = 0;

      for (int var6 = 0; var6 < var0.length; var6++) {
         var5 += var0[var6];
         if (var5 > var4) {
            return var6;
         }
      }

      return var0.length - 1;
   }
}
