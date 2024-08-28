package mapped;

import java.util.Random;

public class Class8341 {
   private final Random field35861;
   private long field35862;
   private long field35863;
   private int field35864;

   public Class8341(Random var1, long var2) {
      this.field35861 = var1;
      this.method29245(var2);
   }

   public void method29245(long var1) {
      this.field35862 = var1;
      int var5 = this.field35864 + this.field35861.nextInt(40) + 40;
      this.field35864 = Math.min(var5, 400);
      this.field35863 = var1 + (long)this.field35864;
   }

   public boolean method29246(long var1) {
      return var1 - this.field35862 < 400L;
   }

   public boolean method29247(long var1) {
      return var1 >= this.field35863;
   }

   @Override
   public String toString() {
      return "RetryMarker{, previousAttemptAt=" + this.field35862 + ", nextScheduledAttemptAt=" + this.field35863 + ", currentDelay=" + this.field35864 + '}';
   }
}
