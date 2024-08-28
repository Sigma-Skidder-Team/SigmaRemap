package mapped;

public abstract class Class3373 extends Class3241 implements Class3207 {
   public static final Class8551 field18966 = Class8820.field39710;
   public static final Class6408 field18967 = Block.method11539(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final Class9673 field18968;

   public Class3373(Class7929 var1, Class9673 var2) {
      super(var1);
      this.field18968 = var2;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18966)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18967;
   }

   @Override
   public boolean method11564() {
      return true;
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class954();
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class8848 var9 = var4.method3094(var5);
      boolean var10 = var9.method32107() instanceof Class3321 && var4.field4919.field29610;
      if (!var2.field9020) {
         Class944 var11 = var2.method6759(var3);
         if (!(var11 instanceof Class954)) {
            return Class2274.field14820;
         } else {
            Class954 var12 = (Class954)var11;
            if (var10) {
               boolean var13 = var12.method3845(((Class3321)var9.method32107()).method11876());
               if (var13 && !var4.method2801()) {
                  var9.method32182(1);
               }
            }

            return !var12.method3842(var4) ? Class2274.field14820 : Class2274.field14818;
         }
      } else {
         return !var10 ? Class2274.field14819 : Class2274.field14818;
      }
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18966) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   public Class9673 method11967() {
      return this.field18968;
   }
}
