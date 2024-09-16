package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5717 extends Class5715<Class883> {
   private static final ResourceLocation field25104 = new ResourceLocation("textures/entity/llama/spit.png");
   private final Class2884<Class883> field25105 = new Class2884<Class883>();

   public Class5717(EntityRendererManager var1) {
      super(var1);
   }

   public void method17853(Class883 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.translate(0.0, 0.15F, 0.0);
      var4.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationYaw, var1.rotationYaw) - 90.0F));
      var4.rotate(Vector3f.field32902.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch)));
      this.field25105.method10998(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      Class5422 var9 = var5.method25597(this.field25105.method11028(field25104));
      this.field25105.method11016(var4, var9, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.pop();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class883 var1) {
      return field25104;
   }
}
