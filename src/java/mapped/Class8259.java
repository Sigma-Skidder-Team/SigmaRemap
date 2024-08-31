package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Executor;

public class Class8259 {
   public static Properties method28791(ResourceLocation var0) {
      String var3 = var0.getPath();
      Class20 var4 = new Class20();
      String var5 = ".png";
      if (!var3.endsWith(var5)) {
         return var4;
      } else {
         String var6 = var3.substring(0, var3.length() - var5.length()) + ".properties";

         try {
            ResourceLocation var7 = new ResourceLocation(var0.getNamespace(), var6);
            InputStream var8 = Class7944.method26864(Class7944.method26862(), var7);
            if (var8 == null) {
               return var4;
            }

            Class7944.method26815("Loading " + var6);
            var4.load(var8);
            var8.close();
         } catch (FileNotFoundException var9) {
         } catch (IOException var10) {
            var10.printStackTrace();
         }

         return var4;
      }
   }

   public static Int2ObjectMap<Float> method28792(Properties var0) {
      Int2ObjectOpenHashMap<Float> var3 = new Int2ObjectOpenHashMap();

      for (String var5 : (Set<String>)(Set<?>)var0.keySet()) {
         String var6 = "width.";
         if (var5.startsWith(var6)) {
            String var7 = var5.substring(var6.length());
            int var8 = Class7944.method26899(var7, -1);
            if (var8 >= 0) {
               String var9 = var0.getProperty(var5);
               float var10 = Class7944.method26900(var9, -1.0F);
               if (var10 >= 0.0F) {
                  char var11 = (char)var8;
                  var3.put(var11, new Float(var10));
               }
            }
         }
      }

      return var3;
   }

   public static float method28793(Properties var0, String var1, float var2) {
      String var5 = var0.getProperty(var1);
      if (var5 != null) {
         float var6 = Class7944.method26900(var5, Float.MIN_VALUE);
         if (var6 != Float.MIN_VALUE) {
            return var6;
         } else {
            Class7944.method26811("Invalid value for " + var1 + ": " + var5);
            return var2;
         }
      } else {
         return var2;
      }
   }

   public static boolean method28794(Properties var0, String var1, boolean var2) {
      String var5 = var0.getProperty(var1);
      if (var5 != null) {
         String var6 = var5.toLowerCase().trim();
         if (var6.equals("true") || var6.equals("on")) {
            return true;
         } else if (!var6.equals("false") && !var6.equals("off")) {
            Class7944.method26811("Invalid value for " + var1 + ": " + var5);
            return var2;
         } else {
            return false;
         }
      } else {
         return var2;
      }
   }

   public static ResourceLocation method28795(ResourceLocation var0) {
      if (Class7944.method26913()) {
         if (var0 != null) {
            if (Class7944.method26797()) {
               String var3 = var0.getPath();
               String var4 = "textures/";
               String var5 = "optifine/";
               if (var3.startsWith(var4)) {
                  var3 = var3.substring(var4.length());
                  var3 = var5 + var3;
                  ResourceLocation var6 = new ResourceLocation(var0.getNamespace(), var3);
                  return !Class7944.method26867(Class7944.method26862(), var6) ? var0 : var6;
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

   public static void method28796() {
      Class7122 var2 = new Class7122();
      Executor var3 = Util.getServerExecutor();
      Minecraft var4 = Minecraft.getInstance();
      FontResourceManager var5 = (FontResourceManager)Class9299.method35072(var4, Class9299.field43020);
      if (var5 != null) {
         var5.getReloadListener().method777(var2, Class7944.method26862(), EmptyProfiler.INSTANCE, EmptyProfiler.INSTANCE, var3, var4);
      }
   }
}
