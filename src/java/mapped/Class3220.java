package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class3220 extends Block {
   private static String[] field18639;
   public static final Class8554 field18640 = Class8820.field39743;
   public static final VoxelShape field18641 = Block.method11539(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   public static final VoxelShape field18642 = Block.method11539(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public Class3220(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18640, Integer.valueOf(0)));
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.up();
      if (var2.method7007(var7)) {
         int var8 = 1;

         while (var2.getBlockState(var3.method8340(var8)).method23448(this)) {
            var8++;
         }

         if (var8 < 3) {
            int var9 = var1.<Integer>method23463(field18640);
            if (var9 != 15) {
               var2.setBlockState(var3, var1.method23465(field18640, Integer.valueOf(var9 + 1)), 4);
            } else {
               var2.setBlockState(var7, this.method11579());
               BlockState var10 = var1.method23465(field18640, Integer.valueOf(0));
               var2.setBlockState(var3, var10, 4);
               var10.method23423(var2, var7, this, var3, false);
            }
         }
      }
   }

   @Override
   public VoxelShape method11502(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18641;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18642;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      for (Direction var7 : Class76.field161) {
         BlockState var8 = var2.getBlockState(var3.method8349(var7));
         Class8649 var9 = var8.method23384();
         if (var9.method31086() || var2.getFluidState(var3.method8349(var7)).method23486(Class8953.field40470)) {
            return false;
         }
      }

      BlockState var10 = var2.getBlockState(var3.down());
      return (var10.method23448(Blocks.CACTUS) || var10.method23448(Blocks.SAND) || var10.method23448(Blocks.RED_SAND))
         && !var2.getBlockState(var3.up()).method23384().method31085();
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      var4.method2741(Class8654.field39001, 1.0F);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18640);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
