package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.PistonType;
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

import java.util.Arrays;

public class Class3436 extends Class3433 {
   private static String[] field19210;
   public static final EnumProperty<PistonType> field19211 = BlockStateProperties.PISTON_TYPE;
   public static final BooleanProperty field19212 = BlockStateProperties.SHORT;
   public static final VoxelShape field19213 = Block.makeCuboidShape(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19214 = Block.makeCuboidShape(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   public static final VoxelShape field19215 = Block.makeCuboidShape(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19216 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   public static final VoxelShape field19217 = Block.makeCuboidShape(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19218 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   public static final VoxelShape field19219 = Block.makeCuboidShape(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   public static final VoxelShape field19220 = Block.makeCuboidShape(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   public static final VoxelShape field19221 = Block.makeCuboidShape(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   public static final VoxelShape field19222 = Block.makeCuboidShape(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   public static final VoxelShape field19223 = Block.makeCuboidShape(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   public static final VoxelShape field19224 = Block.makeCuboidShape(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   public static final VoxelShape field19225 = Block.makeCuboidShape(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   public static final VoxelShape field19226 = Block.makeCuboidShape(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   public static final VoxelShape field19227 = Block.makeCuboidShape(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   public static final VoxelShape field19228 = Block.makeCuboidShape(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   public static final VoxelShape field19229 = Block.makeCuboidShape(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   public static final VoxelShape field19230 = Block.makeCuboidShape(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final VoxelShape[] field19231 = method12106(true);
   private static final VoxelShape[] field19232 = method12106(false);

   private static VoxelShape[] method12106(boolean var0) {
      return Arrays.<Direction>stream(Direction.values()).<VoxelShape>map(var1 -> method12107(var1, var0)).<VoxelShape>toArray(VoxelShape[]::new);
   }

   private static VoxelShape method12107(Direction var0, boolean var1) {
      switch (Class7528.field32314[var0.ordinal()]) {
         case 1:
         default:
            return VoxelShapes.or(field19218, var1 ? field19226 : field19220);
         case 2:
            return VoxelShapes.or(field19217, var1 ? field19225 : field19219);
         case 3:
            return VoxelShapes.or(field19216, var1 ? field19228 : field19222);
         case 4:
            return VoxelShapes.or(field19215, var1 ? field19227 : field19221);
         case 5:
            return VoxelShapes.or(field19214, var1 ? field19230 : field19224);
         case 6:
            return VoxelShapes.or(field19213, var1 ? field19229 : field19223);
      }
   }

   public Class3436(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19198, Direction.NORTH)
            .with(field19211, PistonType.field638)
            .with(field19212, Boolean.valueOf(false))
      );
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return true;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return (!var1.<Boolean>get(field19212) ? field19232 : field19231)[var1.<Direction>get(field19198).ordinal()];
   }

   private boolean method12108(BlockState var1, BlockState var2) {
      Block var5 = var1.get(field19211) != PistonType.field638 ? Blocks.STICKY_PISTON : Blocks.PISTON;
      return var2.isIn(var5)
         && var2.<Boolean>get(PistonBlock.field19202)
         && var2.<Direction>get(field19198) == var1.<Direction>get(field19198);
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && var4.abilities.isCreativeMode) {
         BlockPos var7 = var2.offset(var3.<Direction>get(field19198).getOpposite());
         if (this.method12108(var3, var1.getBlockState(var7))) {
            var1.method7179(var7, false);
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         super.onReplaced(var1, var2, var3, var4, var5);
         BlockPos var8 = var3.offset(var1.<Direction>get(field19198).getOpposite());
         if (this.method12108(var1, var2.getBlockState(var8))) {
            var2.method7179(var8, true);
         }
      }
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2.getOpposite() == var1.get(field19198) && !var1.isValidPosition(var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.offset(var1.<Direction>get(field19198).getOpposite()));
      return this.method12108(var1, var6)
         || var6.isIn(Blocks.MOVING_PISTON) && var6.<Direction>get(field19198) == var1.<Direction>get(field19198);
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var1.isValidPosition(var2, var3)) {
         BlockPos var9 = var3.offset(var1.<Direction>get(field19198).getOpposite());
         var2.getBlockState(var9).neighborChanged(var2, var9, var4, var5, false);
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(var3.get(field19211) != PistonType.field639 ? Blocks.PISTON : Blocks.STICKY_PISTON);
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
      var1.add(field19198, field19211, field19212);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
