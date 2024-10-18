package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class Class3372 extends Class3241 {
   private static String[] field18962;
   public static final IntegerProperty field18963 = BlockStateProperties.field39759;
   public static final BooleanProperty field18964 = BlockStateProperties.field39697;
   public static final VoxelShape field18965 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public Class3372(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18963, Integer.valueOf(0)).with(field18964, Boolean.valueOf(false)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18965;
   }

   @Override
   public boolean isTransparent(BlockState var1) {
      return true;
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.<Integer>get(field18963);
   }

   public static void method11966(BlockState var0, World var1, BlockPos var2) {
      if (var1.getDimensionType().hasSkyLight()) {
         int var5 = var1.getLightFor(LightType.SKY, var2) - var1.method6808();
         float var6 = var1.method6750(1.0F);
         boolean var7 = var0.<Boolean>get(field18964);
         if (!var7) {
            if (var5 > 0) {
               float var8 = !(var6 < (float) Math.PI) ? (float) (Math.PI * 2) : 0.0F;
               var6 += (var8 - var6) * 0.2F;
               var5 = Math.round((float)var5 * MathHelper.cos(var6));
            }
         } else {
            var5 = 15 - var5;
         }

         var5 = MathHelper.clamp(var5, 0, 15);
         if (var0.<Integer>get(field18963) != var5) {
            var1.setBlockState(var2, var0.with(field18963, Integer.valueOf(var5)), 3);
         }
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var4.method2935()) {
         return super.onBlockActivated(var1, var2, var3, var4, var5, var6);
      } else if (!var2.isRemote) {
         BlockState var9 = var1.method23459(field18964);
         var2.setBlockState(var3, var9, 4);
         method11966(var9, var2, var3);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class961();
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18963, field18964);
   }
}
