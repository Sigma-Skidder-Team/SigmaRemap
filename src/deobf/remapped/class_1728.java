package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class class_1728 {
   private static String[] field_8916;
   private final int field_8915;
   private final Object2IntOpenHashMap<class_4565> field_8914;
   private final class_2393 field_8910;
   private final Object2IntMap<class_4565> field_8911;
   private class_1331 field_8909;
   private class_6629<?> field_8913;
   private double field_8912;

   private class_1728(int var1, Object2IntOpenHashMap<class_4565> var2, class_2393 var3) {
      this.field_8915 = var1;
      this.field_8914 = var2;
      this.field_8910 = var3;
      this.field_8911 = Object2IntMaps.unmodifiable(var2);
   }

   private boolean method_7733(class_6629<?> var1, class_1331 var2, class_5990 var3) {
      this.field_8909 = var2;
      this.field_8913 = var1;
      class_2658 var6 = class_3815.method_17770(var2, var3).method_28886().method_27798(var1);
      if (var6 != null) {
         double var7 = var6.method_12012();
         this.field_8912 = var7;
         double var9 = this.field_8910.method_10919(var2, var7);
         return var9 <= var6.method_12014();
      } else {
         this.field_8912 = 0.0;
         return true;
      }
   }

   private void method_7731(class_5886 var1, class_5990 var2) {
      class_6629 var5 = var1.method_37387();
      class_1331 var6 = var1.method_37075();
      double var8;
      if (var6.equals(this.field_8909) && var5 == this.field_8913) {
         var8 = this.field_8912;
      } else {
         class_2658 var7 = class_3815.method_17770(var6, var2).method_28886().method_27798(var5);
         if (var7 == null) {
            var8 = 0.0;
         } else {
            var8 = var7.method_12012();
         }
      }

      this.field_8910.method_10920(var6, var8);
      this.field_8914.addTo(var5.method_30476(), 1);
   }

   public int method_7729() {
      return this.field_8915;
   }

   public Object2IntMap<class_4565> method_7732() {
      return this.field_8911;
   }

   private boolean method_7728(class_4565 var1) {
      int var4 = var1.method_21201() * this.field_8915 / class_3815.method_17762();
      return this.field_8914.getInt(var1) < var4;
   }
}
