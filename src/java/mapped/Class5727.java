package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3f;

public abstract class Class5727<T extends AbstractArrowEntity> extends EntityRenderer<T> {
   public Class5727(EntityRendererManager var1) {
      super(var1);
   }

   public void render(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationYaw, var1.rotationYaw) - 90.0F));
      var4.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch)));
      boolean var9 = false;
      float var10 = 0.0F;
      float var11 = 0.5F;
      float var12 = 0.0F;
      float var13 = 0.15625F;
      float var14 = 0.0F;
      float var15 = 0.15625F;
      float var16 = 0.15625F;
      float var17 = 0.3125F;
      float var18 = 0.05625F;
      float var19 = (float)var1.field5103 - var3;
      if (var19 > 0.0F) {
         float var20 = -MathHelper.sin(var19 * 3.0F) * var19;
         var4.rotate(Vector3f.ZP.rotationDegrees(var20));
      }

      var4.rotate(Vector3f.XP.rotationDegrees(45.0F));
      var4.scale(0.05625F, 0.05625F, 0.05625F);
      var4.translate(-4.0, 0.0, 0.0);
      IVertexBuilder var25 = var5.method25597(RenderType.getEntityCutout(this.method17843((T)var1)));
      Class8892 var21 = var4.getLast();
      Matrix4f var22 = var21.getMatrix();
      Matrix3f var23 = var21.method32362();
      this.method17913(var22, var23, var25, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, var6);

      for (int var24 = 0; var24 < 4; var24++) {
         var4.rotate(Vector3f.XP.rotationDegrees(90.0F));
         this.method17913(var22, var23, var25, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, var6);
         this.method17913(var22, var23, var25, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, var6);
         this.method17913(var22, var23, var25, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, var6);
         this.method17913(var22, var23, var25, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, var6);
      }

      var4.pop();
      super.render((T)var1, var2, var3, var4, var5, var6);
   }

   public void method17913(
           Matrix4f var1, Matrix3f var2, IVertexBuilder var3, int var4, int var5, int var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.pos(var1, (float)var4, (float)var5, (float)var6)
         .color(255, 255, 255, 255)
         .tex(var7, var8)
         .method17035(OverlayTexture.NO_OVERLAY)
         .method17034(var12)
         .method17041(var2, (float)var9, (float)var11, (float)var10)
         .endVertex();
   }
}
