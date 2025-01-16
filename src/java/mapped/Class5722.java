package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class Class5722 extends EntityRenderer<EvokerFangsEntity> {
   private static final ResourceLocation field25120 = new ResourceLocation("textures/entity/illager/evoker_fangs.png");
   private final Class2804<EvokerFangsEntity> field25121 = new Class2804<EvokerFangsEntity>();

   public Class5722(EntityRendererManager var1) {
      super(var1);
   }

   public void render(EvokerFangsEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      float var9 = var1.method3584(var3);
      if (var9 != 0.0F) {
         float var10 = 2.0F;
         if (var9 > 0.9F) {
            var10 = (float)((double)var10 * ((1.0 - (double)var9) / 0.1F));
         }

         var4.push();
         var4.rotate(Vector3f.YP.rotationDegrees(90.0F - var1.rotationYaw));
         var4.scale(-var10, -var10, var10);
         float var11 = 0.03125F;
         var4.translate(0.0, -0.626F, 0.0);
         var4.scale(0.5F, 0.5F, 0.5F);
         this.field25121.setRotationAngles(var1, var9, 0.0F, 0.0F, var1.rotationYaw, var1.rotationPitch);
         IVertexBuilder var12 = var5.method25597(this.field25121.method11028(field25120));
         this.field25121.render(var4, var12, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
         var4.pop();
         super.render(var1, var2, var3, var4, var5, var6);
      }
   }

   public ResourceLocation method17843(EvokerFangsEntity var1) {
      return field25120;
   }
}
