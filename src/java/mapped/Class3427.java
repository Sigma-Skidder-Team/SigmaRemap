package mapped;

import java.util.Random;

public class Class3427 extends Block {
   private static String[] field19178;

   public Class3427(Class7929 var1) {
      super(var1);
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      if (var4.nextInt(5) == 0) {
         Direction var7 = Direction.method552(var4);
         if (var7 != Direction.field673) {
            BlockPos var8 = var3.method8349(var7);
            Class7380 var9 = var2.method6738(var8);
            if (!var1.method23410() || !var9.method23454(var2, var8, var7.method536())) {
               double var10 = var7.method539() != 0 ? 0.5 + (double)var7.method539() * 0.6 : var4.nextDouble();
               double var12 = var7.method540() != 0 ? 0.5 + (double)var7.method540() * 0.6 : var4.nextDouble();
               double var14 = var7.method541() != 0 ? 0.5 + (double)var7.method541() * 0.6 : var4.nextDouble();
               var2.method6746(
                  Class7940.field34115, (double)var3.method8304() + var10, (double)var3.getY() + var12, (double)var3.method8306() + var14, 0.0, 0.0, 0.0
               );
            }
         }
      }
   }
}
