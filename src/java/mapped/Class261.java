package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class Class261<T extends LivingEntity> extends LayerRenderer<T, PlayerModel<T>> {
   public static final ResourceLocation field921 = new ResourceLocation("textures/entity/trident_riptide.png");
   private final ModelRenderer field922 = new ModelRenderer(64, 64, 0, 0);

   public Class261(Class5714<T, PlayerModel<T>> var1) {
      super(var1);
      this.field922.method22673(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F);
   }

   public void render(MatrixStack var1, IRenderTypeBuffer var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.isSpinAttacking()) {
         IVertexBuilder var13 = var2.getBuffer(RenderType.getEntityCutoutNoCull(field921));

         for (int var14 = 0; var14 < 3; var14++) {
            var1.push();
            float var15 = var8 * (float)(-(45 + var14 * 5));
            var1.rotate(Vector3f.YP.rotationDegrees(var15));
            float var16 = 0.75F * (float)var14;
            var1.scale(var16, var16, var16);
            var1.translate(0.0, (double)(-0.2F + 0.6F * (float)var14), 0.0);
            this.field922.render(var1, var13, var3, OverlayTexture.NO_OVERLAY);
            var1.pop();
         }
      }
   }
}
