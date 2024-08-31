package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.LinkedList;

public class Class3407 extends Block {
   private static String[] field19085;

   public Class3407(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.method23448(var1.getBlock())) {
         this.method12048(var2, var3);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      this.method12048(var2, var3);
      super.method11506(var1, var2, var3, var4, var5, var6);
   }

   public void method12048(World var1, BlockPos var2) {
      if (this.method12049(var1, var2)) {
         var1.setBlockState(var2, Blocks.field36453.method11579(), 2);
         var1.playEvent(2001, var2, Block.getStateId(Blocks.WATER.method11579()));
      }
   }

   private boolean method12049(World var1, BlockPos var2) {
      LinkedList var5 = Lists.newLinkedList();
      var5.add(new Class6793<BlockPos, Integer>(var2, 0));
      int var6 = 0;

      while (!var5.isEmpty()) {
         Class6793 var7 = (Class6793)var5.poll();
         BlockPos var8 = (BlockPos)var7.method20692();
         int var9 = (Integer)var7.method20693();

         for (Direction var13 : Direction.values()) {
            BlockPos var14 = var8.method8349(var13);
            BlockState var15 = var1.getBlockState(var14);
            FluidState var16 = var1.getFluidState(var14);
            Class8649 var17 = var15.method23384();
            if (var16.method23486(Class8953.field40469)) {
               if (var15.getBlock() instanceof Class3405 && ((Class3405)var15.getBlock()).method11533(var1, var14, var15) != Class9479.field44064) {
                  var6++;
                  if (var9 < 6) {
                     var5.add(new Class6793<BlockPos, Integer>(var14, var9 + 1));
                  }
               } else if (!(var15.getBlock() instanceof Class3404)) {
                  if (var17 == Class8649.field38937 || var17 == Class8649.field38940) {
                     TileEntity var18 = !var15.getBlock().isTileEntityProvider() ? null : var1.getTileEntity(var14);
                     method11555(var15, var1, var14, var18);
                     var1.setBlockState(var14, Blocks.AIR.method11579(), 3);
                     var6++;
                     if (var9 < 6) {
                        var5.add(new Class6793<BlockPos, Integer>(var14, var9 + 1));
                     }
                  }
               } else {
                  var1.setBlockState(var14, Blocks.AIR.method11579(), 3);
                  var6++;
                  if (var9 < 6) {
                     var5.add(new Class6793<BlockPos, Integer>(var14, var9 + 1));
                  }
               }
            }
         }

         if (var6 > 64) {
            break;
         }
      }

      return var6 > 0;
   }
}
