package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5697 extends Class5651<ParrotEntity, Class2814> {
   public static final ResourceLocation[] field25067 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/parrot/parrot_red_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_green.png"),
      new ResourceLocation("textures/entity/parrot/parrot_yellow_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_grey.png")
   };

   public Class5697(EntityRendererManager var1) {
      super(var1, new Class2814(), 0.3F);
   }

   public ResourceLocation method17843(ParrotEntity var1) {
      return field25067[var1.method4414()];
   }

   public float method17871(ParrotEntity var1, float var2) {
      float var5 = MathHelper.lerp(var2, var1.field5680, var1.field5677);
      float var6 = MathHelper.lerp(var2, var1.field5679, var1.field5678);
      return (MathHelper.sin(var5) + 1.0F) * var6;
   }
}
