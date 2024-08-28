package mapped;

public class Class3422 extends Class3209 {
   private static String[] field19150;
   public static final Class6408 field19151 = Class3209.method11539(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private final Class112 field19152;

   public Class3422(Class112 var1, Class7929 var2) {
      super(var2);
      this.field19152 = var1;
   }

   public Class112 method12077() {
      return this.field19152;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19151;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1.method23443(var4, var5) ? super.method11491(var1, var2, var3, var4, var5, var6) : Class8487.field36387.method11579();
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return !var2.method7007(var3.method8313());
   }
}
