package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

public class Class3370 extends Class3241 {
   private static String[] field18958;

   public Class3370(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class960();
   }

   @Override
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      super.method11965(var1, var2, var3, var4);
      int var7 = 15 + var2.rand.nextInt(15) + var2.rand.nextInt(15);
      this.method11558(var2, var3, var7);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }
}
