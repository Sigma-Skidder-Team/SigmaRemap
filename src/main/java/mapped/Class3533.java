package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.Fluids;

public class Class3533 implements Class3499<Class7435> {
   private static String[] field19438;
   public final Class8975 field19439;

   public Class3533(Class8975 var1) {
      this.field19439 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class4597 var17 = new Class4597(var2, var3, var5, var7, Fluids.EMPTY);
      var17.field22056 = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      var17.method14514(0.522F, 0.408F, 0.082F);
      var17.method14507(this.field19439);
      return var17;
   }
}
