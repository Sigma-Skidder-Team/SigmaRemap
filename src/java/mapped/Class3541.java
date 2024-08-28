package mapped;

public class Class3541 implements Class3499<Class7435> {
   private static String[] field19453;
   private final Class8975 field19454;

   public Class3541(Class8975 var1) {
      this.field19454 = var1;
   }

   public Class4587 method12199(Class7435 var1, Class1656 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      double var17 = (double)var2.field9016.nextFloat() * -1.9 * (double)var2.field9016.nextFloat() * 0.1;
      Class4607 var19 = new Class4607(var2, var3, var5, var7, 0.0, var17, 0.0);
      var19.method14507(this.field19454);
      var19.method14514(0.1F, 0.1F, 0.3F);
      var19.method14519(0.001F, 0.001F);
      return var19;
   }
}
