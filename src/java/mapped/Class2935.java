package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import javax.annotation.Nullable;
import java.util.Random;

public class Class2935 extends Class2898<Class4708> {
   private static final ImmutableList<Class3209> field18005 = ImmutableList.of(
      Class8487.field36414,
      Class8487.field36412,
      Class8487.field36890,
      Class8487.field36581,
      Class8487.field36642,
      Class8487.field36643,
      Class8487.field36644,
      Class8487.field36645,
      Class8487.field36534,
      Class8487.field36532
   );

   public Class2935(Codec<Class4708> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4708 var5) {
      int var8 = var2.method17807();
      if (method11274(var1, var8, var4.method8354())) {
         int var9 = var5.method14783().method27633(var3);
         boolean var10 = var3.nextFloat() < 0.9F;
         int var11 = Math.min(var9, !var10 ? 8 : 5);
         int var12 = !var10 ? 15 : 50;
         boolean var13 = false;

         for (BlockPos var15 : BlockPos.method8355(
            var3,
            var12,
            var4.method8304() - var11,
            var4.getY(),
            var4.method8306() - var11,
            var4.method8304() + var11,
            var4.getY(),
            var4.method8306() + var11
         )) {
            int var16 = var9 - var15.method8321(var4);
            if (var16 >= 0) {
               var13 |= this.method11272(var1, var8, var15, var16, var5.method14782().method27633(var3));
            }
         }

         return var13;
      } else {
         return false;
      }
   }

   private boolean method11272(Class1660 var1, int var2, BlockPos var3, int var4, int var5) {
      boolean var8 = false;

      for (BlockPos var10 : BlockPos.method8364(
         var3.method8304() - var5, var3.getY(), var3.method8306() - var5, var3.method8304() + var5, var3.getY(), var3.method8306() + var5
      )) {
         int var11 = var10.method8321(var3);
         BlockPos var12 = !method11276(var1, var2, var10) ? method11275(var1, var10.method8354(), var11) : method11273(var1, var2, var10.method8354(), var11);
         if (var12 != null) {
            int var13 = var4 - var11 / 2;

            for (Mutable var14 = var12.method8354(); var13 >= 0; var13--) {
               if (!method11276(var1, var2, var14)) {
                  if (!var1.method6738(var14).method23448(Class8487.field36583)) {
                     break;
                  }

                  var14.method8379(Direction.field673);
               } else {
                  this.method11217(var1, var14, Class8487.field36583.method11579());
                  var14.method8379(Direction.field673);
                  var8 = true;
               }
            }
         }
      }

      return var8;
   }

   @Nullable
   private static BlockPos method11273(Class1660 var0, int var1, Mutable var2, int var3) {
      while (var2.getY() > 1 && var3 > 0) {
         var3--;
         if (method11274(var0, var1, var2)) {
            return var2;
         }

         var2.method8379(Direction.field672);
      }

      return null;
   }

   private static boolean method11274(Class1660 var0, int var1, Mutable var2) {
      if (!method11276(var0, var1, var2)) {
         return false;
      } else {
         Class7380 var5 = var0.method6738(var2.method8379(Direction.field672));
         var2.method8379(Direction.field673);
         return !var5.method23393() && !field18005.contains(var5.method23383());
      }
   }

   @Nullable
   private static BlockPos method11275(Class1660 var0, Mutable var1, int var2) {
      while (var1.getY() < var0.method7034() && var2 > 0) {
         var2--;
         Class7380 var5 = var0.method6738(var1);
         if (!field18005.contains(var5.method23383())) {
            if (!var5.method23393()) {
               var1.method8379(Direction.field673);
               continue;
            }

            return var1;
         }

         return null;
      }

      return null;
   }

   private static boolean method11276(Class1660 var0, int var1, BlockPos var2) {
      Class7380 var5 = var0.method6738(var2);
      return var5.method23393() || var5.method23448(Class8487.field36414) && var2.getY() <= var1;
   }
}
