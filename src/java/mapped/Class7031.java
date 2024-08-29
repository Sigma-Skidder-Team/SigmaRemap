package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Class7031 {
   private static RenderType[] field30343 = null;
   public static boolean field30344 = false;

   public static RenderType method21824(Class1665 var0, BlockState var1, BlockPos var2) {
      if (field30343 != null) {
         if (var1.method23409(var0, var2)) {
            return null;
         } else {
            int var5 = var1.method23490();
            return var5 > 0 && var5 < field30343.length ? field30343[var5] : null;
         }
      } else {
         return null;
      }
   }

   public static void method21825() {
      field30343 = null;
      field30344 = false;
      ArrayList<RenderType> var2 = new ArrayList();
      String var3 = "optifine/block.properties";
      Properties var4 = Class9772.method38445(var3, "CustomBlockLayers");
      if (var4 != null) {
         method21826(var3, var4, var2);
      }

      if (Class7944.method26921()) {
         Class20 var5 = Class9172.method34275();
         if (var5 != null) {
            String var6 = "shaders/block.properties";
            method21826(var6, var5, var2);
         }
      }

      if (!var2.isEmpty()) {
         field30343 = var2.toArray(new RenderType[var2.size()]);
         field30344 = true;
      }
   }

   private static void method21826(String var0, Properties var1, List<RenderType> var2) {
      Class7944.method26810("CustomBlockLayers: " + var0);
      method21827("solid", Class9025.field41288, var1, var2);
      method21827("cutout", Class9025.field41290, var1, var2);
      method21827("cutout_mipped", Class9025.field41289, var1, var2);
      method21827("translucent", Class9025.field41291, var1, var2);
   }

   private static void method21827(String var0, RenderType var1, Properties var2, List<RenderType> var3) {
      String var6 = "layer." + var0;
      String var7 = var2.getProperty(var6);
      if (var7 != null) {
         Class8896 var8 = new Class8896("CustomBlockLayers");
         Class9727[] var9 = var8.method32384(var7);
         if (var9 != null) {
            for (int var10 = 0; var10 < var9.length; var10++) {
               Class9727 var11 = var9[var10];
               int var12 = var11.method38103();
               if (var12 > 0) {
                  while (var3.size() < var12 + 1) {
                     var3.add((RenderType)null);
                  }

                  if (var3.get(var12) != null) {
                     Class7944.method26811("CustomBlockLayers: Block layer is already set, block: " + var12 + ", layer: " + var0);
                  }

                  var3.set(var12, var1);
               }
            }
         }
      }
   }

   public static boolean method21828() {
      return field30344;
   }
}
