package mapped;

public class Class3045 extends Class3032<Short, Integer> {
   private static String[] field18199;
   public final Class3810 field18200;

   public Class3045(Class3810 var1, Class4750 var2) {
      super(var2);
      this.field18200 = var1;
   }

   public Integer method11402(Class8563 var1, Short var2) throws Exception {
      int var5 = var1.<Integer>method30555(Class4750.field22544, 0);
      int var6 = var1.method30580().<Class6057>method22438(Class6057.class).method18670();
      return var5 != var6 ? var2 <= 0 ? var2.intValue() : var2.intValue() + 1 : var2.intValue() + 2;
   }
}
