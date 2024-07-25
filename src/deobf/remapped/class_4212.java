package remapped;

import it.unimi.dsi.fastutil.ints.IntComparator;

public class class_4212 implements IntComparator {
   private static String[] field_20460;

   public class_4212(class_2566 var1, int[] var2, int[] var3) {
      this.field_20461 = var1;
      this.field_20463 = var2;
      this.field_20462 = var3;
   }

   public int compare(int var1, int var2) {
      return this.field_20463[var1] != this.field_20463[var2]
         ? Integer.compare(this.field_20463[var1], this.field_20463[var2])
         : Integer.compare(this.field_20462[var1], this.field_20462[var2]);
   }

   public int compare(Integer var1, Integer var2) {
      return this.compare(var1.intValue(), var2.intValue());
   }
}
