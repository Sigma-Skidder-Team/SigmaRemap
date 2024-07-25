package remapped;

import java.util.Arrays;

public class class_8117 {
   private final char[] field_41608;
   private int field_41605;
   private final Runnable field_41606;

   public class_8117(char[] var1, Runnable var2) {
      this.field_41606 = var2;
      if (var1.length >= 1) {
         this.field_41608 = var1;
      } else {
         throw new IllegalArgumentException("Must have at least one char");
      }
   }

   public boolean method_36940(char var1) {
      if (var1 != this.field_41608[this.field_41605++]) {
         this.method_36939();
      } else if (this.field_41605 == this.field_41608.length) {
         this.method_36939();
         this.field_41606.run();
         return true;
      }

      return false;
   }

   public void method_36939() {
      this.field_41605 = 0;
   }

   @Override
   public String toString() {
      return "KeyCombo{chars=" + Arrays.toString(this.field_41608) + ", matchIndex=" + this.field_41605 + '}';
   }
}
