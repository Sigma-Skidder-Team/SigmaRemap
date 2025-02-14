package mapped;

import net.minecraft.util.ResourceLocation;

public class Class225 extends Class223<CreeperEntity, Class2890<CreeperEntity>> {
   private static final ResourceLocation field870 = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
   private final Class2890<CreeperEntity> field871 = new Class2890<CreeperEntity>(2.0F);

   public Class225(Class5714<CreeperEntity, Class2890<CreeperEntity>> var1) {
      super(var1);
   }

   @Override
   public float method831(float var1) {
      return var1 * 0.01F;
   }

   @Override
   public ResourceLocation method832() {
      return field870;
   }

   @Override
   public Class2827<CreeperEntity> method833() {
      return this.field871;
   }
}
