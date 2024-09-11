package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5708 extends Class5651<Class1027, Class2891<Class1027>> {
   private static final ResourceLocation field25081 = new ResourceLocation("textures/entity/witch.png");

   public Class5708(EntityRendererManager var1) {
      super(var1, new Class2891<Class1027>(0.0F), 0.5F);
      this.method17880(new Class240<Class1027>(this));
   }

   public void method17853(Class1027 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      this.field25086.method11207(!var1.getHeldItemMainhand().isEmpty());
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class1027 var1) {
      return field25081;
   }

   public void method17857(Class1027 var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      var2.method35292(0.9375F, 0.9375F, 0.9375F);
   }
}
