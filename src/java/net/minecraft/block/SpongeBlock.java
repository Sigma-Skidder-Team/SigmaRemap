package net.minecraft.block;

import com.google.common.collect.Lists;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.LinkedList;

public class SpongeBlock extends Block {
   private static String[] field19085;

   public SpongeBlock(Properties var1) {
      super(var1);
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock())) {
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
         var1.setBlockState(var2, Blocks.WET_SPONGE.getDefaultState(), 2);
         var1.playEvent(2001, var2, Block.getStateId(Blocks.WATER.getDefaultState()));
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
            BlockPos var14 = var8.offset(var13);
            BlockState var15 = var1.getBlockState(var14);
            FluidState var16 = var1.getFluidState(var14);
            Material var17 = var15.getMaterial();
            if (var16.method23486(FluidTags.field40469)) {
               if (var15.getBlock() instanceof Class3405 && ((Class3405)var15.getBlock()).method11533(var1, var14, var15) != Fluids.EMPTY) {
                  var6++;
                  if (var9 < 6) {
                     var5.add(new Class6793<BlockPos, Integer>(var14, var9 + 1));
                  }
               } else if (!(var15.getBlock() instanceof FlowingFluidBlock)) {
                  if (var17 == Material.field38937 || var17 == Material.field38940) {
                     TileEntity var18 = !var15.getBlock().isTileEntityProvider() ? null : var1.getTileEntity(var14);
                     method11555(var15, var1, var14, var18);
                     var1.setBlockState(var14, Blocks.AIR.getDefaultState(), 3);
                     var6++;
                     if (var9 < 6) {
                        var5.add(new Class6793<BlockPos, Integer>(var14, var9 + 1));
                     }
                  }
               } else {
                  var1.setBlockState(var14, Blocks.AIR.getDefaultState(), 3);
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
