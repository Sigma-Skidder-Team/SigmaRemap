package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class Class5681 extends Class5651<PhantomEntity, Class2806<PhantomEntity>> {
   private static final ResourceLocation field25046 = new ResourceLocation("textures/entity/phantom.png");

   public Class5681(EntityRendererManager var1) {
      super(var1, new Class2806<PhantomEntity>(), 0.75F);
      this.addLayer(new Class229<PhantomEntity>(this));
   }

   public ResourceLocation method17843(PhantomEntity var1) {
      return field25046;
   }

   public void method17857(PhantomEntity var1, MatrixStack var2, float var3) {
      int var6 = var1.method5338();
      float var7 = 1.0F + 0.15F * (float)var6;
      var2.scale(var7, var7, var7);
      var2.translate(0.0, 1.3125, 0.1875);
   }

   public void method17842(PhantomEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      var2.rotate(Vector3f.XP.rotationDegrees(var1.rotationPitch));
   }
}
