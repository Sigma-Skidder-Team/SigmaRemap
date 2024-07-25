package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Executor;

public class class_4077 {
   public static Properties method_18799(class_4639 var0) {
      String var3 = var0.method_21456();
      class_8407 var4 = new class_8407();
      String var5 = ".png";
      if (!var3.endsWith(var5)) {
         return var4;
      } else {
         String var6 = var3.substring(0, var3.length() - var5.length()) + ".properties";

         try {
            class_4639 var7 = new class_4639(var0.method_21461(), var6);
            InputStream var8 = class_3111.method_14375(class_3111.method_14450(), var7);
            if (var8 == null) {
               return var4;
            }

            class_3111.method_14280("Loading " + var6);
            var4.load(var8);
            var8.close();
         } catch (FileNotFoundException var9) {
         } catch (IOException var10) {
            var10.printStackTrace();
         }

         return var4;
      }
   }

   public static Int2ObjectMap<Float> method_18802(Properties var0) {
      Int2ObjectOpenHashMap var3 = new Int2ObjectOpenHashMap();

      for (String var5 : var0.keySet()) {
         String var6 = "width.";
         if (var5.startsWith(var6)) {
            String var7 = var5.substring(var6.length());
            int var8 = class_3111.method_14361(var7, -1);
            if (var8 >= 0) {
               String var9 = var0.getProperty(var5);
               float var10 = class_3111.method_14445(var9, -1.0F);
               if (var10 >= 0.0F) {
                  char var11 = (char)var8;
                  var3.put(var11, new Float(var10));
               }
            }
         }
      }

      return var3;
   }

   public static float method_18797(Properties var0, String var1, float var2) {
      String var5 = var0.getProperty(var1);
      if (var5 != null) {
         float var6 = class_3111.method_14445(var5, Float.MIN_VALUE);
         if (var6 != Float.MIN_VALUE) {
            return var6;
         } else {
            class_3111.method_14317("Invalid value for " + var1 + ": " + var5);
            return var2;
         }
      } else {
         return var2;
      }
   }

   public static boolean method_18796(Properties var0, String var1, boolean var2) {
      String var5 = var0.getProperty(var1);
      if (var5 != null) {
         String var6 = var5.toLowerCase().trim();
         if (var6.equals("true") || var6.equals("on")) {
            return true;
         } else if (!var6.equals("false") && !var6.equals("off")) {
            class_3111.method_14317("Invalid value for " + var1 + ": " + var5);
            return var2;
         } else {
            return false;
         }
      } else {
         return var2;
      }
   }

   public static class_4639 method_18801(class_4639 var0) {
      if (class_3111.method_14360()) {
         if (var0 != null) {
            if (class_3111.method_14272()) {
               String var3 = var0.method_21456();
               String var4 = "textures/";
               String var5 = "optifine/";
               if (var3.startsWith(var4)) {
                  var3 = var3.substring(var4.length());
                  var3 = var5 + var3;
                  class_4639 var6 = new class_4639(var0.method_21461(), var3);
                  return !class_3111.method_14363(class_3111.method_14450(), var6) ? var0 : var6;
               } else {
                  return var0;
               }
            } else {
               return var0;
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static void method_18798() {
      class_6737 var2 = new class_6737();
      Executor var3 = class_9665.method_44661();
      class_1893 var4 = class_1893.method_8510();
      class_950 var5 = (class_950)class_7860.method_35557(var4, class_7860.field_39860);
      if (var5 != null) {
         var5.method_4189().method_10277(var2, class_3111.method_14450(), class_8677.field_44535, class_8677.field_44535, var3, var4);
      }
   }
}
