package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4119 extends Class4117 {
   public Class4119() {
      super(EntityType.ZOMBIE_VILLAGER, "zombie_villager", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2800(0.0F, false);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      IReloadableResourceManager var5 = (IReloadableResourceManager) Minecraft.getInstance().getResourceManager();
      EntityRendererManager var6 = Minecraft.getInstance().getRenderManager();
      Class5669 var7 = new Class5669(var6, var5);
      var7.entityModel = (Class2800<ZombieVillagerEntity>)var1;
      var7.shadowSize = var2;
      return (Class9492)var7;
   }
}
