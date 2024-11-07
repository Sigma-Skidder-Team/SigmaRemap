package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3365 extends Class3241 {
   private static String[] field18932;
   public static final VoxelShape field18933 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public Class3365(Properties var1) {
      super(var1);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class956();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18933;
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (var2 instanceof ServerWorld
         && !var4.isPassenger()
         && !var4.isBeingRidden()
         && var4.method3367()
         && VoxelShapes.compare(
            VoxelShapes.create(var4.getBoundingBox().offset((double)(-var3.getX()), (double)(-var3.getY()), (double)(-var3.getZ()))),
            var1.getShape(var2, var3),
            IBooleanFunction.AND
         )) {
         RegistryKey var7 = var2.getDimensionKey() != World.THE_END ? World.THE_END : World.OVERWORLD;
         ServerWorld var8 = ((ServerWorld)var2).getServer().method1318(var7);
         if (var8 == null) {
            return;
         }

         var4.changeDimension(var8);
      }
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + var4.nextDouble();
      double var9 = (double)var3.getY() + 0.8;
      double var11 = (double)var3.getZ() + var4.nextDouble();
      var2.addParticle(ParticleTypes.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public boolean method11650(BlockState var1, Fluid var2) {
      return false;
   }
}
