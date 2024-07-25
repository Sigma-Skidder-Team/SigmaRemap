package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntList;

public class class_534 {
   private static String[] field_3243;
   public final Int2IntMap field_3242 = new Int2IntOpenHashMap();

   public void method_2606(class_6098 var1) {
      if (!var1.method_27995() && !var1.method_28020() && !var1.method_28018()) {
         this.method_2598(var1);
      }
   }

   public void method_2598(class_6098 var1) {
      this.method_2603(var1, 64);
   }

   public void method_2603(class_6098 var1, int var2) {
      if (!var1.method_28022()) {
         int var5 = method_2599(var1);
         int var6 = Math.min(var2, var1.method_27997());
         this.method_2600(var5, var6);
      }
   }

   public static int method_2599(class_6098 var0) {
      return class_8669.field_44382.method_14041(var0.method_27960());
   }

   private boolean method_2601(int var1) {
      return this.field_3242.get(var1) > 0;
   }

   private int method_2608(int var1, int var2) {
      int var5 = this.field_3242.get(var1);
      if (var5 < var2) {
         return 0;
      } else {
         this.field_3242.put(var1, var5 - var2);
         return var1;
      }
   }

   private void method_2600(int var1, int var2) {
      this.field_3242.put(var1, this.field_3242.get(var1) + var2);
   }

   public boolean method_2613(class_8932<?> var1, IntList var2) {
      return this.method_2614(var1, var2, 1);
   }

   public boolean method_2614(class_8932<?> var1, IntList var2, int var3) {
      return new class_4927(this, var1).method_22587(var3, var2);
   }

   public int method_2611(class_8932<?> var1, IntList var2) {
      return this.method_2610(var1, Integer.MAX_VALUE, var2);
   }

   public int method_2610(class_8932<?> var1, int var2, IntList var3) {
      return new class_4927(this, var1).method_22581(var2, var3);
   }

   public static class_6098 method_2604(int var0) {
      return var0 != 0 ? new class_6098(class_2451.method_11220(var0)) : class_6098.field_31203;
   }

   public void method_2602() {
      this.field_3242.clear();
   }
}
