package mapped;

import java.util.Random;

public class Class3376 extends Class3241 {
   private static String[] field18974;
   public static final Class8551[] field18975 = new Class8551[]{Class8820.field39692, Class8820.field39693, Class8820.field39694};
   public static final Class6408 field18976 = Class8022.method27431(
      Block.method11539(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), Block.method11539(7.0, 0.0, 7.0, 9.0, 14.0, 9.0)
   );

   public Class3376(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18975[0], Boolean.valueOf(false))
            .method23465(field18975[1], Boolean.valueOf(false))
            .method23465(field18975[2], Boolean.valueOf(false))
      );
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class931();
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18976;
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         Class944 var9 = var2.method6759(var3);
         if (var9 instanceof Class931) {
            var4.method2766((Class931)var9);
            var4.method2911(Class8876.field40147);
         }

         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class931) {
            ((Class931)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.method8304() + 0.4 + (double)var4.nextFloat() * 0.2;
      double var9 = (double)var3.getY() + 0.7 + (double)var4.nextFloat() * 0.3;
      double var11 = (double)var3.method8306() + 0.4 + (double)var4.nextFloat() * 0.2;
      var2.method6746(Class7940.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class931) {
            Class7236.method22721(var2, var3, (Class931)var8);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return Class5812.method18151(var2.method6759(var3));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18975[0], field18975[1], field18975[2]);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
