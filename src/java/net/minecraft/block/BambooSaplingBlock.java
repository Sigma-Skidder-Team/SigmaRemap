package net.minecraft.block;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.state.properties.BambooLeaves;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class BambooSaplingBlock extends Block implements IGrowable {
   private static String[] field19160;
   public static final VoxelShape field19161 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public BambooSaplingBlock(Properties var1) {
      super(var1);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Vector3d var7 = var1.method23421(var2, var3);
      return field19161.withOffset(var7.x, var7.y, var7.z);
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var4.nextInt(3) == 0 && var2.method7007(var3.up()) && var2.method7021(var3.up(), 0) >= 9) {
         this.method12079(var2, var3);
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).isIn(BlockTags.field32787);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.isValidPosition(var4, var5)) {
         if (var2 == Direction.UP && var3.isIn(Blocks.BAMBOO)) {
            var4.setBlockState(var5, Blocks.BAMBOO.getDefaultState(), 2);
         }

         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.getDefaultState();
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Items.field37357);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var1.getBlockState(var2.up()).isAir();
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.method12079(var1, var3);
   }

   @Override
   public float method11997(BlockState var1, PlayerEntity var2, IBlockReader var3, BlockPos var4) {
      return !(var2.getHeldItemMainhand().getItem() instanceof SwordItem) ? super.method11997(var1, var2, var3, var4) : 1.0F;
   }

   public void method12079(World var1, BlockPos var2) {
      var1.setBlockState(var2.up(), Blocks.BAMBOO.getDefaultState().with(BambooBlock.field19126, BambooLeaves.field643), 3);
   }
}
