package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class3524 implements Class3499<Class7435> {
   private static String[] field19421;
   private final Class8975 field19422;

   public Class3524(Class8975 var1) {
      this.field19422 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class4572 var17 = new Class4572(var2, var3, var5, var7, var9, var11, var13, this.field19422);
      float var18 = var2.rand.nextFloat() * 0.5F + 0.35F;
      var17.method14514(1.0F * var18, 0.0F * var18, 1.0F * var18);
      return var17;
   }
}
