package mapped;

import java.util.Random;

public class Class3385 extends Block implements Class3196 {
   private static String[] field18992;

   public Class3385(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      if (!var1.method6738(var2.method8311()).method23386(var1, var2)) {
         return false;
      } else {
         for (BlockPos var8 : BlockPos.method8359(var2.method8336(-1, -1, -1), var2.method8336(1, 1, 1))) {
            if (var1.method6738(var8).method23446(Class7645.field32799)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, Class7380 var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, Class7380 var4) {
      boolean var7 = false;
      boolean var8 = false;

      for (BlockPos var10 : BlockPos.method8359(var3.method8336(-1, -1, -1), var3.method8336(1, 1, 1))) {
         Class7380 var11 = var1.method6738(var10);
         if (var11.method23448(Blocks.field37074)) {
            var8 = true;
         }

         if (var11.method23448(Blocks.field37083)) {
            var7 = true;
         }

         if (var8 && var7) {
            break;
         }
      }

      if (var8 && var7) {
         var1.method6725(var3, !var2.nextBoolean() ? Blocks.field37083.method11579() : Blocks.field37074.method11579(), 3);
      } else if (!var8) {
         if (var7) {
            var1.method6725(var3, Blocks.field37083.method11579(), 3);
         }
      } else {
         var1.method6725(var3, Blocks.field37074.method11579(), 3);
      }
   }
}
