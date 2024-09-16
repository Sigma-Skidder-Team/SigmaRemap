package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3393 extends Class3392 {
   private static String[] field19027;

   public Class3393(AbstractBlock var1) {
      super(0.3125F, var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19019, Boolean.valueOf(false))
            .method23465(field19020, Boolean.valueOf(false))
            .method23465(field19021, Boolean.valueOf(false))
            .method23465(field19022, Boolean.valueOf(false))
            .method23465(field19023, Boolean.valueOf(false))
            .method23465(field19024, Boolean.valueOf(false))
      );
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method12004(var1.method18360(), var1.method18345());
   }

   public BlockState method12004(IBlockReader var1, BlockPos var2) {
      Block var5 = var1.getBlockState(var2.down()).getBlock();
      Block var6 = var1.getBlockState(var2.up()).getBlock();
      Block var7 = var1.getBlockState(var2.north()).getBlock();
      Block var8 = var1.getBlockState(var2.east()).getBlock();
      Block var9 = var1.getBlockState(var2.south()).getBlock();
      Block var10 = var1.getBlockState(var2.west()).getBlock();
      return this.method11579()
         .method23465(field19024, Boolean.valueOf(var5 == this || var5 == Blocks.field36879 || var5 == Blocks.field36651))
         .method23465(field19023, Boolean.valueOf(var6 == this || var6 == Blocks.field36879))
         .method23465(field19019, Boolean.valueOf(var7 == this || var7 == Blocks.field36879))
         .method23465(field19020, Boolean.valueOf(var8 == this || var8 == Blocks.field36879))
         .method23465(field19021, Boolean.valueOf(var9 == this || var9 == Blocks.field36879))
         .method23465(field19022, Boolean.valueOf(var10 == this || var10 == Blocks.field36879));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var9 = var3.getBlock() == this
            || var3.isIn(Blocks.field36879)
            || var2 == Direction.DOWN && var3.isIn(Blocks.field36651);
         return var1.method23465(field19025.get(var2), Boolean.valueOf(var9));
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      boolean var7 = !var2.getBlockState(var3.up()).isAir() && !var6.isAir();

      for (Direction var9 : Class76.field161) {
         BlockPos var10 = var3.method8349(var9);
         Block var11 = var2.getBlockState(var10).getBlock();
         if (var11 == this) {
            if (var7) {
               return false;
            }

            Block var12 = var2.getBlockState(var10.down()).getBlock();
            if (var12 == this || var12 == Blocks.field36651) {
               return true;
            }
         }
      }

      Block var13 = var6.getBlock();
      return var13 == this || var13 == Blocks.field36651;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19019, field19020, field19021, field19022, field19023, field19024);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
