package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class Class5943 extends Class5942<Class960> {
   private static String[] field25931;

   public Class5943(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class960 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      var3.push();
      var3.translate(0.5, 0.0, 0.5);
      Class7574 var9 = var1.method3911();
      Entity var10 = var9.method24796();
      if (var10 != null) {
         float var11 = 0.53125F;
         float var12 = Math.max(var10.getWidth(), var10.getHeight());
         if ((double)var12 > 1.0) {
            var11 /= var12;
         }

         var3.translate(0.0, 0.4F, 0.0);
         var3.rotate(Vector3f.YP.rotationDegrees((float) MathHelper.lerp((double)var2, var9.method24799(), var9.method24798()) * 10.0F));
         var3.translate(0.0, -0.2F, 0.0);
         var3.rotate(Vector3f.field32898.rotationDegrees(-30.0F));
         var3.method35292(var11, var11, var11);
         Minecraft.getInstance().getRenderManager().method32219(var10, 0.0, 0.0, 0.0, 0.0F, var2, var3, var4, var5);
      }

      var3.pop();
   }
}
