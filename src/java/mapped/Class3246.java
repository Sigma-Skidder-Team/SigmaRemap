package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.ComparatorMode;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class Class3246 extends Class3247 implements ITileEntityProvider {
   private static String[] field18705;
   public static final EnumProperty<ComparatorMode> field18706 = BlockStateProperties.COMPARATOR_MODE;

   public Class3246(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(HORIZONTAL_FACING, Direction.NORTH)
            .with(field18708, Boolean.valueOf(false))
            .with(field18706, ComparatorMode.field325)
      );
   }

   @Override
   public int method11658(BlockState var1) {
      return 2;
   }

   @Override
   public int method11659(IBlockReader var1, BlockPos var2, BlockState var3) {
      TileEntity var6 = var1.getTileEntity(var2);
      return !(var6 instanceof Class963) ? 0 : ((Class963)var6).method3930();
   }

   private int method11660(World var1, BlockPos var2, BlockState var3) {
      return var3.get(field18706) != ComparatorMode.field326
         ? this.method11662(var1, var2, var3)
         : Math.max(this.method11662(var1, var2, var3) - this.method11668(var1, var2, var3), 0);
   }

   @Override
   public boolean method11661(World var1, BlockPos var2, BlockState var3) {
      int var6 = this.method11662(var1, var2, var3);
      if (var6 != 0) {
         int var7 = this.method11668(var1, var2, var3);
         return var6 > var7 ? true : var6 == var7 && var3.<ComparatorMode>get(field18706) == ComparatorMode.field325;
      } else {
         return false;
      }
   }

   @Override
   public int method11662(World var1, BlockPos var2, BlockState var3) {
      int var6 = super.method11662(var1, var2, var3);
      Direction var7 = var3.<Direction>get(HORIZONTAL_FACING);
      BlockPos var8 = var2.offset(var7);
      BlockState var9 = var1.getBlockState(var8);
      if (!var9.hasComparatorInputOverride()) {
         if (var6 < 15 && var9.method23400(var1, var8)) {
            var8 = var8.offset(var7);
            var9 = var1.getBlockState(var8);
            ItemFrameEntity var10 = this.method11663(var1, var7, var8);
            int var11 = Math.max(var10 != null ? var10.method4096() : Integer.MIN_VALUE, !var9.hasComparatorInputOverride() ? Integer.MIN_VALUE : var9.method23404(var1, var8));
            if (var11 != Integer.MIN_VALUE) {
               var6 = var11;
            }
         }
      } else {
         var6 = var9.method23404(var1, var8);
      }

      return var6;
   }

   @Nullable
   private ItemFrameEntity method11663(World var1, Direction var2, BlockPos var3) {
      List var6 = var1.<ItemFrameEntity>getEntitiesInAABBexcluding(
         ItemFrameEntity.class,
         new AxisAlignedBB(
            (double)var3.getX(),
            (double)var3.getY(),
            (double)var3.getZ(),
            (double)(var3.getX() + 1),
            (double)(var3.getY() + 1),
            (double)(var3.getZ() + 1)
         ),
         var1x -> var1x != null && var1x.getHorizontalFacing() == var2
      );
      return var6.size() != 1 ? null : (ItemFrameEntity)var6.get(0);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (var4.abilities.allowEdit) {
         var1 = var1.method23459(field18706);
         float var9 = var1.get(field18706) != ComparatorMode.field326 ? 0.5F : 0.55F;
         var2.playSound(var4, var3, SoundEvents.field26462, SoundCategory.field14732, 0.3F, var9);
         var2.setBlockState(var3, var1, 2);
         this.method11665(var2, var3, var1);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void method11664(World var1, BlockPos var2, BlockState var3) {
      if (!var1.getBlockTickScheduler().method20720(var2, this)) {
         int var6 = this.method11660(var1, var2, var3);
         TileEntity var7 = var1.getTileEntity(var2);
         int var8 = !(var7 instanceof Class963) ? 0 : ((Class963)var7).method3930();
         if (var6 != var8 || var3.<Boolean>get(field18708) != this.method11661(var1, var2, var3)) {
            Class2199 var9 = !this.method11673(var1, var2, var3) ? Class2199.field14370 : Class2199.field14369;
            var1.getBlockTickScheduler().method20719(var2, this, 2, var9);
         }
      }
   }

   private void method11665(World var1, BlockPos var2, BlockState var3) {
      int var6 = this.method11660(var1, var2, var3);
      TileEntity var7 = var1.getTileEntity(var2);
      int var8 = 0;
      if (var7 instanceof Class963) {
         Class963 var9 = (Class963)var7;
         var8 = var9.method3930();
         var9.method3931(var6);
      }

      if (var8 != var6 || var3.<ComparatorMode>get(field18706) == ComparatorMode.field325) {
         boolean var11 = this.method11661(var1, var2, var3);
         boolean var10 = var3.<Boolean>get(field18708);
         if (var10 && !var11) {
            var1.setBlockState(var2, var3.with(field18708, Boolean.valueOf(false)), 2);
         } else if (!var10 && var11) {
            var1.setBlockState(var2, var3.with(field18708, Boolean.valueOf(true)), 2);
         }

         this.method11670(var1, var2, var3);
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.method11665(var2, var3, var1);
   }

   @Override
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      super.method11647(var1, var2, var3, var4, var5);
      TileEntity var8 = var2.getTileEntity(var3);
      return var8 != null && var8.receiveClientEvent(var4, var5);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class963();
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, field18706, field18708);
   }
}
