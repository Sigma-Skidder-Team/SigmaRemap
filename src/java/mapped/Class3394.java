package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class Class3394 extends Block {
   private static String[] field19028;
   public static final IntegerProperty field19029 = BlockStateProperties.field39745;
   public static final VoxelShape[] field19030 = new VoxelShape[]{
      Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.makeCuboidShape(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.makeCuboidShape(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.makeCuboidShape(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.makeCuboidShape(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.makeCuboidShape(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.makeCuboidShape(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   public Class3394(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19029, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19030[var1.<Integer>get(field19029)];
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (var2.isRemote) {
         ItemStack var9 = var4.getHeldItem(var5);
         if (this.method12005(var2, var3, var1, var4).isSuccessOrConsume()) {
            return ActionResultType.SUCCESS;
         }

         if (var9.isEmpty()) {
            return ActionResultType.field14819;
         }
      }

      return this.method12005(var2, var3, var1, var4);
   }

   private ActionResultType method12005(Class1660 var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (var4.method2933(false)) {
         var4.method2911(Stats.field40141);
         var4.getFoodStats().method37569(2, 0.1F);
         int var7 = var3.<Integer>get(field19029);
         if (var7 >= 6) {
            var1.removeBlock(var2, false);
         } else {
            var1.setBlockState(var2, var3.with(field19029, Integer.valueOf(var7 + 1)), 3);
         }

         return ActionResultType.SUCCESS;
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).getMaterial().isSolid();
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19029);
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return (7 - var1.<Integer>get(field19029)) * 2;
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
