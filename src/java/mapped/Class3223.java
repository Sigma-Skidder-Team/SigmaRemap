package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3223 extends Block {
   private static String[] field18660;
   public static final Class8551 field18661 = Class3383.field18987;

   public Class3223(AbstractBlock var1) {
      super(var1);
      this.method11578(this.method11579().method23465(field18661, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18661, Boolean.valueOf(var1.method18360().method6780(var1.method18345())));
   }

   @Override
   public void method11506(Class7380 var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.field9020) {
         boolean var9 = var1.<Boolean>method23463(field18661);
         if (var9 != var2.method6780(var3)) {
            if (!var9) {
               var2.method6725(var3, var1.method23459(field18661), 2);
            } else {
               var2.method6860().method20726(var3, this, 4);
            }
         }
      }
   }

   @Override
   public void method11522(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18661) && !var2.method6780(var3)) {
         var2.method6725(var3, var1.method23459(field18661), 2);
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18661);
   }
}
