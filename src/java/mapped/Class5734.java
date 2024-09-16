package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class5734 extends Class5715<Class902> {
   private static final ResourceLocation field25146 = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
   private static final ResourceLocation field25147 = new ResourceLocation("textures/entity/wither/wither.png");
   private final Class2844 field25148 = new Class2844();

   public Class5734(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(Class902 var1, BlockPos var2) {
      return 15;
   }

   public void method17853(Class902 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.method35292(-1.0F, -1.0F, 1.0F);
      float var9 = MathHelper.method37828(var1.prevRotationYaw, var1.rotationYaw, var3);
      float var10 = MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch);
      Class5422 var11 = var5.method25597(this.field25148.method11028(this.method17843(var1)));
      this.field25148.method11174(0.0F, var9, var10);
      this.field25148.method11016(var4, var11, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.pop();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class902 var1) {
      return !var1.method3532() ? field25147 : field25146;
   }
}
