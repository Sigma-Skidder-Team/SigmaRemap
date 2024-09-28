package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Class3212 extends Block {
   private static String[] field18621;

   public Class3212(Properties var1) {
      super(var1);
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      var4.setMotionMultiplier(var1, new Vector3d(0.25, 0.05F, 0.25));
   }
}
