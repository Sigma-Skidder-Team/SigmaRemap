package mapped;

public class Class3514 implements Class3499<Class7435> {
   private static String[] field19403;
   public final Class8975 field19404;

   public Class3514(Class8975 var1) {
      this.field19404 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class4595 var17 = new Class4595(var2, var3, var5, var7, Class9479.field44064, ParticleTypes.field34116);
      var17.field22088 = true;
      var17.field22057 *= 0.01F;
      var17.field22056 = 100;
      var17.method14514(0.51171875F, 0.03125F, 0.890625F);
      var17.method14507(this.field19404);
      return var17;
   }
}
