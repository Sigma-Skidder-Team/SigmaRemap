package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.PistonType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class3435 extends Class3433 {
   private static String[] field19201;
   public static final BooleanProperty field19202 = BlockStateProperties.EXTENDED;
   public static final VoxelShape field19203 = Block.makeCuboidShape(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   public static final VoxelShape field19204 = Block.makeCuboidShape(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19205 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   public static final VoxelShape field19206 = Block.makeCuboidShape(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19207 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final VoxelShape field19208 = Block.makeCuboidShape(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean field19209;

   public Class3435(boolean var1, Properties var2) {
      super(var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19198, Direction.NORTH).with(field19202, Boolean.valueOf(false)));
      this.field19209 = var1;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (var1.<Boolean>get(field19202)) {
         switch (Class7273.field31199[var1.<Direction>get(field19198).ordinal()]) {
            case 1:
               return field19208;
            case 2:
            default:
               return field19207;
            case 3:
               return field19206;
            case 4:
               return field19205;
            case 5:
               return field19204;
            case 6:
               return field19203;
         }
      } else {
         return VoxelShapes.method27426();
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (!var1.isRemote) {
         this.method12102(var1, var2, var3);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         this.method12102(var2, var3, var1);
      }
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock()) && !var2.isRemote && var2.getTileEntity(var3) == null) {
         this.method12102(var2, var3, var1);
      }
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field19198, var1.method18348().getOpposite()).with(field19202, Boolean.valueOf(false));
   }

   private void method12102(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(field19198);
      boolean var7 = this.method12103(var1, var2, var6);
      if (var7 && !var3.<Boolean>get(field19202)) {
         if (new Class9196(var1, var2, var6, true).method34464()) {
            var1.addBlockEvent(var2, this, 0, var6.getIndex());
         }
      } else if (!var7 && var3.<Boolean>get(field19202)) {
         BlockPos var8 = var2.method8350(var6, 2);
         BlockState var9 = var1.getBlockState(var8);
         byte var10 = 1;
         if (var9.isIn(Blocks.MOVING_PISTON) && var9.<Direction>get(field19198) == var6) {
            TileEntity var11 = var1.getTileEntity(var8);
            if (var11 instanceof Class955) {
               Class955 var12 = (Class955)var11;
               if (var12.method3846() && (var12.method3849(0.0F) < 0.5F || var1.getGameTime() == var12.method3867() || ((ServerWorld)var1).method6901())) {
                  var10 = 2;
               }
            }
         }

         var1.addBlockEvent(var2, this, var10, var6.getIndex());
      }
   }

   private boolean method12103(World var1, BlockPos var2, Direction var3) {
      for (Direction var9 : Direction.values()) {
         if (var9 != var3 && var1.method6778(var2.offset(var9), var9)) {
            return true;
         }
      }

      if (!var1.method6778(var2, Direction.DOWN)) {
         BlockPos var11 = var2.up();

         for (Direction var10 : Direction.values()) {
            if (var10 != Direction.DOWN && var1.method6778(var11.offset(var10), var10)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      Direction var8 = var1.<Direction>get(field19198);
      if (!var2.isRemote) {
         boolean var9 = this.method12103(var2, var3, var8);
         if (var9 && (var4 == 1 || var4 == 2)) {
            var2.setBlockState(var3, var1.with(field19202, Boolean.valueOf(true)), 2);
            return false;
         }

         if (!var9 && var4 == 0) {
            return false;
         }
      }

      if (var4 != 0) {
         if (var4 == 1 || var4 == 2) {
            TileEntity var16 = var2.getTileEntity(var3.offset(var8));
            if (var16 instanceof Class955) {
               ((Class955)var16).method3865();
            }

            BlockState var10 = Blocks.MOVING_PISTON
               .getDefaultState()
               .with(Class3356.field18896, var8)
               .with(Class3356.field18897, !this.field19209 ? PistonType.field638 : PistonType.field639);
            var2.setBlockState(var3, var10, 20);
            var2.method6761(var3, Class3356.method11929(this.getDefaultState().with(field19198, Direction.byIndex(var5 & 7)), var8, false, true));
            var2.func_230547_a_(var3, var10.getBlock());
            var10.method23424(var2, var3, 2);
            if (!this.field19209) {
               var2.removeBlock(var3.offset(var8), false);
            } else {
               BlockPos var11 = var3.add(var8.getXOffset() * 2, var8.getYOffset() * 2, var8.getZOffset() * 2);
               BlockState var12 = var2.getBlockState(var11);
               boolean var13 = false;
               if (var12.isIn(Blocks.MOVING_PISTON)) {
                  TileEntity var14 = var2.getTileEntity(var11);
                  if (var14 instanceof Class955) {
                     Class955 var15 = (Class955)var14;
                     if (var15.method3847() == var8 && var15.method3846()) {
                        var15.method3865();
                        var13 = true;
                     }
                  }
               }

               if (!var13) {
                  if (var4 == 1
                     && !var12.isAir()
                     && method12104(var12, var2, var11, var8.getOpposite(), false, var8)
                     && (var12.method23408() == PushReaction.field15862 || var12.isIn(Blocks.PISTON) || var12.isIn(Blocks.STICKY_PISTON))) {
                     this.method12105(var2, var3, var8, false);
                  } else {
                     var2.removeBlock(var3.offset(var8), false);
                  }
               }
            }

            var2.playSound((PlayerEntity)null, var3, SoundEvents.field26949, SoundCategory.field14732, 0.5F, var2.rand.nextFloat() * 0.15F + 0.6F);
         }
      } else {
         if (!this.method12105(var2, var3, var8, true)) {
            return false;
         }

         var2.setBlockState(var3, var1.with(field19202, Boolean.valueOf(true)), 67);
         var2.playSound((PlayerEntity)null, var3, SoundEvents.field26950, SoundCategory.field14732, 0.5F, var2.rand.nextFloat() * 0.25F + 0.6F);
      }

      return true;
   }

   public static boolean method12104(BlockState var0, World var1, BlockPos var2, Direction var3, boolean var4, Direction var5) {
      if (var2.getY() < 0 || var2.getY() > var1.method7034() - 1 || !var1.getWorldBorder().contains(var2)) {
         return false;
      } else if (var0.isAir()) {
         return true;
      } else if (var0.isIn(Blocks.field36527) || var0.isIn(Blocks.CRYING_OBSIDIAN) || var0.isIn(Blocks.RESPAWN_ANCHOR)) {
         return false;
      } else if (var3 == Direction.DOWN && var2.getY() == 0) {
         return false;
      } else if (var3 == Direction.UP && var2.getY() == var1.method7034() - 1) {
         return false;
      } else {
         if (!var0.isIn(Blocks.PISTON) && !var0.isIn(Blocks.STICKY_PISTON)) {
            if (var0.getBlockHardness(var1, var2) == -1.0F) {
               return false;
            }

            switch (Class7273.field31200[var0.method23408().ordinal()]) {
               case 1:
                  return false;
               case 2:
                  return var4;
               case 3:
                  return var3 == var5;
            }
         } else if (var0.<Boolean>get(field19202)) {
            return false;
         }

         return !var0.getBlock().isTileEntityProvider();
      }
   }

   private boolean method12105(World var1, BlockPos var2, Direction var3, boolean var4) {
      BlockPos var7 = var2.offset(var3);
      if (!var4 && var1.getBlockState(var7).isIn(Blocks.PISTON_HEAD)) {
         var1.setBlockState(var7, Blocks.AIR.getDefaultState(), 20);
      }

      Class9196 var8 = new Class9196(var1, var2, var3, var4);
      if (!var8.method34464()) {
         return false;
      } else {
         Map<BlockPos, BlockState> var9 = Maps.newHashMap();
         List<BlockPos> var10 = var8.method34470();
         ArrayList var11 = Lists.newArrayList();

         for (int var12 = 0; var12 < var10.size(); var12++) {
            BlockPos var13 = var10.get(var12);
            BlockState var14 = var1.getBlockState(var13);
            var11.add(var14);
            var9.put(var13, var14);
         }

         List var21 = var8.method34471();
         BlockState[] var22 = new BlockState[var10.size() + var21.size()];
         Direction var23 = !var4 ? var3.getOpposite() : var3;
         int var15 = 0;

         for (int var16 = var21.size() - 1; var16 >= 0; var16--) {
            BlockPos var17 = (BlockPos)var21.get(var16);
            BlockState var18 = var1.getBlockState(var17);
            TileEntity var19 = !var18.getBlock().isTileEntityProvider() ? null : var1.getTileEntity(var17);
            method11555(var18, var1, var17, var19);
            var1.setBlockState(var17, Blocks.AIR.getDefaultState(), 18);
            var22[var15++] = var18;
         }

         for (int var25 = var10.size() - 1; var25 >= 0; var25--) {
            BlockPos var28 = (BlockPos)var10.get(var25);
            BlockState var35 = var1.getBlockState(var28);
            var28 = var28.offset(var23);
            var9.remove(var28);
            var1.setBlockState(var28, Blocks.MOVING_PISTON.getDefaultState().with(field19198, var3), 68);
            var1.method6761(var28, Class3356.method11929((BlockState)var11.get(var25), var3, var4, false));
            var22[var15++] = var35;
         }

         if (var4) {
            PistonType var26 = !this.field19209 ? PistonType.field638 : PistonType.field639;
            BlockState var30 = Blocks.PISTON_HEAD.getDefaultState().with(Class3436.field19198, var3).with(Class3436.field19211, var26);
            BlockState var36 = Blocks.MOVING_PISTON
               .getDefaultState()
               .with(Class3356.field18896, var3)
               .with(Class3356.field18897, !this.field19209 ? PistonType.field638 : PistonType.field639);
            var9.remove(var7);
            var1.setBlockState(var7, var36, 68);
            var1.method6761(var7, Class3356.method11929(var30, var3, true, true));
         }

         BlockState var27 = Blocks.AIR.getDefaultState();

         for (BlockPos var37 : var9.keySet()) {
            var1.setBlockState(var37, var27, 82);
         }

         for (Entry var38 : var9.entrySet()) {
            BlockPos var40 = (BlockPos)var38.getKey();
            BlockState var20 = (BlockState)var38.getValue();
            var20.method23426(var1, var40, 2);
            var27.method23424(var1, var40, 2);
            var27.method23426(var1, var40, 2);
         }

         var15 = 0;

         for (int var33 = var21.size() - 1; var33 >= 0; var33--) {
            BlockState var39 = var22[var15++];
            BlockPos var41 = (BlockPos)var21.get(var33);
            var39.method23426(var1, var41, 2);
            var1.notifyNeighborsOfStateChange(var41, var39.getBlock());
         }

         for (int var34 = var10.size() - 1; var34 >= 0; var34--) {
            var1.notifyNeighborsOfStateChange((BlockPos)var10.get(var34), var22[var15++].getBlock());
         }

         if (var4) {
            var1.notifyNeighborsOfStateChange(var7, Blocks.PISTON_HEAD);
         }

         return true;
      }
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19198, var2.rotate(var1.<Direction>get(field19198)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19198)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19198, field19202);
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return var1.<Boolean>get(field19202);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
