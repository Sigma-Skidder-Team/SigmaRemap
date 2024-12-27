package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class FrostedIceBlock extends Class3377 {
   private static String[] field18977;
   public static final IntegerProperty field18978 = BlockStateProperties.field39740;

   public FrostedIceBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18978, Integer.valueOf(0)));
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.tick(var1, var2, var3, var4);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if ((var4.nextInt(3) == 0 || this.method11970(var2, var3, 4))
         && var2.method7015(var3) > 11 - var1.<Integer>get(field18978) - var1.getOpacity(var2, var3)
         && this.method11969(var1, var2, var3)) {
         BlockPos.Mutable var7 = new BlockPos.Mutable();

         for (Direction var11 : Direction.values()) {
            var7.method8377(var3, var11);
            BlockState var12 = var2.getBlockState(var7);
            if (var12.isIn(this) && !this.method11969(var12, var2, var7)) {
               var2.method6860().scheduleTick(var7, this, MathHelper.method37782(var4, 20, 40));
            }
         }
      } else {
         var2.method6860().scheduleTick(var3, this, MathHelper.method37782(var4, 20, 40));
      }
   }

   private boolean method11969(BlockState var1, World var2, BlockPos var3) {
      int var6 = var1.<Integer>get(field18978);
      if (var6 >= 3) {
         this.method11968(var1, var2, var3);
         return true;
      } else {
         var2.setBlockState(var3, var1.with(field18978, Integer.valueOf(var6 + 1)), 2);
         return false;
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var4 == this && this.method11970(var2, var3, 2)) {
         this.method11968(var1, var2, var3);
      }

      super.method11506(var1, var2, var3, var4, var5, var6);
   }

   private boolean method11970(IBlockReader var1, BlockPos var2, int var3) {
      int var6 = 0;
      BlockPos.Mutable var7 = new BlockPos.Mutable();

      for (Direction var11 : Direction.values()) {
         var7.method8377(var2, var11);
         if (var1.getBlockState(var7).isIn(this)) {
            if (++var6 >= var3) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18978);
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }
}
