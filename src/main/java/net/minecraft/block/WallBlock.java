package net.minecraft.block;

import com.google.common.collect.ImmutableMap;
import mapped.Class3237;
import mapped.Class6962;
import mapped.IBooleanFunction;
import mapped.VoxelShapes;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Map;

public class WallBlock extends Block implements IWaterLoggable {
   private static String[] field19105;
   public static final BooleanProperty field19106 = BlockStateProperties.UP;
   public static final EnumProperty<WallHeight> field19107 = BlockStateProperties.WALLHEIGHT_EAST;
   public static final EnumProperty<WallHeight> field19108 = BlockStateProperties.WALLHEIGHT_NORTH;
   public static final EnumProperty<WallHeight> field19109 = BlockStateProperties.WALLHEIGHT_SOUTH;
   public static final EnumProperty<WallHeight> field19110 = BlockStateProperties.WALLHEIGHT_WEST;
   public static final BooleanProperty field19111 = BlockStateProperties.WATERLOGGED;
   private final Map<BlockState, VoxelShape> field19112;
   private final Map<BlockState, VoxelShape> field19113;
   private static final VoxelShape field19114 = Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final VoxelShape field19115 = Block.makeCuboidShape(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final VoxelShape field19116 = Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final VoxelShape field19117 = Block.makeCuboidShape(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final VoxelShape field19118 = Block.makeCuboidShape(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public WallBlock(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19106, Boolean.valueOf(true))
            .with(field19108, WallHeight.field667)
            .with(field19107, WallHeight.field667)
            .with(field19109, WallHeight.field667)
            .with(field19110, WallHeight.field667)
            .with(field19111, Boolean.valueOf(false))
      );
      this.field19112 = this.method12054(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.field19113 = this.method12054(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static VoxelShape method12053(VoxelShape var0, WallHeight var1, VoxelShape var2, VoxelShape var3) {
      if (var1 != WallHeight.field669) {
         return var1 != WallHeight.field668 ? var0 : VoxelShapes.or(var0, var2);
      } else {
         return VoxelShapes.or(var0, var3);
      }
   }

   private Map<BlockState, VoxelShape> method12054(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 8.0F - var1;
      float var10 = 8.0F + var1;
      float var11 = 8.0F - var2;
      float var12 = 8.0F + var2;
      VoxelShape var13 = Block.makeCuboidShape((double)var9, 0.0, (double)var9, (double)var10, (double)var3, (double)var10);
      VoxelShape var14 = Block.makeCuboidShape((double)var11, (double)var4, 0.0, (double)var12, (double)var5, (double)var12);
      VoxelShape var15 = Block.makeCuboidShape((double)var11, (double)var4, (double)var11, (double)var12, (double)var5, 16.0);
      VoxelShape var16 = Block.makeCuboidShape(0.0, (double)var4, (double)var11, (double)var12, (double)var5, (double)var12);
      VoxelShape var17 = Block.makeCuboidShape((double)var11, (double)var4, (double)var11, 16.0, (double)var5, (double)var12);
      VoxelShape var18 = Block.makeCuboidShape((double)var11, (double)var4, 0.0, (double)var12, (double)var6, (double)var12);
      VoxelShape var19 = Block.makeCuboidShape((double)var11, (double)var4, (double)var11, (double)var12, (double)var6, 16.0);
      VoxelShape var20 = Block.makeCuboidShape(0.0, (double)var4, (double)var11, (double)var12, (double)var6, (double)var12);
      VoxelShape var21 = Block.makeCuboidShape((double)var11, (double)var4, (double)var11, 16.0, (double)var6, (double)var12);
      ImmutableMap.Builder var22 = ImmutableMap.builder();

      for (Boolean var24 : field19106.method30474()) {
         for (WallHeight var26 : field19107.method30474()) {
            for (WallHeight var28 : field19108.method30474()) {
               for (WallHeight var30 : field19110.method30474()) {
                  for (WallHeight var32 : field19109.method30474()) {
                     VoxelShape var33 = VoxelShapes.empty();
                     var33 = method12053(var33, var26, var17, var21);
                     var33 = method12053(var33, var30, var16, var20);
                     var33 = method12053(var33, var28, var14, var18);
                     var33 = method12053(var33, var32, var15, var19);
                     if (var24) {
                        var33 = VoxelShapes.or(var33, var13);
                     }

                     BlockState var34 = this.getDefaultState()
                        .with(field19106, var24)
                        .with(field19107, var26)
                        .with(field19110, var30)
                        .with(field19108, var28)
                        .with(field19109, var32);
                     var22.put(var34.with(field19111, Boolean.valueOf(false)), var33);
                     var22.put(var34.with(field19111, Boolean.valueOf(true)), var33);
                  }
               }
            }
         }
      }

      return var22.build();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field19112.get(var1);
   }

   @Override
   public VoxelShape getCollisionShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field19113.get(var1);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   private boolean method12055(BlockState var1, boolean var2, Direction var3) {
      Block var6 = var1.getBlock();
      boolean var7 = var6 instanceof FenceGateBlock && FenceGateBlock.method11507(var1, var3);
      return var1.isIn(BlockTags.field32764) || !method11545(var6) && var2 || var6 instanceof Class3237 || var7;
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      FluidState var6 = var1.getWorld().getFluidState(var1.getPos());
      BlockPos var7 = var5.north();
      BlockPos var8 = var5.east();
      BlockPos var9 = var5.south();
      BlockPos var10 = var5.west();
      BlockPos var11 = var5.up();
      BlockState var12 = var4.getBlockState(var7);
      BlockState var13 = var4.getBlockState(var8);
      BlockState var14 = var4.getBlockState(var9);
      BlockState var15 = var4.getBlockState(var10);
      BlockState var16 = var4.getBlockState(var11);
      boolean var17 = this.method12055(var12, var12.method23454(var4, var7, Direction.SOUTH), Direction.SOUTH);
      boolean var18 = this.method12055(var13, var13.method23454(var4, var8, Direction.WEST), Direction.WEST);
      boolean var19 = this.method12055(var14, var14.method23454(var4, var9, Direction.NORTH), Direction.NORTH);
      boolean var20 = this.method12055(var15, var15.method23454(var4, var10, Direction.EAST), Direction.EAST);
      BlockState var21 = this.getDefaultState().with(field19111, Boolean.valueOf(var6.getFluid() == Fluids.WATER));
      return this.method12060(var4, var21, var11, var16, var17, var18, var19, var20);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field19111)) {
         var4.getPendingFluidTicks().scheduleTick(var5, Fluids.WATER, Fluids.WATER.getTickRate(var4));
      }

      if (var2 != Direction.DOWN) {
         return var2 != Direction.UP ? this.method12059(var4, var5, var1, var6, var3, var2) : this.method12058(var4, var1, var6, var3);
      } else {
         return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      }
   }

   private static boolean method12056(BlockState var0, Property<WallHeight> var1) {
      return var0.get(var1) != WallHeight.field667;
   }

   private static boolean method12057(VoxelShape var0, VoxelShape var1) {
      return ! VoxelShapes.compare(var1, var0, IBooleanFunction.ONLY_FIRST);
   }

   private BlockState method12058(IWorldReader var1, BlockState var2, BlockPos var3, BlockState var4) {
      boolean var7 = method12056(var2, field19108);
      boolean var8 = method12056(var2, field19107);
      boolean var9 = method12056(var2, field19109);
      boolean var10 = method12056(var2, field19110);
      return this.method12060(var1, var2, var3, var4, var7, var8, var9, var10);
   }

   private BlockState method12059(IWorldReader var1, BlockPos var2, BlockState var3, BlockPos var4, BlockState var5, Direction var6) {
      Direction var9 = var6.getOpposite();
      boolean var10 = var6 != Direction.NORTH ? method12056(var3, field19108) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      boolean var11 = var6 != Direction.EAST ? method12056(var3, field19107) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      boolean var12 = var6 != Direction.SOUTH ? method12056(var3, field19109) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      boolean var13 = var6 != Direction.WEST ? method12056(var3, field19110) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      BlockPos var14 = var2.up();
      BlockState var15 = var1.getBlockState(var14);
      return this.method12060(var1, var3, var14, var15, var10, var11, var12, var13);
   }

   private BlockState method12060(IWorldReader var1, BlockState var2, BlockPos var3, BlockState var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      VoxelShape var11 = var4.getCollisionShape(var1, var3).method19526(Direction.DOWN);
      BlockState var12 = this.method12062(var2, var5, var6, var7, var8, var11);
      return var12.with(field19106, Boolean.valueOf(this.method12061(var12, var4, var11)));
   }

   private boolean method12061(BlockState var1, BlockState var2, VoxelShape var3) {
      boolean var6 = var2.getBlock() instanceof WallBlock && var2.<Boolean>get(field19106);
      if (!var6) {
         WallHeight var7 = var1.<WallHeight>get(field19108);
         WallHeight var8 = var1.<WallHeight>get(field19109);
         WallHeight var9 = var1.<WallHeight>get(field19107);
         WallHeight var10 = var1.<WallHeight>get(field19110);
         boolean var11 = var8 == WallHeight.field667;
         boolean var12 = var10 == WallHeight.field667;
         boolean var13 = var9 == WallHeight.field667;
         boolean var14 = var7 == WallHeight.field667;
         boolean var15 = var14 && var11 && var12 && var13 || var14 != var11 || var12 != var13;
         if (var15) {
            return true;
         } else {
            boolean var16 = var7 == WallHeight.field669 && var8 == WallHeight.field669 || var9 == WallHeight.field669 && var10 == WallHeight.field669;
            return var16 ? false : var2.getBlock().isIn(BlockTags.field32803) || method12057(var3, field19114);
         }
      } else {
         return true;
      }
   }

   private BlockState method12062(BlockState var1, boolean var2, boolean var3, boolean var4, boolean var5, VoxelShape var6) {
      return var1.with(field19108, this.method12063(var2, var6, field19115))
         .with(field19107, this.method12063(var3, var6, field19118))
         .with(field19109, this.method12063(var4, var6, field19116))
         .with(field19110, this.method12063(var5, var6, field19117));
   }

   private WallHeight method12063(boolean var1, VoxelShape var2, VoxelShape var3) {
      if (!var1) {
         return WallHeight.field667;
      } else {
         return !method12057(var2, var3) ? WallHeight.field668 : WallHeight.field669;
      }
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field19111) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !var1.<Boolean>get(field19111);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19106, field19108, field19107, field19110, field19109, field19111);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      switch (Class6962.field30164[var2.ordinal()]) {
         case 1:
            return var1.with(field19108, var1.<WallHeight>get(field19109))
               .with(field19107, var1.<WallHeight>get(field19110))
               .with(field19109, var1.<WallHeight>get(field19108))
               .with(field19110, var1.<WallHeight>get(field19107));
         case 2:
            return var1.with(field19108, var1.<WallHeight>get(field19107))
               .with(field19107, var1.<WallHeight>get(field19109))
               .with(field19109, var1.<WallHeight>get(field19110))
               .with(field19110, var1.<WallHeight>get(field19108));
         case 3:
            return var1.with(field19108, var1.<WallHeight>get(field19110))
               .with(field19107, var1.<WallHeight>get(field19108))
               .with(field19109, var1.<WallHeight>get(field19107))
               .with(field19110, var1.<WallHeight>get(field19109));
         default:
            return var1;
      }
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      switch (Class6962.field30165[var2.ordinal()]) {
         case 1:
            return var1.with(field19108, var1.<WallHeight>get(field19109)).with(field19109, var1.<WallHeight>get(field19108));
         case 2:
            return var1.with(field19107, var1.<WallHeight>get(field19110)).with(field19110, var1.<WallHeight>get(field19107));
         default:
            return super.mirror(var1, var2);
      }
   }
}
