package remapped;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class class_5609 {
   private static class_1433[] field_28472 = null;
   private static int field_28471 = 0;

   public static class_1433 method_25460() {
      if (field_28472 != null) {
         class_5621 var2 = class_5965.field_30386;
         if (var2 != null) {
            int var3 = class_4869.method_22374(var2);
            int var4 = var3 - field_28471;
            class_1433 var5 = null;
            if (var4 >= 0 && var4 < field_28472.length) {
               var5 = field_28472[var4];
            }

            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void method_25463() {
      field_28472 = null;
      field_28471 = 0;
      Pair var2 = method_25464();
      field_28472 = (class_1433[])var2.getLeft();
      field_28471 = (Integer)var2.getRight();
   }

   private static Pair<class_1433[], Integer> method_25464() {
      String var2 = "optifine/gui/loading/background";
      String var3 = ".png";
      String[] var4 = class_9654.method_44542(var2, var3);
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         String var8 = class_8251.method_37819(var7, var2, var3);
         int var9 = Config.method_14361(var8, Integer.MIN_VALUE);
         if (var9 != Integer.MIN_VALUE) {
            var5.put(var9, var7);
         } else {
            method_25465("Invalid dimension ID: " + var8 + ", path: " + var7);
         }
      }

      Set var17 = var5.keySet();
      Integer[] var18 = var17.<Integer>toArray(new Integer[var17.size()]);
      Arrays.sort(var18);
      if (var18.length <= 0) {
         return new ImmutablePair((class_1433[])null, 0);
      } else {
         String var19 = "optifine/gui/loading/loading.properties";
         Properties var20 = class_9654.method_44541(var19, "CustomLoadingScreens");
         int var10 = var18[0];
         int var11 = var18[var18.length - 1];
         int var12 = var11 - var10 + 1;
         class_1433[] var13 = new class_1433[var12];

         for (int var14 = 0; var14 < var18.length; var14++) {
            Integer var15 = var18[var14];
            String var16 = (String)var5.get(var15);
            var13[var15 - var10] = class_1433.method_6578(var16, var15, var20);
         }

         return new ImmutablePair(var13, var10);
      }
   }

   public static void method_25465(String var0) {
      Config.method_14317("CustomLoadingScreen: " + var0);
   }

   public static void method_25461(String var0) {
      Config.method_14277("CustomLoadingScreen: " + var0);
   }
}
