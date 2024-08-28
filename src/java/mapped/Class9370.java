package mapped;

import java.util.Arrays;

public class Class9370 {
   private final char[] field43498;
   private int field43499;
   private final Runnable field43500;

   public Class9370(char[] var1, Runnable var2) {
      this.field43500 = var2;
      if (var1.length >= 1) {
         this.field43498 = var1;
      } else {
         throw new IllegalArgumentException("Must have at least one char");
      }
   }

   public boolean method35542(char var1) {
      if (var1 != this.field43498[this.field43499++]) {
         this.method35543();
      } else if (this.field43499 == this.field43498.length) {
         this.method35543();
         this.field43500.run();
         return true;
      }

      return false;
   }

   public void method35543() {
      this.field43499 = 0;
   }

   @Override
   public String toString() {
      return "KeyCombo{chars=" + Arrays.toString(this.field43498) + ", matchIndex=" + this.field43499 + '}';
   }
}
