package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5707 extends Class5651<Class1044, Class2802<Class1044>> {
   private static final ResourceLocation field25080 = new ResourceLocation("textures/entity/wandering_trader.png");

   public Class5707(EntityRendererManager var1) {
      super(var1, new Class2802<Class1044>(0.0F), 0.5F);
      this.method17880(new Class235<Class1044, Class2802<Class1044>>(this));
      this.method17880(new Class239<Class1044, Class2802<Class1044>>(this));
   }

   public ResourceLocation method17843(Class1044 var1) {
      return field25080;
   }

   public void method17857(Class1044 var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      var2.method35292(0.9375F, 0.9375F, 0.9375F);
   }
}
