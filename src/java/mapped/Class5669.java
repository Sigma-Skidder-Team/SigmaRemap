package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5669 extends Class5661<Class1040, Class2800<Class1040>> {
   private static final ResourceLocation field25033 = new ResourceLocation("textures/entity/zombie_villager/zombie_villager.png");

   public Class5669(EntityRendererManager var1, IReloadableResourceManager var2) {
      super(var1, new Class2800<>(0.0F, false), 0.5F);
      this.addLayer(new BipedArmorLayer<>(this, new Class2800<>(0.5F, true), new Class2800<>(1.0F, true)));
      this.addLayer(new Class218<>(this, var2, "zombie_villager"));
   }

   public ResourceLocation method17843(Class1040 var1) {
      return field25033;
   }

   public boolean method17860(Class1040 var1) {
      return var1.method4667();
   }
}
