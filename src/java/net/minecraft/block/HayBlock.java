package net.minecraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HayBlock extends StrippedCrimsonHyphaeBlock {
   private static String[] field18993;

   public HayBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18994, Direction.Axis.Y));
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      var3.onLivingFall(var4, 0.2F);
   }
}
