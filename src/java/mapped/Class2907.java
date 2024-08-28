package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2907 extends Class2898<Class4712> {
   public Class2907(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      if (var1.method7007(var4) && !var1.method7007(var4.method8311())) {
         Mutable var8 = var4.method8354();
         Mutable var9 = var4.method8354();
         boolean var10 = true;
         boolean var11 = true;
         boolean var12 = true;
         boolean var13 = true;

         while (var1.method7007(var8)) {
            if (Class1655.method6720(var8)) {
               return true;
            }

            var1.method6725(var8, Blocks.BASALT.method11579(), 2);
            var10 = var10 && this.method11246(var1, var3, var9.method8377(var8, Direction.NORTH));
            var11 = var11 && this.method11246(var1, var3, var9.method8377(var8, Direction.SOUTH));
            var12 = var12 && this.method11246(var1, var3, var9.method8377(var8, Direction.WEST));
            var13 = var13 && this.method11246(var1, var3, var9.method8377(var8, Direction.EAST));
            var8.method8379(Direction.field672);
         }

         var8.method8379(Direction.field673);
         this.method11245(var1, var3, var9.method8377(var8, Direction.NORTH));
         this.method11245(var1, var3, var9.method8377(var8, Direction.SOUTH));
         this.method11245(var1, var3, var9.method8377(var8, Direction.WEST));
         this.method11245(var1, var3, var9.method8377(var8, Direction.EAST));
         var8.method8379(Direction.field672);
         Mutable var14 = new Mutable();

         for (int var15 = -3; var15 < 4; var15++) {
            for (int var16 = -3; var16 < 4; var16++) {
               int var17 = Class9679.method37772(var15) * Class9679.method37772(var16);
               if (var3.nextInt(10) < 10 - var17) {
                  var14.method8374(var8.method8336(var15, 0, var16));
                  int var18 = 3;

                  while (var1.method7007(var9.method8377(var14, Direction.field672))) {
                     var14.method8379(Direction.field672);
                     if (--var18 <= 0) {
                        break;
                     }
                  }

                  if (!var1.method7007(var9.method8377(var14, Direction.field672))) {
                     var1.method6725(var14, Blocks.BASALT.method11579(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void method11245(Class1660 var1, Random var2, BlockPos var3) {
      if (var2.nextBoolean()) {
         var1.method6725(var3, Blocks.BASALT.method11579(), 2);
      }
   }

   private boolean method11246(Class1660 var1, Random var2, BlockPos var3) {
      if (var2.nextInt(10) == 0) {
         return false;
      } else {
         var1.method6725(var3, Blocks.BASALT.method11579(), 2);
         return true;
      }
   }
}
