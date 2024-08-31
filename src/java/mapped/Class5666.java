package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5666 extends Class5661<Class1082, Class2798<Class1082>> {
   private static final ResourceLocation field25030 = new ResourceLocation("textures/entity/skeleton/skeleton.png");

   public Class5666(EntityRendererManager var1) {
      super(var1, new Class2798<>(), 0.5F);
      this.method17880(new Class255<>(this, new Class2798<>(0.5F, true), new Class2798<>(1.0F, true)));
   }

   public ResourceLocation method17843(Class1082 var1) {
      return field25030;
   }
}
