package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class7634 extends Class7633 {
   @Override
   public Class7631 method25075() {
      return Class9479.field44065;
   }

   @Override
   public Class7631 method25077() {
      return Class9479.field44066;
   }

   @Override
   public Class3257 method25050() {
      return Class8514.field37883;
   }

   @Override
   public void method25051(Class1655 var1, BlockPos var2, Class7379 var3, Random var4) {
      if (!var3.method23473() && !var3.<Boolean>method23463(field32712)) {
         if (var4.nextInt(64) == 0) {
            var1.method6745(
               (double)var2.method8304() + 0.5,
               (double)var2.getY() + 0.5,
               (double)var2.method8306() + 0.5,
               Class6067.field27225,
               Class2266.field14732,
               var4.nextFloat() * 0.25F + 0.75F,
               var4.nextFloat() + 0.5F,
               false
            );
         }
      } else if (var4.nextInt(10) == 0) {
         var1.method6746(
            Class7940.field34098,
            (double)var2.method8304() + var4.nextDouble(),
            (double)var2.getY() + var4.nextDouble(),
            (double)var2.method8306() + var4.nextDouble(),
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Nullable
   @Override
   public Class7436 method25054() {
      return Class7940.field34060;
   }

   @Override
   public boolean method25079() {
      return true;
   }

   @Override
   public void method25081(Class1660 var1, BlockPos var2, Class7380 var3) {
      Class944 var6 = !var3.method23383().method11998() ? null : var1.method6759(var2);
      Block.method11555(var3, var1, var2, var6);
   }

   @Override
   public int method25087(Class1662 var1) {
      return 4;
   }

   @Override
   public Class7380 method25063(Class7379 var1) {
      return Blocks.WATER.method11579().method23465(Class3404.field19079, Integer.valueOf(method25094(var1)));
   }

   @Override
   public boolean method25066(Class7631 var1) {
      return var1 == Class9479.field44066 || var1 == Class9479.field44065;
   }

   @Override
   public int method25092(Class1662 var1) {
      return 1;
   }

   @Override
   public int method25057(Class1662 var1) {
      return 5;
   }

   @Override
   public boolean method25055(Class7379 var1, Class1665 var2, BlockPos var3, Class7631 var4, Direction var5) {
      return var5 == Direction.field672 && !var4.method25067(Class8953.field40469);
   }

   @Override
   public float method25060() {
      return 100.0F;
   }
}
