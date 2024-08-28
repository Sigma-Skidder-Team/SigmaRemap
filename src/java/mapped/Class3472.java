package mapped;

import java.util.Random;

public abstract class Class3472 extends Class3471 {
   public Class3472(AbstractBlock var1) {
      super(var1);
   }

   private static boolean method12160(Class7380 var0, Class1662 var1, BlockPos var2) {
      BlockPos var5 = var2.method8311();
      Class7380 var6 = var1.method6738(var5);
      if (var6.method23448(Blocks.SNOW) && var6.<Integer>method23463(Class3410.field19092) == 1) {
         return true;
      } else if (var6.method23449().method23477() != 8) {
         int var7 = Class200.method649(var1, var0, var2, var6, var5, Direction.field673, var6.method23387(var1, var5));
         return var7 < var1.method7033();
      } else {
         return false;
      }
   }

   private static boolean method12161(Class7380 var0, Class1662 var1, BlockPos var2) {
      BlockPos var5 = var2.method8311();
      return method12160(var0, var1, var2) && !var1.method6739(var5).method23486(Class8953.field40469);
   }

   @Override
   public void method11484(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (method12160(var1, var2, var3)) {
         if (var2.method7015(var3.method8311()) >= 9) {
            Class7380 var7 = this.method11579();

            for (int var8 = 0; var8 < 4; var8++) {
               BlockPos var9 = var3.method8336(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
               if (var2.method6738(var9).method23448(Blocks.field36396) && method12161(var7, var2, var9)) {
                  var2.method6730(var9, var7.method23465(field19323, Boolean.valueOf(var2.method6738(var9.method8311()).method23448(Blocks.SNOW))));
               }
            }
         }
      } else {
         var2.method6730(var3, Blocks.field36396.method11579());
      }
   }
}
