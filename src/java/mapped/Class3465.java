package mapped;

import java.util.Random;

public class Class3465 extends Block {
   private static String[] field19304;
   public static final Class8554 field19305 = Class8820.field39747;
   public static final Class8551 field19306 = Class8820.field39703;

   public Class3465(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19305, Integer.valueOf(7)).method23465(field19306, Boolean.valueOf(false)));
   }

   @Override
   public Class6408 method11995(BlockState var1, Class1665 var2, BlockPos var3) {
      return Class8022.method27425();
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>method23463(field19305) == 7 && !var1.<Boolean>method23463(field19306);
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.<Boolean>method23463(field19306) && var1.<Integer>method23463(field19305) == 7) {
         method11554(var1, var2, var3);
         var2.method6728(var3, false);
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      var2.method6725(var3, method12149(var1, var2, var3), 3);
   }

   @Override
   public int method11996(BlockState var1, Class1665 var2, BlockPos var3) {
      return 1;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      int var9 = method12150(var3) + 1;
      if (var9 != 1 || var1.<Integer>method23463(field19305) != var9) {
         var4.method6860().method20726(var5, this, 1);
      }

      return var1;
   }

   private static BlockState method12149(BlockState var0, Class1660 var1, BlockPos var2) {
      int var5 = 7;
      Mutable var6 = new Mutable();

      for (Direction var10 : Direction.values()) {
         var6.method8377(var2, var10);
         var5 = Math.min(var5, method12150(var1.getBlockState(var6)) + 1);
         if (var5 == 1) {
            break;
         }
      }

      return var0.method23465(field19305, Integer.valueOf(var5));
   }

   private static int method12150(BlockState var0) {
      if (!Class7645.field32751.method24917(var0.getBlock())) {
         return !(var0.getBlock() instanceof Class3465) ? 7 : var0.<Integer>method23463(field19305);
      } else {
         return 0;
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var2.method6796(var3.method8311()) && var4.nextInt(15) == 1) {
         BlockPos var7 = var3.method8313();
         BlockState var8 = var2.getBlockState(var7);
         if (!var8.method23410() || !var8.method23454(var2, var7, Direction.field673)) {
            double var9 = (double)var3.getX() + var4.nextDouble();
            double var11 = (double)var3.getY() - 0.05;
            double var13 = (double)var3.getZ() + var4.nextDouble();
            var2.method6746(Class7940.field34060, var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19305, field19306);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return method12149(this.method11579().method23465(field19306, Boolean.valueOf(true)), var1.method18360(), var1.method18345());
   }
}
