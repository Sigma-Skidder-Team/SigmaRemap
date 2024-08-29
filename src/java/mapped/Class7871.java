package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class7871 {
   private static String[] field33729;
   public int field33730;
   public int field33731;
   public List<BlockPos> field33732;

   public Class7871(int var1, int var2, List<BlockPos> var3) {
      this.field33730 = var1;
      this.field33731 = var2;
      this.field33732 = var3;
   }

   public boolean method26390(Class7481 var1) {
      return var1.field32174 == this.field33730 && var1.field32175 == this.field33731;
   }

   public int method26391(Class7481 var1) {
      return (int)Math.sqrt(
         (double)(
            (var1.field32174 - this.field33730) * (var1.field32174 - this.field33730)
               + (var1.field32175 - this.field33731) * (var1.field32175 - this.field33731)
         )
      );
   }

   public Class7481 method26392() {
      return new Class7481(this.field33730, this.field33731);
   }
}
