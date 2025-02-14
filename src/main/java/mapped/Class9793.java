package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Class9793 {
   private static int[] field45790 = null;
   private static boolean field45791;

   public static int method38604(int var0) {
      if (field45790 == null) {
         return -1;
      } else {
         return var0 >= 0 && var0 < field45790.length ? field45790[var0] : -1;
      }
   }

   public static void method38605() {
      if (field45791) {
         field45791 = false;
         method38606(Shaders.method32955());
      }
   }

   public static void method38606(Class4671 var0) {
      method38611();
      if (var0 != null) {
         if (Reflector.field42965.exists() && Minecraft.getInstance().getResourceManager() == null) {
            Config.method26810("[Shaders] Delayed loading of entity mappings after resources are loaded");
            field45791 = true;
         } else {
            ArrayList var3 = new ArrayList();
            String var4 = "/shaders/entity.properties";
            InputStream var5 = var0.method14639(var4);
            if (var5 != null) {
               method38608(var5, var4, var3);
            }

            method38607(var3);
            if (var3.size() > 0) {
               field45790 = method38610(var3);
            }
         }
      }
   }

   private static void method38607(List<Integer> var0) {
      String[] var3 = ReflectorForge.method37049();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];

         try {
            ResourceLocation var6 = new ResourceLocation(var5, "shaders/entity.properties");
            InputStream var7 = Config.method26863(var6);
            method38608(var7, var6.toString(), var0);
         } catch (IOException var8) {
         }
      }
   }

   private static void method38608(InputStream var0, String var1, List<Integer> var2) {
      if (var0 != null) {
         try {
            var0 = Class9711.method38047(var0, var1);
            Class20 var5 = new Class20();
            var5.load(var0);
            var0.close();
            Config.method26810("[Shaders] Parsing entity mappings: " + var1);
            Class8896 var6 = new Class8896("Shaders");

            for (String var8 : (Set<String>)(Set) var5.keySet()) {
               String var9 = var5.getProperty(var8);
               String var10 = "entity.";
               if (!var8.startsWith(var10)) {
                  Config.method26811("[Shaders] Invalid entity ID: " + var8);
               } else {
                  String var11 = Class9402.method35762(var8, var10);
                  int var12 = Config.method26899(var11, -1);
                  if (var12 < 0) {
                     Config.method26811("[Shaders] Invalid entity alias ID: " + var12);
                  } else {
                     int[] var13 = var6.method32422(var9);
                     if (var13 != null && var13.length >= 1) {
                        for (int var14 = 0; var14 < var13.length; var14++) {
                           int var15 = var13[var14];
                           method38609(var2, var15, var12);
                        }
                     } else {
                        Config.method26811("[Shaders] Invalid entity ID mapping: " + var8 + "=" + var9);
                     }
                  }
               }
            }
         } catch (IOException var16) {
            Config.method26811("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static void method38609(List<Integer> var0, int var1, int var2) {
      while (var0.size() <= var1) {
         var0.add(-1);
      }

      var0.set(var1, var2);
   }

   private static int[] method38610(List<Integer> var0) {
      int[] var3 = new int[var0.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = (Integer)var0.get(var4);
      }

      return var3;
   }

   public static void method38611() {
      field45790 = null;
   }
}
