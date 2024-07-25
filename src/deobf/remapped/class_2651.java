package remapped;

public class class_2651 {
   public final int field_13051;
   public final int field_13052;

   public class_2651(int var1, int var2) {
      this.field_13051 = var1;
      this.field_13052 = var2;
   }

   public class_2651(BlockPos var1) {
      this.field_13051 = var1.method_12173();
      this.field_13052 = var1.method_12185();
   }

   @Override
   public String toString() {
      return "[" + this.field_13051 + ", " + this.field_13052 + "]";
   }

   @Override
   public int hashCode() {
      int var3 = 1664525 * this.field_13051 + 1013904223;
      int var4 = 1664525 * (this.field_13052 ^ -559038737) + 1013904223;
      return var3 ^ var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_2651)) {
            return false;
         } else {
            class_2651 var4 = (class_2651)var1;
            return this.field_13051 == var4.field_13051 && this.field_13052 == var4.field_13052;
         }
      } else {
         return true;
      }
   }
}
