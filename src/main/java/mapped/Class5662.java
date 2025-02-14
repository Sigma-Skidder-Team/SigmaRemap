package mapped;

import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

public abstract class Class5662<T extends ZombieEntity, M extends Class2794<T>> extends Class5661<T, M> {
   private static final ResourceLocation field25026 = new ResourceLocation("textures/entity/zombie/zombie.png");

   public Class5662(EntityRendererManager var1, M var2, M var3, M var4) {
      super(var1, var2, 0.5F);
      this.addLayer(new BipedArmorLayer<>(this, var3, var4));
   }

   public ResourceLocation method17843(ZombieEntity var1) {
      return field25026;
   }

   public boolean method17860(T var1) {
      return var1.method4654();
   }
}
