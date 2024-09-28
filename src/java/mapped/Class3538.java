package mapped;

import net.minecraft.fluid.Fluids;

public class Class3538 implements Class3499<Class7435> {
   private static String[] field19447;
   public final Class8975 field19448;

   public Class3538(Class8975 var1) {
      this.field19448 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class4596 var17 = new Class4596(var2, var3, var5, var7, Fluids.LAVA, ParticleTypes.field34058);
      var17.method14507(this.field19448);
      return var17;
   }
}
