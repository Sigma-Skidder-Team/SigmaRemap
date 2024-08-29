package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Class8715 {
   private static int[] field39327 = null;
   private static boolean field39328;

   public static int method31433(int var0) {
      if (field39327 == null) {
         return -1;
      } else {
         return var0 >= 0 && var0 < field39327.length ? field39327[var0] : -1;
      }
   }

   public static void method31434() {
      if (field39328) {
         field39328 = false;
         method31435(Shaders.method32955());
      }
   }

   public static void method31435(Class4671 var0) {
      method31440();
      if (var0 != null) {
         if (Class9299.field42965.method20214() && Minecraft.getInstance().getResourceManager() == null) {
            Class7944.method26810("[Shaders] Delayed loading of item mappings after resources are loaded");
            field39328 = true;
         } else {
            ArrayList var3 = new ArrayList();
            String var4 = "/shaders/item.properties";
            InputStream var5 = var0.method14639(var4);
            if (var5 != null) {
               method31437(var5, var4, var3);
            }

            method31436(var3);
            if (var3.size() > 0) {
               field39327 = method31439(var3);
            }
         }
      }
   }

   private static void method31436(List<Integer> var0) {
      String[] var3 = Class9561.method37049();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];

         try {
            ResourceLocation var6 = new ResourceLocation(var5, "shaders/item.properties");
            InputStream var7 = Class7944.method26863(var6);
            method31437(var7, var6.toString(), var0);
         } catch (IOException var8) {
         }
      }
   }

   private static void method31437(InputStream var0, String var1, List<Integer> var2) {
      if (var0 != null) {
         try {
            var0 = Class9711.method38047(var0, var1);
            Class20 var5 = new Class20();
            var5.load(var0);
            var0.close();
            Class7944.method26810("[Shaders] Parsing item mappings: " + var1);
            Class8896 var6 = new Class8896("Shaders");

            for (String var8 : (Set<String>) (Set<?>) var5.keySet()) {
               String var9 = var5.getProperty(var8);
               String var10 = "item.";
               if (!var8.startsWith(var10)) {
                  Class7944.method26811("[Shaders] Invalid item ID: " + var8);
               } else {
                  String var11 = Class9402.method35762(var8, var10);
                  int var12 = Class7944.method26899(var11, -1);
                  if (var12 < 0) {
                     Class7944.method26811("[Shaders] Invalid item alias ID: " + var12);
                  } else {
                     int[] var13 = var6.method32421(var9);
                     if (var13 != null && var13.length >= 1) {
                        for (int var14 = 0; var14 < var13.length; var14++) {
                           int var15 = var13[var14];
                           method31438(var2, var15, var12);
                        }
                     } else {
                        Class7944.method26811("[Shaders] Invalid item ID mapping: " + var8 + "=" + var9);
                     }
                  }
               }
            }
         } catch (IOException var16) {
            Class7944.method26811("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static void method31438(List<Integer> var0, int var1, int var2) {
      while (var0.size() <= var1) {
         var0.add(-1);
      }

      var0.set(var1, var2);
   }

   private static int[] method31439(List<Integer> var0) {
      int[] var3 = new int[var0.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = (Integer)var0.get(var4);
      }

      return var3;
   }

   public static void method31440() {
      field39327 = null;
   }
}
