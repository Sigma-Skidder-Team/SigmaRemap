package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class class_2870 {
   private static final float field_14064 = 1.0E-6F;
   private static final Random field_14066 = new Random(0L);

   public static class_7373 method_13190(String var0, int var1) {
      class_5155 var4 = class_3111.method_14295().method_38522(var0);
      return method_13191(var4, var1);
   }

   public static class_7373 method_13191(class_5155 var0, int var1) {
      ArrayList var4 = new ArrayList();
      class_240[] var5 = class_240.field_803;
      HashMap var6 = new HashMap();

      for (int var7 = 0; var7 < var5.length; var7++) {
         class_240 var8 = var5[var7];
         ArrayList var9 = new ArrayList();
         var9.add(method_13184(var8, var0, var1));
         var6.put(var8, var9);
      }

      class_602 var10 = class_602.field_3453;
      return new class_6221(var4, var6, true, true, true, var0, class_7729.field_39206, var10);
   }

   public static class_7373 method_13186(class_7373 var0, class_7373 var1) {
      ArrayList var4 = new ArrayList();
      var4.addAll(var0.method_33580((class_2522)null, (class_240)null, field_14066));
      var4.addAll(var1.method_33580((class_2522)null, (class_240)null, field_14066));
      class_240[] var5 = class_240.field_803;
      HashMap var6 = new HashMap();

      for (int var7 = 0; var7 < var5.length; var7++) {
         class_240 var8 = var5[var7];
         ArrayList var9 = new ArrayList();
         var9.addAll(var0.method_33580((class_2522)null, var8, field_14066));
         var9.addAll(var1.method_33580((class_2522)null, var8, field_14066));
         var6.put(var8, var9);
      }

      boolean var13 = var0.method_33581();
      boolean var14 = var0.method_33582();
      class_5155 var15 = var0.method_33587();
      class_7729 var10 = var0.method_33586();
      class_602 var11 = var0.method_33584();
      return new class_6221(var4, var6, var13, var14, true, var15, var10, var11);
   }

   public static class_5024 method_13184(class_240 var0, class_5155 var1, int var2) {
      class_2426 var5 = new class_2426(0.0F, 0.0F, 0.0F);
      class_2426 var6 = new class_2426(16.0F, 16.0F, 16.0F);
      class_9874 var7 = new class_9874(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      class_7300 var8 = new class_7300(var0, var2, "#" + var0.method_21049(), var7);
      class_7507 var9 = class_7507.field_38322;
      Object var10 = null;
      boolean var11 = true;
      class_4639 var12 = var1.method_23644();
      class_7265 var13 = new class_7265();
      return var13.method_33202(var5, var6, var8, var1, var0, var9, (class_1868)var10, var11, var12);
   }

   public static class_7373 method_13187(String var0, String var1, String var2) {
      class_8359 var5 = class_3111.method_14295();
      class_5155 var6 = var5.method_38522(var1);
      class_5155 var7 = var5.method_38522(var2);
      return method_13188(var0, var6, var7);
   }

   public static class_7373 method_13188(String var0, class_5155 var1, class_5155 var2) {
      if (var1 != null && var2 != null) {
         class_7458 var5 = class_3111.method_14346();
         if (var5 == null) {
            return null;
         } else {
            class_454 var6 = new class_454(var0, "");
            class_7373 var7 = var5.method_33943(var6);
            if (var7 != null && var7 != var5.method_33942()) {
               class_7373 var8 = class_9885.method_45535(var7);
               class_240[] var9 = class_240.field_803;

               for (int var10 = 0; var10 < var9.length; var10++) {
                  class_240 var11 = var9[var10];
                  List var12 = var8.method_33580((class_2522)null, var11, field_14066);
                  method_13189(var12, var1, var2);
               }

               List var13 = var8.method_33580((class_2522)null, (class_240)null, field_14066);
               method_13189(var13, var1, var2);
               return var8;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static void method_13189(List<class_5024> var0, class_5155 var1, class_5155 var2) {
      ArrayList var5 = new ArrayList();

      for (Object var7 : var0) {
         if (((class_5024)var7).method_23148() == var1) {
            var7 = new class_9363((class_5024)var7, var2);
         }

         var5.add(var7);
      }

      var0.clear();
      var0.addAll(var5);
   }

   public static void method_13185(class_2426 var0) {
      var0.method_11065(method_13193(var0.method_11057()), method_13193(var0.method_11061()), method_13193(var0.method_11055()));
   }

   private static float method_13193(float var0) {
      if (var0 > -1.0E-6F && var0 < 1.0E-6F) {
         return 0.0F;
      } else {
         return var0 > 0.999999F && var0 < 1.000001F ? 1.0F : var0;
      }
   }

   public static class_4092 method_13192(class_4092 var0, class_7971 var1, class_1331 var2) {
      int var5 = var2.method_12173();
      int var6 = var2.method_12185();
      long var7 = (long)(var5 * 3129871) ^ (long)var6 * 116129781L;
      var7 = var7 * var7 * 42317861L + var7 * 11L;
      double var9 = ((double)((float)(var7 >> 16 & 15L) / 15.0F) - 0.5) * 0.5;
      double var11 = ((double)((float)(var7 >> 24 & 15L) / 15.0F) - 0.5) * 0.5;
      double var13 = 0.0;
      if (var1 == class_7971.field_40822) {
         var13 = ((double)((float)(var7 >> 20 & 15L) / 15.0F) - 1.0) * 0.2;
      }

      return var0.method_18918(var9, var13, var11);
   }
}
