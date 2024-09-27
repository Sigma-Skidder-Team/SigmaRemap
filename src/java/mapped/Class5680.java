package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5680 extends Class5676<Class1024> {
   private static final ResourceLocation field25045 = new ResourceLocation("textures/entity/illager/pillager.png");

   public Class5680(EntityRendererManager var1) {
      super(var1, new Class2823<Class1024>(0.0F, 0.0F, 64, 64), 0.5F);
      this.addLayer(new Class242<Class1024, Class2823<Class1024>>(this));
   }

   public ResourceLocation method17843(Class1024 var1) {
      return field25045;
   }
}
