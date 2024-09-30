package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;

public class Class5725 extends EntityRenderer<BoatEntity> {
   private static final ResourceLocation[] field25131 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/boat/oak.png"),
      new ResourceLocation("textures/entity/boat/spruce.png"),
      new ResourceLocation("textures/entity/boat/birch.png"),
      new ResourceLocation("textures/entity/boat/jungle.png"),
      new ResourceLocation("textures/entity/boat/acacia.png"),
      new ResourceLocation("textures/entity/boat/dark_oak.png")
   };
   public final Class2883 field25132 = new Class2883();

   public Class5725(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.8F;
   }

   public void render(BoatEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.translate(0.0, 0.375, 0.0);
      var4.rotate(Vector3f.YP.rotationDegrees(180.0F - var2));
      float var9 = (float)var1.method4165() - var3;
      float var10 = var1.method4163() - var3;
      if (var10 < 0.0F) {
         var10 = 0.0F;
      }

      if (var9 > 0.0F) {
         var4.rotate(Vector3f.XP.rotationDegrees(MathHelper.sin(var9) * var9 * var10 / 10.0F * (float)var1.method4170()));
      }

      float var11 = var1.method4168(var3);
      if (!MathHelper.method37786(var11, 0.0F)) {
         var4.rotate(new Quaternion(new Vector3f(1.0F, 0.0F, 1.0F), var1.method4168(var3), true));
      }

      var4.method35292(-1.0F, -1.0F, 1.0F);
      var4.rotate(Vector3f.YP.rotationDegrees(90.0F));
      this.field25132.setRotationAngles(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      IVertexBuilder var12 = var5.method25597(this.field25132.method11028(this.method17843(var1)));
      this.field25132.method11016(var4, var12, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!var1.canSwim()) {
         IVertexBuilder var13 = var5.method25597(RenderType.method14328());
         this.field25132.method11199().render(var4, var13, var6, OverlayTexture.NO_OVERLAY);
      }

      var4.pop();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(BoatEntity var1) {
      return field25131[var1.method4172().ordinal()];
   }
}
