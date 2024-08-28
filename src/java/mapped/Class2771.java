package mapped;

public class Class2771<T extends Class880> extends Class2770<T> {
   private static String[] field17348;
   private final Class1097 field17360;

   public Class2771(Class1097 var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6, Class8088.field34763::test);
      this.field17360 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17360.method5211() && this.field17360.method5230() && super.method10803();
   }
}
