package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class class_877 {
   private static class_1158 field_4523 = null;
   private static final Random field_4524 = new Random();

   public static class_1158 method_3780() {
      return field_4523;
   }

   public static void method_3778() {
      field_4523 = null;
      String[] var2 = method_3774();
      if (var2.length > 1) {
         Properties[] var3 = method_3775(var2);
         int[] var4 = method_3776(var3);
         int var5 = method_3777(var4);
         String var6 = var2[var5];
         Object var7 = var3[var5];
         if (var7 == null) {
            var7 = var3[0];
         }

         if (var7 == null) {
            var7 = new class_8407();
         }

         class_1158 var8 = new class_1158(var6, (Properties)var7);
         field_4523 = var8;
      }
   }

   private static String[] method_3774() {
      ArrayList var2 = new ArrayList();
      var2.add("textures/gui/title/background");

      for (int var3 = 0; var3 < 100; var3++) {
         String var4 = "optifine/gui/background" + var3;
         String var5 = var4 + "/panorama_0.png";
         Identifier var6 = new Identifier(var5);
         if (class_3111.method_14362(var6)) {
            var2.add(var4);
         }
      }

      return var2.<String>toArray(new String[var2.size()]);
   }

   private static Properties[] method_3775(String[] var0) {
      Properties[] var3 = new Properties[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         String var5 = var0[var4];
         if (var4 == 0) {
            var5 = "optifine/gui";
         } else {
            class_3111.method_14277("CustomPanorama: " + var5);
         }

         Identifier var6 = new Identifier(var5 + "/background.properties");

         try {
            InputStream var7 = class_3111.method_14374(var6);
            if (var7 != null) {
               class_8407 var8 = new class_8407();
               var8.load(var7);
               class_3111.method_14277("CustomPanorama: " + var6.method_21456());
               var3[var4] = var8;
               var7.close();
            }
         } catch (IOException var9) {
         }
      }

      return var3;
   }

   private static int[] method_3776(Properties[] var0) {
      int[] var3 = new int[var0.length];

      for (int var4 = 0; var4 < var3.length; var4++) {
         Properties var5 = var0[var4];
         if (var5 == null) {
            var5 = var0[0];
         }

         if (var5 != null) {
            String var6 = var5.getProperty("weight", (String)null);
            var3[var4] = class_3111.method_14361(var6, 1);
         } else {
            var3[var4] = 1;
         }
      }

      return var3;
   }

   private static int method_3777(int[] var0) {
      int var3 = class_1750.method_7795(var0);
      int var4 = field_4524.nextInt(var3);
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
