package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5745 extends Class5651<ChickenEntity, Class2874<ChickenEntity>> {
   private static final ResourceLocation field25169 = new ResourceLocation("textures/entity/chicken.png");

   public Class5745(EntityRendererManager var1) {
      super(var1, new Class2874<ChickenEntity>(), 0.3F);
   }

   public ResourceLocation method17843(ChickenEntity var1) {
      return field25169;
   }

   public float method17871(ChickenEntity var1, float var2) {
      float var5 = MathHelper.lerp(var2, var1.field5968, var1.field5965);
      float var6 = MathHelper.lerp(var2, var1.field5967, var1.field5966);
      return (MathHelper.sin(var5) + 1.0F) * var6;
   }
}
