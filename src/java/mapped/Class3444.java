package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class3444 extends Block {
   public final Direction field19256;
   public final boolean field19257;
   public final VoxelShape field19258;

   public Class3444(Properties var1, Direction var2, VoxelShape var3, boolean var4) {
      super(var1);
      this.field19256 = var2;
      this.field19258 = var3;
      this.field19257 = var4;
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = var1.getWorld().getBlockState(var1.getPos().offset(this.field19256));
      return !var4.isIn(this.method12124()) && !var4.isIn(this.method12125())
         ? this.method12122(var1.getWorld())
         : this.method12125().getDefaultState();
   }

   public BlockState method12122(IWorld var1) {
      return this.getDefaultState();
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.offset(this.field19256.getOpposite());
      BlockState var7 = var2.getBlockState(var6);
      Block var8 = var7.getBlock();
      return !this.method12123(var8) ? false : var8 == this.method12124() || var8 == this.method12125() || var7.method23454(var2, var6, this.field19256);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.isValidPosition(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   public boolean method12123(Block var1) {
      return true;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field19258;
   }

   public abstract Class3452 method12124();

   public abstract Block method12125();
}
