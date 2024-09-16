package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.Validate;

public class Class8321 {
   private final long[] field35745;
   private final int field35746;
   private final long field35747;
   private final int field35748;

   public Class8321(int var1, int var2) {
      this(var1, var2, new long[MathHelper.method37804(var2 * var1, 64) / 64]);
   }

   public Class8321(int var1, int var2, long[] var3) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.field35748 = var2;
      this.field35746 = var1;
      this.field35745 = var3;
      this.field35747 = (1L << var1) - 1L;
      int var6 = MathHelper.method37804(var2 * var1, 64) / 64;
      if (var3.length != var6) {
         throw new IllegalArgumentException("Invalid length given for storage, got: " + var3.length + " but expected: " + var6);
      }
   }

   public void method29138(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.field35748 - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.field35747, (long)var2);
      int var5 = var1 * this.field35746;
      int var6 = var5 >> 6;
      int var7 = (var1 + 1) * this.field35746 - 1 >> 6;
      int var8 = var5 ^ var6 << 6;
      this.field35745[var6] = this.field35745[var6] & ~(this.field35747 << var8) | ((long)var2 & this.field35747) << var8;
      if (var6 != var7) {
         int var9 = 64 - var8;
         int var10 = this.field35746 - var9;
         this.field35745[var7] = this.field35745[var7] >>> var10 << var10 | ((long)var2 & this.field35747) >> var9;
      }
   }

   public int method29139(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.field35748 - 1), (long)var1);
      int var4 = var1 * this.field35746;
      int var5 = var4 >> 6;
      int var6 = (var1 + 1) * this.field35746 - 1 >> 6;
      int var7 = var4 ^ var5 << 6;
      if (var5 != var6) {
         int var8 = 64 - var7;
         return (int)((this.field35745[var5] >>> var7 | this.field35745[var6] << var8) & this.field35747);
      } else {
         return (int)(this.field35745[var5] >>> var7 & this.field35747);
      }
   }

   public long[] method29140() {
      return this.field35745;
   }

   public int method29141() {
      return this.field35746;
   }
}
