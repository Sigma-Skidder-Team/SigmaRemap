package mapped;

import java.util.Random;

public class Class3406 extends Block implements Class3405 {
   private static String[] field19083;
   public static final Class8551 field19084 = Class8820.field39686;

   public Class3406(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19084, Boolean.valueOf(true)));
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      BlockState var7 = var2.getBlockState(var3.up());
      if (!var7.isAir()) {
         var4.method3355(var1.<Boolean>method23463(field19084));
      } else {
         var4.method3354(var1.<Boolean>method23463(field19084));
         if (!var2.isRemote) {
            ServerWorld var8 = (ServerWorld)var2;

            for (int var9 = 0; var9 < 2; var9++) {
               var8.method6939(
                  Class7940.field34099,
                  (double)var3.getX() + var2.rand.nextDouble(),
                  (double)(var3.getY() + 1),
                  (double)var3.getZ() + var2.rand.nextDouble(),
                  1,
                  0.0,
                  0.0,
                  0.0,
                  1.0
               );
               var8.method6939(
                  Class7940.field34052,
                  (double)var3.getX() + var2.rand.nextDouble(),
                  (double)(var3.getY() + 1),
                  (double)var3.getZ() + var2.rand.nextDouble(),
                  1,
                  0.0,
                  0.01,
                  0.0,
                  0.2
               );
            }
         }
      }
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      method12045(var2, var3.up(), method12047(var2, var3.down()));
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      method12045(var2, var3.up(), method12047(var2, var3));
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return Class9479.field44066.method25078(false);
   }

   public static void method12045(Class1660 var0, BlockPos var1, boolean var2) {
      if (method12046(var0, var1)) {
         var0.setBlockState(var1, Blocks.field37013.method11579().method23465(field19084, Boolean.valueOf(var2)), 2);
      }
   }

   public static boolean method12046(Class1660 var0, BlockPos var1) {
      FluidState var4 = var0.getFluidState(var1);
      return var0.getBlockState(var1).method23448(Blocks.WATER) && var4.method23477() >= 8 && var4.method23473();
   }

   private static boolean method12047(Class1665 var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      return !var4.method23448(Blocks.field37013) ? !var4.method23448(Blocks.SOUL_SAND) : var4.<Boolean>method23463(field19084);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX();
      double var9 = (double)var3.getY();
      double var11 = (double)var3.getZ();
      if (!var1.<Boolean>method23463(field19084)) {
         var2.method6748(Class7940.field34103, var7 + 0.5, var9, var11 + 0.5, 0.0, 0.04, 0.0);
         var2.method6748(
            Class7940.field34103, var7 + (double)var4.nextFloat(), var9 + (double)var4.nextFloat(), var11 + (double)var4.nextFloat(), 0.0, 0.04, 0.0
         );
         if (var4.nextInt(200) == 0) {
            var2.method6745(
               var7, var9, var11, Sounds.field26422, Class2266.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }
      } else {
         var2.method6748(Class7940.field34102, var7 + 0.5, var9 + 0.8, var11, 0.0, 0.0, 0.0);
         if (var4.nextInt(200) == 0) {
            var2.method6745(
               var7, var9, var11, Sounds.field26424, Class2266.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.method23443(var4, var5)) {
         if (var2 != Direction.DOWN) {
            if (var2 == Direction.field673 && !var3.method23448(Blocks.field37013) && method12046(var4, var6)) {
               var4.method6860().method20726(var5, this, 5);
            }
         } else {
            var4.setBlockState(var5, Blocks.field37013.method11579().method23465(field19084, Boolean.valueOf(method12047(var4, var6))), 2);
         }

         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.WATER.method11579();
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      return var6.method23448(Blocks.field37013) || var6.method23448(Blocks.field36890) || var6.method23448(Blocks.SOUL_SAND);
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27425();
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19084);
   }

   @Override
   public Fluid method11533(Class1660 var1, BlockPos var2, BlockState var3) {
      var1.setBlockState(var2, Blocks.AIR.method11579(), 11);
      return Class9479.field44066;
   }
}
