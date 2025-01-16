package net.minecraft.block;

import com.google.common.collect.Maps;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Map;

public class PottedWarpedRootsBlock extends Block {
   private static String[] field19288;
   private static final Map<Block, Block> field19289 = Maps.newHashMap();
   public static final VoxelShape field19290 = Block.makeCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final Block field19291;

   public PottedWarpedRootsBlock(Block var1, Properties var2) {
      super(var2);
      this.field19291 = var1;
      field19289.put(var1, this);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19290;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      Item var10 = var9.getItem();
      Block var11 = !(var10 instanceof BlockItem) ? Blocks.AIR : field19289.getOrDefault(((BlockItem)var10).method11845(), Blocks.AIR);
      boolean var12 = var11 == Blocks.AIR;
      boolean var13 = this.field19291 == Blocks.AIR;
      if (var12 == var13) {
         return ActionResultType.field14819;
      } else {
         if (!var13) {
            ItemStack var14 = new ItemStack(this.field19291);
            if (!var9.isEmpty()) {
               if (!var4.method2945(var14)) {
                  var4.dropItem(var14, false);
               }
            } else {
               var4.setHeldItem(var5, var14);
            }

            var2.setBlockState(var3, Blocks.FLOWER_POT.getDefaultState(), 3);
         } else {
            var2.setBlockState(var3, var11.getDefaultState(), 3);
            var4.method2911(Stats.field40154);
            if (!var4.abilities.isCreativeMode) {
               var9.shrink(1);
            }
         }

         return ActionResultType.method9002(var2.isRemote);
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return this.field19291 != Blocks.AIR ? new ItemStack(this.field19291) : super.getItem(var1, var2, var3);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !var1.isValidPosition(var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   public Block method12137() {
      return this.field19291;
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
