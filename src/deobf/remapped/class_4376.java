package remapped;

import java.util.Random;

public class class_4376 {
   private final int field_21479;
   private final int field_21478;

   public class_4376(int var1, int var2) {
      if (var2 >= var1) {
         this.field_21479 = var1;
         this.field_21478 = var2;
      } else {
         throw new IllegalArgumentException("max must be >= minInclusive! Given minInclusive: " + var1 + ", Given max: " + var2);
      }
   }

   public static class_4376 method_20391(int var0, int var1) {
      return new class_4376(var0, var1);
   }

   public int method_20387(Random var1) {
      return this.field_21479 != this.field_21478 ? var1.nextInt(this.field_21478 - this.field_21479 + 1) + this.field_21479 : this.field_21479;
   }

   public int method_20389() {
      return this.field_21479;
   }

   public int method_20390() {
      return this.field_21478;
   }

   @Override
   public String toString() {
      return "IntRange[" + this.field_21479 + "-" + this.field_21478 + "]";
   }
}
