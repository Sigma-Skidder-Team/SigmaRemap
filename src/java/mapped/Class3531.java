package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class3531 implements Class3499<Class7435> {
   private static String[] field19434;
   private final Class8975 field19435;

   public Class3531(Class8975 var1) {
      this.field19435 = var1;
   }

   public Class4587 method12199(Class7435 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class4572 var17 = new Class4572(var2, var3, var5, var7, var9, var11, var13, this.field19435);
      var17.method14515(0.15F);
      var17.method14514((float)var9, (float)var11, (float)var13);
      return var17;
   }
}