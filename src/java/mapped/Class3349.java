package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;

public class Class3349 extends ChestBlock {
   private static String[] field18864;

   public Class3349(Properties var1) {
      super(var1, () -> TileEntityType.field21423);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class970();
   }

   @Override
   public Class9007<ResourceLocation> method11910() {
      return Stats.field40104.method172(Stats.field40155);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return MathHelper.clamp(ChestTileEntity.getPlayersUsing(var2, var3), 0, 15);
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var4 != Direction.UP ? 0 : var1.method23402(var2, var3, var4);
   }
}
