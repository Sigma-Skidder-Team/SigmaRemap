package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5668 extends Class5666 {
   private static final ResourceLocation field25032 = new ResourceLocation("textures/entity/skeleton/stray.png");

   public Class5668(EntityRendererManager var1) {
      super(var1);
      this.addLayer(new Class237<Class1082, Class2798<Class1082>>(this));
   }

   @Override
   public ResourceLocation method17843(Class1082 var1) {
      return field25032;
   }
}
