package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;

public class Class5925 extends Class5924 {
   private static String[] field25809;
   public final boolean field25810;
   public final Class3389 field25811;

   public Class5925(Class3389 var1, boolean var2) {
      this.field25811 = var1;
      this.field25810 = var2;
   }

   @Override
   public Optional<Float> method18423(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, FluidState var5) {
      return var3.equals(var3) && this.field25810 ? Optional.<Float>of(Blocks.WATER.method11559()) : super.method18423(var1, var2, var3, var4, var5);
   }
}
