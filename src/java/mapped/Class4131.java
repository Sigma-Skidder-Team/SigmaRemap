package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.EndermanEntity;

public class Class4131 extends Class4117 {
   public Class4131() {
      super(EntityType.ENDERMAN, "enderman", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2799(0.0F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5674 var6 = new Class5674(var5);
      var6.entityModel = (Class2799<EndermanEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
