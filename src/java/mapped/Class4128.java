package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4128 extends Class4127 {
   public Class4128() {
      super(EntityType.field41110, "zombified_piglin", 0.5F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5671 var6 = new Class5671(var5, true);
      var6.entityModel = (Class2895<MobEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
