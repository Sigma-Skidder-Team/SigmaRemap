package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.function.Supplier;

public class Class3485 extends Class3194 implements Class3196 {
   private static String[] field18470;
   public static final VoxelShape field19345 = Block.method11539(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private final Supplier<Class7909<Class4709, ?>> field19346;

   public Class3485(AbstractBlock var1, Supplier<Class7909<Class4709, ?>> var2) {
      super(var1);
      this.field19346 = var2;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19345;
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23446(BlockTags.field32799)
         || var1.method23448(Blocks.MYCELIUM)
         || var1.method23448(Blocks.SOUL_SOIL)
         || super.method11490(var1, var2, var3);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      Block var7 = ((Class4709)this.field19346.get().field33887).field22337.getBlock();
      Block var8 = var1.getBlockState(var2.down()).getBlock();
      return var8 == var7;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.field19346.get().method26521(var1, var1.getChunkProvider().method7370(), var2, var3);
   }
}
