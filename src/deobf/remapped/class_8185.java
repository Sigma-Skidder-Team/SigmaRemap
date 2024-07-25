package remapped;

import java.math.BigDecimal;
import java.math.BigInteger;

public class class_8185 {
   private static String[] field_41890;
   private long field_41893 = 100L;
   private long field_41891 = 10000L;
   private int field_41894 = 2;
   private double field_41889;
   private int field_41892;

   public long method_37510() {
      BigInteger var3 = BigInteger.valueOf(this.field_41893).multiply(BigInteger.valueOf((long)this.field_41894).pow(this.field_41892++));
      if (this.field_41889 != 0.0) {
         double var4 = Math.random();
         BigInteger var6 = BigDecimal.valueOf(var4).multiply(BigDecimal.valueOf(this.field_41889)).multiply(new BigDecimal(var3)).toBigInteger();
         var3 = ((int)Math.floor(var4 * 10.0) & 1) != 0 ? var3.add(var6) : var3.subtract(var6);
      }

      return var3.min(BigInteger.valueOf(this.field_41891)).longValue();
   }

   public void method_37506() {
      this.field_41892 = 0;
   }

   public class_8185 method_37508(long var1) {
      this.field_41893 = var1;
      return this;
   }

   public class_8185 method_37505(long var1) {
      this.field_41891 = var1;
      return this;
   }

   public class_8185 method_37503(int var1) {
      this.field_41894 = var1;
      return this;
   }

   public class_8185 method_37509(double var1) {
      this.field_41889 = var1;
      return this;
   }

   public int method_37504() {
      return this.field_41892;
   }
}
