package remapped;

import java.util.Random;

public class class_4318 {
   private final Random field_21019;
   private long field_21021;
   private long field_21022;
   private int field_21023;

   public class_4318(Random var1, long var2) {
      this.field_21019 = var1;
      this.method_20098(var2);
   }

   public void method_20098(long var1) {
      this.field_21021 = var1;
      int var5 = this.field_21023 + this.field_21019.nextInt(40) + 40;
      this.field_21023 = Math.min(var5, 400);
      this.field_21022 = var1 + (long)this.field_21023;
   }

   public boolean method_20099(long var1) {
      return var1 - this.field_21021 < 400L;
   }

   public boolean method_20097(long var1) {
      return var1 >= this.field_21022;
   }

   @Override
   public String toString() {
      return "RetryMarker{, previousAttemptAt="
         + this.field_21021
         + ", nextScheduledAttemptAt="
         + this.field_21022
         + ", currentDelay="
         + this.field_21023
         + '}';
   }
}
