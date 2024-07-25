package remapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class class_6167 {
   private static class_2524[][] field_31554 = (class_2524[][])null;

   public static void method_28269() {
      field_31554 = (class_2524[][])null;
   }

   public static void method_28270() {
      method_28269();
      if (Config.method_14414()) {
         field_31554 = method_28274();
      }
   }

   private static class_2524[][] method_28274() {
      class_2524[][] var2 = new class_2524[10][0];
      String var3 = "optifine/sky/world";
      int var4 = -1;

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var3 + var5;
         ArrayList var7 = new ArrayList();

         for (int var8 = 0; var8 < 1000; var8++) {
            String var9 = var6 + "/sky" + var8 + ".properties";
            int var10 = 0;

            try {
               Identifier var11 = new Identifier(var9);
               InputStream var12 = Config.method_14374(var11);
               if (var12 == null) {
                  if (++var10 > 10) {
                     break;
                  }
               }

               class_8407 var13 = new class_8407();
               var13.load(var12);
               var12.close();
               Config.method_14277("CustomSky properties: " + var9);
               String var14 = var8 + ".png";
               class_2524 var15 = new class_2524(var13, var14);
               if (var15.method_11493(var9)) {
                  String var16 = class_8251.method_37817(var15.field_12510, ".png");
                  Identifier var17 = new Identifier(var16);
                  class_8143 var18 = class_5525.method_25065(var17);
                  if (var18 == null) {
                     Config.method_14280("CustomSky: Texture not found: " + var17);
                  } else {
                     var15.field_12508 = var18.method_37055();
                     var7.add(var15);
                     var12.close();
                  }
               }
            } catch (FileNotFoundException var19) {
               if (++var10 > 10) {
                  break;
               }
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }

         if (var7.size() > 0) {
            class_2524[] var24 = var7.<class_2524>toArray(new class_2524[var7.size()]);
            var2[var5] = var24;
            var4 = var5;
         }
      }

      if (var4 < 0) {
         return (class_2524[][])null;
      } else {
         int var21 = var4 + 1;
         class_2524[][] var22 = new class_2524[var21][0];

         for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = var2[var23];
         }

         return var22;
      }
   }

   public static void method_28272(World var0, TextureManager var1, class_7966 var2, float var3) {
      if (field_31554 != null) {
         int var6 = class_4869.method_22375(var0);
         if (var6 >= 0 && var6 < field_31554.length) {
            class_2524[] var7 = field_31554[var6];
            if (var7 != null) {
               long var8 = var0.method_29584();
               int var10 = (int)(var8 % 24000L);
               float var11 = var0.method_13578(var3);
               float var12 = var0.method_29578(var3);
               float var13 = var0.method_29601(var3);
               if (var12 > 0.0F) {
                  var13 /= var12;
               }

               for (int var14 = 0; var14 < var7.length; var14++) {
                  class_2524 var15 = var7[var14];
                  if (var15.method_11490(var0, var10)) {
                     var15.method_11484(var0, var2, var10, var11, var12, var13);
                  }
               }

               float var16 = 1.0F - var12;
               class_1240.method_5533(var16);
            }
         }
      }
   }

   public static boolean method_28273(World var0) {
      if (field_31554 != null) {
         int var3 = class_4869.method_22375(var0);
         if (var3 >= 0 && var3 < field_31554.length) {
            class_2524[] var4 = field_31554[var3];
            return var4 != null ? var4.length > 0 : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
