package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5650 extends Class5651<FoxEntity, Class2864<FoxEntity>> {
   private static final ResourceLocation field25000 = new ResourceLocation("textures/entity/fox/fox.png");
   private static final ResourceLocation field25001 = new ResourceLocation("textures/entity/fox/fox_sleep.png");
   private static final ResourceLocation field25002 = new ResourceLocation("textures/entity/fox/snow_fox.png");
   private static final ResourceLocation field25003 = new ResourceLocation("textures/entity/fox/snow_fox_sleep.png");

   public Class5650(EntityRendererManager var1) {
      super(var1, new Class2864<FoxEntity>(), 0.4F);
      this.addLayer(new Class257(this));
   }

   public void method17842(FoxEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      if (var1.method5140() || var1.method5131()) {
         float var8 = -MathHelper.lerp(var5, var1.prevRotationPitch, var1.rotationPitch);
         var2.rotate(Vector3f.XP.rotationDegrees(var8));
      }
   }

   public ResourceLocation method17843(FoxEntity var1) {
      if (var1.method5125() != Class186.field691) {
         return !var1.isSleeping() ? field25002 : field25003;
      } else {
         return !var1.isSleeping() ? field25000 : field25001;
      }
   }
}
