package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5689 extends Class5651<Class1088, Class2873<Class1088>> {
   private static final ResourceLocation field25056 = new ResourceLocation("textures/entity/turtle/big_sea_turtle.png");

   public Class5689(EntityRendererManager var1) {
      super(var1, new Class2873<Class1088>(0.0F), 0.7F);
   }

   public void render(Class1088 entity, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (entity.isChild()) {
         this.shadowSize *= 0.5F;
      }

      super.render(entity, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class1088 var1) {
      return field25056;
   }
}
