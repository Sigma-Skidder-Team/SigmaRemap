package mapped;

import net.minecraft.entity.Entity;

public class Class227<T extends Entity, M extends Class2813<T>> extends Class226<T, M> {
   private static final RenderType field872 = RenderType.method14325(new ResourceLocation("textures/entity/spider_eyes.png"));

   public Class227(Class5714<T, M> var1) {
      super(var1);
   }

   @Override
   public RenderType method834() {
      return field872;
   }
}
