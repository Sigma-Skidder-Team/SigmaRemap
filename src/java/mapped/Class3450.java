package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3450 extends Class3194 implements Class3196, Class3449 {
   private static String[] field18470;
   public static final Class6408 field19264 = Block.method11539(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   public Class3450(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19264;
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23454(var2, var3, Direction.field673) && !var1.method23448(Blocks.field36890);
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7379 var4 = var1.method18360().method6739(var1.method18345());
      return var4.method23486(Class8953.field40469) && var4.method23477() == 8 ? super.method11495(var1) : null;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Class7380 var9 = super.method11491(var1, var2, var3, var4, var5, var6);
      if (!var9.method23393()) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var9;
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(Class1655 var1, Random var2, BlockPos var3, Class7380 var4) {
      return true;
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return Class9479.field44066.method25078(false);
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, Class7380 var4) {
      Class7380 var7 = Blocks.TALL_SEAGRASS.method11579();
      Class7380 var8 = var7.method23465(Class3455.field19274, Class84.field209);
      BlockPos var9 = var3.method8311();
      if (var1.method6738(var9).method23448(Blocks.WATER)) {
         var1.method6725(var3, var7, 2);
         var1.method6725(var9, var8, 2);
      }
   }

   @Override
   public boolean method11531(Class1665 var1, BlockPos var2, Class7380 var3, Class7631 var4) {
      return false;
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, Class7380 var3, Class7379 var4) {
      return false;
   }
}
