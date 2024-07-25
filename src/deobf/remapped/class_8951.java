package remapped;

import java.util.ArrayList;
import java.util.HashSet;

public class class_8951 {
   private int field_45883;
   private int field_45882;
   private class_9491[] field_45880;

   public class_8951(int var1, int var2, class_9491[] var3) {
      this.field_45883 = var1;
      this.field_45882 = var2;
      this.field_45880 = var3;
   }

   public class_8951(int var1, class_9491[] var2) {
      this.field_45883 = var1;
      this.field_45880 = var2;
   }

   public int method_41098() {
      return this.field_45883;
   }

   public int method_41094() {
      return this.field_45882;
   }

   public class_9491[] method_41099() {
      return this.field_45880;
   }

   public boolean method_41095(int var1, int var2) {
      for (int var5 = 0; var5 < this.field_45880.length; var5++) {
         class_9491 var6 = this.field_45880[var5];
         if (var6.method_43841(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public int[] method_41097() {
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < this.field_45880.length; var4++) {
         class_9491 var5 = this.field_45880[var4];
         int var6 = var5.method_43838();
         var3.add(var6);
      }

      Integer[] var7 = var3.<Integer>toArray(new Integer[var3.size()]);
      return class_3111.method_14267(var7);
   }

   public class_9491[] method_41100(int var1) {
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < this.field_45880.length; var5++) {
         class_9491 var6 = this.field_45880[var5];
         if (var6.method_43838() == var1) {
            var4.add(var6);
         }
      }

      return var4.<class_9491>toArray(new class_9491[var4.size()]);
   }

   @Override
   public String toString() {
      return "block." + this.field_45883 + ":" + this.field_45882 + "=" + class_3111.method_14289(this.field_45880);
   }
}
