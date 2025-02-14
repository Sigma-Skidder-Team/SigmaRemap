package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5706 extends Class5651<HoglinEntity, Class2865<HoglinEntity>> {
   private static final ResourceLocation field25079 = new ResourceLocation("textures/entity/hoglin/hoglin.png");

   public Class5706(EntityRendererManager var1) {
      super(var1, new Class2865<HoglinEntity>(), 0.7F);
   }

   public ResourceLocation method17843(HoglinEntity var1) {
      return field25079;
   }

   public boolean method17860(HoglinEntity var1) {
      return var1.method5087();
   }
}
