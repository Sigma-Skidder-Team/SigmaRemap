package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Random;

public class Class5674 extends Class5651<Class1010, Class2799<Class1010>> {
   private static final ResourceLocation field25039 = new ResourceLocation("textures/entity/enderman/enderman.png");
   private final Random field25040 = new Random();

   public Class5674(EntityRendererManager var1) {
      super(var1, new Class2799<Class1010>(0.0F), 0.5F);
      this.addLayer(new Class228<Class1010>(this));
      this.addLayer(new Class253(this));
   }

   public void render(Class1010 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      BlockState var9 = var1.method4357();
      Class2799 var10 = this.getEntityModel();
      var10.field17443 = var9 != null;
      var10.field17444 = var1.method4358();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public Vector3d getRenderOffset(Class1010 var1, float var2) {
      if (!var1.method4358()) {
         return super.getRenderOffset(var1, var2);
      } else {
         double var5 = 0.02;
         return new Vector3d(this.field25040.nextGaussian() * 0.02, 0.0, this.field25040.nextGaussian() * 0.02);
      }
   }

   public ResourceLocation method17843(Class1010 var1) {
      return field25039;
   }
}
