package mapped;

import net.minecraft.client.Minecraft;

public class Class239<T extends Class880, M extends Class2827<T>> extends Class219<T, M> {
   private static String[] field892;

   public Class239(Class5714<T, M> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      var1.push();
      var1.translate(0.0, 0.4F, -0.4F);
      var1.rotate(Vector3f.field32898.rotationDegrees(180.0F));
      ItemStack var13 = var4.method2943(Class2106.field13731);
      Minecraft.getInstance().getFirstPersonRenderer().method37580(var4, var13, Class2327.field15931, false, var1, var2, var3);
      var1.pop();
   }
}
