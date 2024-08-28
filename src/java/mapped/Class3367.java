package mapped;

public class Class3367 extends Class3241 {
   private static String[] field18937;
   public static final Class8552<Class104> field18938 = Class8820.field39772;

   public Class3367(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class964();
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class944 var9 = var2.method6759(var3);
      if (!(var9 instanceof Class964)) {
         return Class2274.field14820;
      } else {
         return !((Class964)var9).method3933(var4) ? Class2274.field14820 : Class2274.method9002(var2.field9020);
      }
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (!var1.field9020 && var4 != null) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class964) {
            ((Class964)var8).method3939(var4);
         }
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18938, Class104.field321);
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18938);
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Class3209 var4, BlockPos var5, boolean var6) {
      if (var2 instanceof Class1657) {
         Class944 var9 = var2.method6759(var3);
         if (var9 instanceof Class964) {
            Class964 var10 = (Class964)var9;
            boolean var11 = var2.method6780(var3);
            boolean var12 = var10.method3971();
            if (var11 && !var12) {
               var10.method3972(true);
               this.method11953((Class1657)var2, var10);
            } else if (!var11 && var12) {
               var10.method3972(false);
            }
         }
      }
   }

   private void method11953(Class1657 var1, Class964 var2) {
      switch (Class8113.field34871[var2.method3950().ordinal()]) {
         case 1:
            var2.method3964(false);
            break;
         case 2:
            var2.method3967(var1, false);
            break;
         case 3:
            var2.method3969();
         case 4:
      }
   }
}
