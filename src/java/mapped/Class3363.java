package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class3363 extends Class3241 {
   private static String[] field18929;
   public static final Class6408 field18930 = Class3209.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public Class3363(Class7929 var1) {
      super(var1);
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18930;
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      super.method11512(var1, var2, var3, var4);

      for (int var7 = -2; var7 <= 2; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            if (var7 > -2 && var7 < 2 && var8 == -1) {
               var8 = 2;
            }

            if (var4.nextInt(16) == 0) {
               for (int var9 = 0; var9 <= 1; var9++) {
                  BlockPos var10 = var3.method8336(var7, var9, var8);
                  if (var2.method6738(var10).method23448(Class8487.field36525)) {
                     if (!var2.method7007(var3.method8336(var7 / 2, 0, var8 / 2))) {
                        break;
                     }

                     var2.method6746(
                        Class7940.field34066,
                        (double)var3.method8304() + 0.5,
                        (double)var3.getY() + 2.0,
                        (double)var3.method8306() + 0.5,
                        (double)((float)var7 + var4.nextFloat()) - 0.5,
                        (double)((float)var9 - var4.nextFloat() - 1.0F),
                        (double)((float)var8 + var4.nextFloat()) - 0.5
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class934();
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      Class944 var6 = var2.method6759(var3);
      if (!(var6 instanceof Class934)) {
         return null;
      } else {
         ITextComponent var7 = ((Class933)var6).method2954();
         return new Class953((var2x, var3x, var4) -> new Class5822(var2x, var3x, Class8786.method31714(var2, var3)), var7);
      }
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class934) {
            ((Class934)var8).method3698(var5.method32149());
         }
      }
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
