package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class class_6730 implements class_1870 {
   private static String[] field_34759;
   private final class_2925 field_34761;
   private final Long2ObjectOpenHashMap<class_7335> field_34764;
   private class_2034 field_34758 = new class_2034(0, 0);
   private final int field_34760;
   private final int field_34757;
   private final int field_34762;
   private boolean field_34763;

   public class_6730(int var1) {
      this.field_34761 = new class_2925(var1);
      this.field_34760 = var1 * 2 + 1;
      this.field_34757 = var1 + class_7335.method_33454();
      this.field_34762 = this.field_34757 * 2 + 1;
      this.field_34764 = new Long2ObjectOpenHashMap();
   }

   @Override
   public void method_8296(class_2034 var1) {
      if (this.field_34763) {
         this.field_34761.method_8296(var1);
         this.field_34758 = var1;
      }
   }

   @Override
   public void method_8297(class_2034 var1, class_7335 var2) {
      if (this.field_34763) {
         this.field_34761.method_8297(var1, var2);
         if (var2 != null) {
            this.field_34764.put(var1.method_9539(), var2);
         } else {
            this.field_34764.remove(var1.method_9539());
         }
      }
   }

   public void method_30872() {
      this.field_34763 = true;
      this.field_34764.clear();
   }

   @Override
   public void method_8298() {
      this.field_34763 = false;
      this.field_34761.method_8298();
   }

   public int method_30868() {
      return this.field_34760;
   }

   public int method_30873() {
      return this.field_34762;
   }

   public int method_30869() {
      return this.field_34761.method_13378();
   }

   @Nullable
   public class_7335 method_30871(int var1, int var2) {
      return (class_7335)this.field_34764
         .get(class_2034.method_9540(var1 + this.field_34758.field_10328 - this.field_34757, var2 + this.field_34758.field_10327 - this.field_34757));
   }
}
