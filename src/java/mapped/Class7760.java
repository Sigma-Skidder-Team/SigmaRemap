package mapped;

import net.minecraft.util.math.BlockPos;

public class Class7760 {
   public final int field33332;
   public final int field33333;

   public Class7760(int var1, int var2) {
      this.field33332 = var1;
      this.field33333 = var2;
   }

   public Class7760(BlockPos var1) {
      this.field33332 = var1.getX();
      this.field33333 = var1.getZ();
   }

   @Override
   public String toString() {
      return "[" + this.field33332 + ", " + this.field33333 + "]";
   }

   @Override
   public int hashCode() {
      int var3 = 1664525 * this.field33332 + 1013904223;
      int var4 = 1664525 * (this.field33333 ^ -559038737) + 1013904223;
      return var3 ^ var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class7760)) {
            return false;
         } else {
            Class7760 var4 = (Class7760)var1;
            return this.field33332 == var4.field33332 && this.field33333 == var4.field33333;
         }
      } else {
         return true;
      }
   }
}
