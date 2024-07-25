package remapped;

import org.apache.commons.lang3.Validate;

public class class_4236 {
   private final long[] field_20559;
   private final int field_20561;
   private final long field_20558;
   private final int field_20562;

   public class_4236(int var1, int var2) {
      this(var1, var2, new long[class_9299.method_42846(var2 * var1, 64) / 64]);
   }

   public class_4236(int var1, int var2, long[] var3) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.field_20562 = var2;
      this.field_20561 = var1;
      this.field_20559 = var3;
      this.field_20558 = (1L << var1) - 1L;
      int var6 = class_9299.method_42846(var2 * var1, 64) / 64;
      if (var3.length != var6) {
         throw new IllegalArgumentException("Invalid length given for storage, got: " + var3.length + " but expected: " + var6);
      }
   }

   public void method_19760(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.field_20562 - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.field_20558, (long)var2);
      int var5 = var1 * this.field_20561;
      int var6 = var5 >> 6;
      int var7 = (var1 + 1) * this.field_20561 - 1 >> 6;
      int var8 = var5 ^ var6 << 6;
      this.field_20559[var6] = this.field_20559[var6] & ~(this.field_20558 << var8) | ((long)var2 & this.field_20558) << var8;
      if (var6 != var7) {
         int var9 = 64 - var8;
         int var10 = this.field_20561 - var9;
         this.field_20559[var7] = this.field_20559[var7] >>> var10 << var10 | ((long)var2 & this.field_20558) >> var9;
      }
   }

   public int method_19759(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.field_20562 - 1), (long)var1);
      int var4 = var1 * this.field_20561;
      int var5 = var4 >> 6;
      int var6 = (var1 + 1) * this.field_20561 - 1 >> 6;
      int var7 = var4 ^ var5 << 6;
      if (var5 != var6) {
         int var8 = 64 - var7;
         return (int)((this.field_20559[var5] >>> var7 | this.field_20559[var6] << var8) & this.field_20558);
      } else {
         return (int)(this.field_20559[var5] >>> var7 & this.field_20558);
      }
   }

   public long[] method_19756() {
      return this.field_20559;
   }

   public int method_19757() {
      return this.field_20561;
   }
}
