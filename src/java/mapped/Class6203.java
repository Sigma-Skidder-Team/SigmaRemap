package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class6203 {
   private static String[] field27682;
   public int field27683;
   public int field27684;
   public List<BlockPos> field27685;

   public Class6203(int var1, int var2, List<BlockPos> var3) {
      this.field27683 = var1;
      this.field27684 = var2;
      this.field27685 = var3;
   }

   public boolean method19107(Class7481 var1) {
      return var1.field32174 == this.field27683 && var1.field32175 == this.field27684;
   }

   public int method19108(Class7481 var1) {
      return (int)Math.sqrt(
         (double)(
            (var1.field32174 - this.field27683) * (var1.field32174 - this.field27683)
               + (var1.field32175 - this.field27684) * (var1.field32175 - this.field27684)
         )
      );
   }

   public Class7481 method19109() {
      return new Class7481(this.field27683, this.field27684);
   }
}
