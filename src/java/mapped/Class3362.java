package mapped;

public class Class3362 extends Class3241 {
   private static String[] field18912;
   public static final Class8553 field18913 = Class8820.field39721;
   public static final Class8551 field18914 = Class8820.field39687;
   private static final Class6408 field18915 = Block.method11539(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final Class6408 field18916 = Block.method11539(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final Class6408 field18917 = Class8022.method27431(field18916, field18915);
   private static final Class6408 field18918 = Class8022.method27433(field18917, Class937.field5296, Class9477.field44041);
   private static final Class6408 field18919 = Class8022.method27431(field18918, Block.method11539(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final Class6408 field18920 = Class8022.method27431(field18918, Block.method11539(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final Class6408 field18921 = Class8022.method27431(field18918, Block.method11539(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final Class6408 field18922 = Class8022.method27431(field18918, Block.method11539(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final Class6408 field18923 = Class8022.method27431(field18918, Block.method11539(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final Class6408 field18924 = Class937.field5296;
   private static final Class6408 field18925 = Class8022.method27431(Class937.field5296, Block.method11539(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final Class6408 field18926 = Class8022.method27431(Class937.field5296, Block.method11539(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final Class6408 field18927 = Class8022.method27431(Class937.field5296, Block.method11539(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final Class6408 field18928 = Class8022.method27431(Class937.field5296, Block.method11539(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public Class3362(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18913, Direction.field672).method23465(field18914, Boolean.valueOf(true)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      switch (Class9391.field43583[var1.<Direction>method23463(field18913).ordinal()]) {
         case 1:
            return field18919;
         case 2:
            return field18921;
         case 3:
            return field18922;
         case 4:
            return field18923;
         case 5:
            return field18920;
         default:
            return field18918;
      }
   }

   @Override
   public Class6408 method11938(Class7380 var1, Class1665 var2, BlockPos var3) {
      switch (Class9391.field43583[var1.<Direction>method23463(field18913).ordinal()]) {
         case 1:
            return field18924;
         case 2:
            return field18926;
         case 3:
            return field18927;
         case 4:
            return field18928;
         case 5:
            return field18925;
         default:
            return Class937.field5296;
      }
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Direction var4 = var1.method18354().method536();
      return this.method11579()
         .method23465(field18913, var4.method544() != Class113.field414 ? var4 : Direction.field672)
         .method23465(field18914, Boolean.valueOf(true));
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class936();
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class936) {
            ((Class936)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var4.method23448(var1.method23383())) {
         this.method11939(var2, var3, var1);
      }
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         Class944 var9 = var2.method6759(var3);
         if (var9 instanceof Class936) {
            var4.method2766((Class936)var9);
            var4.method2911(Class8876.field40150);
         }

         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      this.method11939(var2, var3, var1);
   }

   private void method11939(Class1655 var1, BlockPos var2, Class7380 var3) {
      boolean var6 = !var1.method6780(var2);
      if (var6 != var3.<Boolean>method23463(field18914)) {
         var1.method6725(var2, var3.method23465(field18914, Boolean.valueOf(var6)), 4);
      }
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class936) {
            Class7236.method22721(var2, var3, (Class936)var8);
            var2.method6806(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
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
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18913, var2.method252(var1.<Direction>method23463(field18913)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18913)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18913, field18914);
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      Class944 var7 = var2.method6759(var3);
      if (var7 instanceof Class936) {
         ((Class936)var7).method3726(var4);
      }
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
