package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5677<T extends Class1031> extends Class5676<T> {
   private static final ResourceLocation field25042 = new ResourceLocation("textures/entity/illager/evoker.png");

   public Class5677(EntityRendererManager var1) {
      super(var1, new Class2823<T>(0.0F, 0.0F, 64, 64), 0.5F);
      this.method17880(new Class245(this, this));
   }

   public ResourceLocation method17843(T var1) {
      return field25042;
   }
}
