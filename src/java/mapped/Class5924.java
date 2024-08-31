package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;

public class Class5924 {
   private static String[] field25808;

   public Optional<Float> method18423(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, FluidState var5) {
      return var4.isAir() && var5.method23474()
         ? Optional.<Float>empty()
         : Optional.<Float>of(Math.max(var4.getBlock().method11559(), var5.method23487()));
   }

   public boolean method18424(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, float var5) {
      return true;
   }
}
