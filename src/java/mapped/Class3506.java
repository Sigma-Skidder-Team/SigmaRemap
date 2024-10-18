package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class3506 implements Class3499<Class7435> {
   private static String[] field19388;
   private final Class8975 field19389;

   public Class3506(Class8975 var1) {
      this.field19389 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class4623 var17 = new Class4623(var2, var3, var5 + 0.5, var7);
      var17.method14507(this.field19389);
      var17.method14514(1.0F, 1.0F, 1.0F);
      return var17;
   }
}
