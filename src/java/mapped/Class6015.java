package mapped;

public final class Class6015 implements Class6014 {
   private static String[] field26201;
   public final Class8518 field26202;

   public Class6015(Class8518 var1) {
      this.field26202 = var1;
   }

   @Override
   public float[] method18646(Class2520 var1, float var2, float var3) {
      this.field26202.method30178(var1, var2, var3).method10392();
      Class2532 var6 = this.field26202.method30180(var1, var2, var3);
      return new float[]{var6.field16737 + var2, var6.field16738 + var3};
   }
}
