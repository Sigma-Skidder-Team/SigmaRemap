package mapped;

import java.util.Random;

public class Class3417 extends Block {
   private static String[] field19120;

   public Class3417(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (var2.method6812().method36877()) {
         var2.method6725(var3, Blocks.field36452.method11579(), 3);
         var2.method6999(2009, var3, 0);
         var2.method6742((PlayerEntity)null, var3, Class6067.field26582, Class2266.field14732, 1.0F, (1.0F + var2.method6814().nextFloat() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = Direction.method552(var4);
      if (var7 != Direction.field673) {
         BlockPos var8 = var3.method8349(var7);
         BlockState var9 = var2.getBlockState(var8);
         if (!var1.method23410() || !var9.method23454(var2, var8, var7.method536())) {
            double var10 = (double)var3.getX();
            double var12 = (double)var3.getY();
            double var14 = (double)var3.getZ();
            if (var7 != Direction.DOWN) {
               var12 += var4.nextDouble() * 0.8;
               if (var7.method544() != Class113.field413) {
                  var10 += var4.nextDouble();
                  if (var7 != Direction.SOUTH) {
                     var14 += 0.05;
                  } else {
                     var14++;
                  }
               } else {
                  var14 += var4.nextDouble();
                  if (var7 != Direction.EAST) {
                     var10 += 0.05;
                  } else {
                     var10++;
                  }
               }
            } else {
               var12 -= 0.05;
               var10 += var4.nextDouble();
               var14 += var4.nextDouble();
            }

            var2.method6746(Class7940.field34060, var10, var12, var14, 0.0, 0.0, 0.0);
         }
      }
   }
}
