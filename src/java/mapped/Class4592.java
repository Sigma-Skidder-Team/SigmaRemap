package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;

public class Class4592 extends Class4587 {
   private static String[] field22077;
   private final Class2828 field22078 = new Class2820();
   private final RenderType field22079 = RenderType.method14318(Class5659.field25023);

   public Class4592(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field22057 = 0.0F;
      this.field22056 = 30;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29738;
   }

   @Override
   public void method14510(Class5422 var1, ActiveRenderInfo var2, float var3) {
      float var6 = ((float)this.field22055 + var3) / (float)this.field22056;
      float var7 = 0.05F + 0.5F * MathHelper.sin(var6 * (float) Math.PI);
      MatrixStack var8 = new MatrixStack();
      var8.rotate(var2.method37508());
      var8.rotate(Vector3f.field32898.rotationDegrees(150.0F * var6 - 60.0F));
      var8.method35292(-1.0F, -1.0F, 1.0F);
      var8.translate(0.0, -1.101F, 1.5);
      Class7735 var9 = Minecraft.getInstance().getRenderTypeBuffers().method26536();
      Class5422 var10 = var9.method25597(this.field22079);
      this.field22078.method11016(var8, var10, 15728880, Class213.field798, 1.0F, 1.0F, 1.0F, var7);
      var9.method25602();
   }
}
