package mapped;

import net.minecraft.block.BannerBlock;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.PistonType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class Class3356 extends BannerBlock {
   private static String[] field18895;
   public static final DirectionProperty field18896 = Class3436.field19198;
   public static final EnumProperty<PistonType> field18897 = Class3436.field19211;

   public Class3356(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18896, Direction.NORTH).with(field18897, PistonType.field638));
   }

   @Nullable
   @Override
   public TileEntity method11646(IBlockReader var1) {
      return null;
   }

   public static TileEntity method11929(BlockState var0, Direction var1, boolean var2, boolean var3) {
      return new Class955(var0, var1, var2, var3);
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class955) {
            ((Class955)var8).method3865();
         }
      }
   }

   @Override
   public void onPlayerDestroy(IWorld var1, BlockPos var2, BlockState var3) {
      BlockPos var6 = var2.offset(var3.<Direction>get(field18896).getOpposite());
      BlockState var7 = var1.getBlockState(var6);
      if (var7.getBlock() instanceof Class3435 && var7.<Boolean>get(Class3435.field19202)) {
         var1.removeBlock(var6, false);
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote && var2.getTileEntity(var3) == null) {
         var2.removeBlock(var3, false);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      Class955 var5 = this.method11930(var2.method36457(), new BlockPos(var2.<Vector3d>method36458(Class9525.field44335)));
      return var5 != null ? var5.method3864().method23434(var2) : Collections.<ItemStack>emptyList();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.empty();
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Class955 var7 = this.method11930(var2, var3);
      return var7 == null ? VoxelShapes.empty() : var7.method3866(var2, var3);
   }

   @Nullable
   private Class955 method11930(IBlockReader var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      return !(var5 instanceof Class955) ? null : (Class955)var5;
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18896, var2.rotate(var1.<Direction>get(field18896)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18896)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18896, field18897);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
