package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3437 extends Class3433 {
   private static String[] field19233;
   public static final VoxelShape field19234 = Block.method11539(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   public static final VoxelShape field19235 = Block.method11539(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   public static final VoxelShape field19236 = Block.method11539(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   public Class3437(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19198, Direction.field673));
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field19198, var2.method252(var1.<Direction>method23463(field19198)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23465(field19198, var2.method8750(var1.<Direction>method23463(field19198)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class8694.field39238[var1.<Direction>method23463(field19198).getAxis().ordinal()]) {
         case 1:
         default:
            return field19236;
         case 2:
            return field19235;
         case 3:
            return field19234;
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      Direction var4 = var1.method18354();
      BlockState var5 = var1.method18360().getBlockState(var1.method18345().method8349(var4.method536()));
      return var5.isIn(this) && var5.method23463(field19198) == var4
         ? this.method11579().method23465(field19198, var4.method536())
         : this.method11579().method23465(field19198, var4);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = var1.<Direction>method23463(field19198);
      double var8 = (double)var3.getX() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var10 = (double)var3.getY() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var12 = (double)var3.getZ() + 0.55 - (double)(var4.nextFloat() * 0.1F);
      double var14 = (double)(0.4F - (var4.nextFloat() + var4.nextFloat()) * 0.4F);
      if (var4.nextInt(5) == 0) {
         var2.addParticle(
            ParticleTypes.field34067,
            var8 + (double)var7.method539() * var14,
            var10 + (double)var7.method540() * var14,
            var12 + (double)var7.method541() * var14,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005,
            var4.nextGaussian() * 0.005
         );
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19198);
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15862;
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
