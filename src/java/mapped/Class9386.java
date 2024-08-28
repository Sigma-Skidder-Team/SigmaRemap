package mapped;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Class9386 {
   private static String[] field43544;
   private long field43545 = 100L;
   private long field43546 = 10000L;
   private int field43547 = 2;
   private double field43548;
   private int field43549;

   public long method35622() {
      BigInteger var3 = BigInteger.valueOf(this.field43545).multiply(BigInteger.valueOf((long)this.field43547).pow(this.field43549++));
      if (this.field43548 != 0.0) {
         double var4 = Math.random();
         BigInteger var6 = BigDecimal.valueOf(var4).multiply(BigDecimal.valueOf(this.field43548)).multiply(new BigDecimal(var3)).toBigInteger();
         var3 = ((int)Math.floor(var4 * 10.0) & 1) != 0 ? var3.add(var6) : var3.subtract(var6);
      }

      return var3.min(BigInteger.valueOf(this.field43546)).longValue();
   }

   public void method35623() {
      this.field43549 = 0;
   }

   public Class9386 method35624(long var1) {
      this.field43545 = var1;
      return this;
   }

   public Class9386 method35625(long var1) {
      this.field43546 = var1;
      return this;
   }

   public Class9386 method35626(int var1) {
      this.field43547 = var1;
      return this;
   }

   public Class9386 method35627(double var1) {
      this.field43548 = var1;
      return this;
   }

   public int method35628() {
      return this.field43549;
   }
}
