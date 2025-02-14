package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class224 extends Class223<WitherEntity, Class2881<WitherEntity>> {
   private static final ResourceLocation field868 = new ResourceLocation("textures/entity/wither/wither_armor.png");
   private final Class2881<WitherEntity> field869 = new Class2881<WitherEntity>(0.5F);

   public Class224(Class5714<WitherEntity, Class2881<WitherEntity>> var1) {
      super(var1);
   }

   @Override
   public float method831(float var1) {
      return MathHelper.cos(var1 * 0.02F) * 3.0F;
   }

   @Override
   public ResourceLocation method832() {
      return field868;
   }

   @Override
   public Class2827<WitherEntity> method833() {
      return this.field869;
   }
}
