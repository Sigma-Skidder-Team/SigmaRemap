package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class Class3554 implements Class3499<BlockParticleData> {
   private static String[] field19478;

   public Class4587 method12199(BlockParticleData var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      BlockState var17 = var1.method24026();
      return !var17.isAir() && !var17.isIn(Blocks.MOVING_PISTON)
         ? new Class4609(var2, var3, var5, var7, var9, var11, var13, var17).method14541()
         : null;
   }
}
