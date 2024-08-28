package mapped;

import java.util.Objects;

public abstract class Class1154<E extends Class1154<E>> implements Class1152 {
   /** @deprecated */
   private Class1273<E> field6295;

   public abstract void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

   @Override
   public boolean method2485(double var1, double var3) {
      return Objects.equals(this.field6295.method6033(var1, var3), this);
   }

   // $VF: synthetic method
   public static Class1273 method5545(Class1154 var0, Class1273 var1) {
      return var0.field6295 = var1;
   }
}
