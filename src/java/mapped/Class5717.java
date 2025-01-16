package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5717 extends EntityRenderer<LlamaSpitEntity> {
   private static final ResourceLocation field25104 = new ResourceLocation("textures/entity/llama/spit.png");
   private final Class2884<LlamaSpitEntity> field25105 = new Class2884<LlamaSpitEntity>();

   public Class5717(EntityRendererManager var1) {
      super(var1);
   }

   public void render(LlamaSpitEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.translate(0.0, 0.15F, 0.0);
      var4.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationYaw, var1.rotationYaw) - 90.0F));
      var4.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch)));
      this.field25105.setRotationAngles(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      IVertexBuilder var9 = var5.method25597(this.field25105.method11028(field25104));
      this.field25105.render(var4, var9, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.pop();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(LlamaSpitEntity var1) {
      return field25104;
   }
}
