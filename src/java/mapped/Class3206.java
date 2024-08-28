package mapped;

public class Class3206 extends Class3198 implements Class3207 {
   private static String[] field18593;
   public static final Class8551 field18594 = Class8820.field39702;
   public static final Class8552<Class99> field18595 = Class8820.field39735;
   public static final Class8551 field18596 = Class8820.field39704;
   public static final Class8551 field18597 = Class8820.field39710;
   public static final Class6408 field18598 = Class3209.method11539(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   public static final Class6408 field18599 = Class3209.method11539(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final Class6408 field18600 = Class3209.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final Class6408 field18601 = Class3209.method11539(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   public static final Class6408 field18602 = Class3209.method11539(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   public static final Class6408 field18603 = Class3209.method11539(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

   public Class3206(Class7929 var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18484, Direction.NORTH)
            .method23465(field18594, Boolean.valueOf(false))
            .method23465(field18595, Class99.field271)
            .method23465(field18596, Boolean.valueOf(false))
            .method23465(field18597, Boolean.valueOf(false))
      );
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      if (!var1.<Boolean>method23463(field18594)) {
         return var1.method23463(field18595) == Class99.field270 ? field18603 : field18602;
      } else {
         switch (Class8826.field39790[var1.<Direction>method23463(field18484).ordinal()]) {
            case 1:
            default:
               return field18601;
            case 2:
               return field18600;
            case 3:
               return field18599;
            case 4:
               return field18598;
         }
      }
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      switch (Class8826.field39791[var4.ordinal()]) {
         case 1:
            return var1.<Boolean>method23463(field18594);
         case 2:
            return var1.<Boolean>method23463(field18597);
         case 3:
            return var1.<Boolean>method23463(field18594);
         default:
            return false;
      }
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (this.field19004 != Class8649.field38967) {
         var1 = var1.method23459(field18594);
         var2.method6725(var3, var1, 2);
         if (var1.<Boolean>method23463(field18597)) {
            var2.method6861().method20726(var3, Class9479.field44066, Class9479.field44066.method25057(var2));
         }

         this.method11530(var4, var2, var3, var1.<Boolean>method23463(field18594));
         return Class2274.method9002(var2.field9020);
      } else {
         return Class2274.field14820;
      }
   }

   public void method11530(PlayerEntity var1, Class1655 var2, BlockPos var3, boolean var4) {
      if (!var4) {
         int var7 = this.field19004 != Class8649.field38967 ? 1013 : 1036;
         var2.method6869(var1, var7, var3, 0);
      } else {
         int var8 = this.field19004 != Class8649.field38967 ? 1007 : 1037;
         var2.method6869(var1, var8, var3, 0);
      }
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Class3209 var4, BlockPos var5, boolean var6) {
      if (!var2.field9020) {
         boolean var9 = var2.method6780(var3);
         if (var9 != var1.<Boolean>method23463(field18596)) {
            if (var1.<Boolean>method23463(field18594) != var9) {
               var1 = var1.method23465(field18594, Boolean.valueOf(var9));
               this.method11530((PlayerEntity)null, var2, var3, var9);
            }

            var2.method6725(var3, var1.method23465(field18596, Boolean.valueOf(var9)), 2);
            if (var1.<Boolean>method23463(field18597)) {
               var2.method6861().method20726(var3, Class9479.field44066, Class9479.field44066.method25057(var2));
            }
         }
      }
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = this.method11579();
      Class7379 var5 = var1.method18360().method6739(var1.method18345());
      Direction var6 = var1.method18354();
      if (!var1.method18347() && var6.method544().method324()) {
         var4 = var4.method23465(field18484, var6)
            .method23465(field18595, !(var1.method18355().field18049 - (double)var1.method18345().getY() > 0.5) ? Class99.field271 : Class99.field270);
      } else {
         var4 = var4.method23465(field18484, var1.method18350().method536())
            .method23465(field18595, var6 != Direction.field673 ? Class99.field270 : Class99.field271);
      }

      if (var1.method18360().method6780(var1.method18345())) {
         var4 = var4.method23465(field18594, Boolean.valueOf(true)).method23465(field18596, Boolean.valueOf(true));
      }

      return var4.method23465(field18597, Boolean.valueOf(var5.method23472() == Class9479.field44066));
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18484, field18594, field18595, field18596, field18597);
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18597) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18597)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }
}
