package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class3365 extends Class3241 {
   private static String[] field18932;
   public static final VoxelShape field18933 = Block.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public Class3365(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class956();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18933;
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (var2 instanceof ServerWorld
         && !var4.isPassenger()
         && !var4.isBeingRidden()
         && var4.method3367()
         && VoxelShapes.compare(
            VoxelShapes.create(var4.getBoundingBox().method19667((double)(-var3.getX()), (double)(-var3.getY()), (double)(-var3.getZ()))),
            var1.method23412(var2, var3),
            IBooleanFunction.AND
         )) {
         RegistryKey var7 = var2.getDimensionKey() != World.THE_END ? World.THE_END : World.OVERWORLD;
         ServerWorld var8 = ((ServerWorld)var2).getServer().method1318(var7);
         if (var8 == null) {
            return;
         }

         var4.method2745(var8);
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + var4.nextDouble();
      double var9 = (double)var3.getY() + 0.8;
      double var11 = (double)var3.getZ() + var4.nextDouble();
      var2.method6746(Class7940.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public boolean method11650(BlockState var1, Fluid var2) {
      return false;
   }
}
