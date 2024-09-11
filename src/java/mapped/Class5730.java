package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class Class5730 extends Class5715<Class905> {
   private static final ResourceLocation field25138 = new ResourceLocation("textures/entity/shulker/spark.png");
   private static final RenderType field25139 = RenderType.method14318(field25138);
   private final Class2821<Class905> field25140 = new Class2821<Class905>();

   public Class5730(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(Class905 var1, BlockPos var2) {
      return 15;
   }

   public void method17853(Class905 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      float var9 = MathHelper.method37828(var1.prevRotationYaw, var1.rotationYaw, var3);
      float var10 = MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch);
      float var11 = (float)var1.ticksExisted + var3;
      var4.translate(0.0, 0.15F, 0.0);
      var4.rotate(Vector3f.YP.rotationDegrees(MathHelper.sin(var11 * 0.1F) * 180.0F));
      var4.rotate(Vector3f.field32898.rotationDegrees(MathHelper.cos(var11 * 0.1F) * 180.0F));
      var4.rotate(Vector3f.field32902.rotationDegrees(MathHelper.sin(var11 * 0.15F) * 360.0F));
      var4.method35292(-0.5F, -0.5F, 0.5F);
      this.field25140.method10998(var1, 0.0F, 0.0F, 0.0F, var9, var10);
      Class5422 var12 = var5.method25597(this.field25140.method11028(field25138));
      this.field25140.method11016(var4, var12, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35292(1.5F, 1.5F, 1.5F);
      Class5422 var13 = var5.method25597(field25139);
      this.field25140.method11016(var4, var13, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 0.15F);
      var4.pop();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class905 var1) {
      return field25138;
   }
}
