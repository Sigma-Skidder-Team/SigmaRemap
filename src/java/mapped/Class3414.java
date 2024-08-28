package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3414 extends Block {
   private static String[] field19103;
   private final Block field19104;

   public Class3414(Block var1, Class7929 var2) {
      super(var2);
      this.field19104 = var1;
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (!this.method12052(var2, var3)) {
         var2.method6725(var3, this.field19104.method11579(), 2);
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!this.method12052(var4, var5)) {
         var4.method6860().method20726(var5, this, 60 + var4.method6814().nextInt(40));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   public boolean method12052(Class1665 var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         Class7379 var9 = var1.method6739(var2.method8349(var8));
         if (var9.method23486(Class8953.field40469)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      if (!this.method12052(var1.method18360(), var1.method18345())) {
         var1.method18360().method6860().method20726(var1.method18345(), this, 60 + var1.method18360().method6814().nextInt(40));
      }

      return this.method11579();
   }
}
