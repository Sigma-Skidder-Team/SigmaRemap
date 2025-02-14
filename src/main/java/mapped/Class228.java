package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class Class228<T extends LivingEntity> extends Class226<T, Class2799<T>> {
   private static final RenderType field873 = RenderType.method14325(new ResourceLocation("textures/entity/enderman/enderman_eyes.png"));

   public Class228(Class5714<T, Class2799<T>> var1) {
      super(var1);
   }

   @Override
   public RenderType method834() {
      return field873;
   }
}
