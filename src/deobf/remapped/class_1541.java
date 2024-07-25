package remapped;

import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public class class_1541 {
   private static String[] field_8149;
   private boolean field_8146;
   private final Long2IntLinkedOpenHashMap field_8147 = class_9665.<Long2IntLinkedOpenHashMap>method_44660(() -> {
      class_355 var3 = new class_355(this, 100, 0.25F);
      var3.defaultReturnValue(Integer.MAX_VALUE);
      return var3;
   });
   private final Long2FloatLinkedOpenHashMap field_8148 = class_9665.<Long2FloatLinkedOpenHashMap>method_44660(() -> {
      class_8777 var3 = new class_8777(this, 100, 0.25F);
      var3.defaultReturnValue(Float.NaN);
      return var3;
   });

   private class_1541() {
   }

   public void method_6986() {
      this.field_8146 = true;
   }

   public void method_6984() {
      this.field_8146 = false;
      this.field_8147.clear();
      this.field_8148.clear();
   }

   public int method_6985(class_2522 var1, class_5561 var2, class_1331 var3) {
      long var6 = var3.method_6077();
      if (this.field_8146) {
         int var8 = this.field_8147.get(var6);
         if (var8 != Integer.MAX_VALUE) {
            return var8;
         }
      }

      int var9 = class_4316.method_20052(var2, var1, var3);
      if (this.field_8146) {
         if (this.field_8147.size() == 100) {
            this.field_8147.removeFirstInt();
         }

         this.field_8147.put(var6, var9);
      }

      return var9;
   }

   public float method_6983(class_2522 var1, class_5561 var2, class_1331 var3) {
      long var6 = var3.method_6077();
      if (this.field_8146) {
         float var8 = this.field_8148.get(var6);
         if (!Float.isNaN(var8)) {
            return var8;
         }
      }

      float var9 = var1.method_8315(var2, var3);
      if (this.field_8146) {
         if (this.field_8148.size() == 100) {
            this.field_8148.removeFirstFloat();
         }

         this.field_8148.put(var6, var9);
      }

      return var9;
   }
}
