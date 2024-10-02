package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5659 extends Class5658 {
   public static final ResourceLocation field25023 = new ResourceLocation("textures/entity/guardian_elder.png");

   public Class5659(EntityRendererManager var1) {
      super(var1, 1.2F);
   }

   public void method17857(Class1105 var1, MatrixStack var2, float var3) {
      var2.scale(Class1106.field6078, Class1106.field6078, Class1106.field6078);
   }

   @Override
   public ResourceLocation method17843(Class1105 var1) {
      return field25023;
   }
}
