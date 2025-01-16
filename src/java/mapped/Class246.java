package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;

public class Class246 extends Class219<ShulkerEntity, Class2887<ShulkerEntity>> {
   private static String[] field901;

   public Class246(Class5714<ShulkerEntity, Class2887<ShulkerEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, ShulkerEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      var1.push();
      var1.translate(0.0, 1.0, 0.0);
      var1.scale(-1.0F, -1.0F, 1.0F);
      Quaternion var13 = var4.method4848().getOpposite().method532();
      var13.conjugate();
      var1.rotate(var13);
      var1.scale(-1.0F, -1.0F, 1.0F);
      var1.translate(0.0, -1.0, 0.0);
      Class112 var14 = var4.method4857();
      ResourceLocation var15 = var14 != null ? Class5683.field25049[var14.method309()] : Class5683.field25048;
      IVertexBuilder var16 = var2.method25597(RenderType.getEntitySolid(var15));
      this.method825().method11204().render(var1, var16, var3, LivingRenderer.method17883(var4, 0.0F));
      var1.pop();
   }
}
