package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3376 extends Class3241 {
   private static String[] field18974;
   public static final BooleanProperty[] field18975 = new BooleanProperty[]{BlockStateProperties.field39692, BlockStateProperties.field39693, BlockStateProperties.field39694};
   public static final VoxelShape field18976 = VoxelShapes.or(
      Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 14.0, 9.0)
   );

   public Class3376(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18975[0], Boolean.valueOf(false))
            .with(field18975[1], Boolean.valueOf(false))
            .with(field18975[2], Boolean.valueOf(false))
      );
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class931();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18976;
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof Class931) {
            var4.method2766((Class931)var9);
            var4.method2911(Stats.field40147);
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class931) {
            ((Class931)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + 0.4 + (double)var4.nextFloat() * 0.2;
      double var9 = (double)var3.getY() + 0.7 + (double)var4.nextFloat() * 0.3;
      double var11 = (double)var3.getZ() + 0.4 + (double)var4.nextFloat() * 0.2;
      var2.addParticle(ParticleTypes.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class931) {
            Class7236.method22721(var2, var3, (Class931)var8);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstone(var2.getTileEntity(var3));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18975[0], field18975[1], field18975[2]);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
