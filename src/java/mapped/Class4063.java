package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4063 extends Class4060 {
   public Class4063() {
      super(EntityType.VINDICATOR, "vindicator", 0.5F, new String[]{"vindication_illager"});
   }

   @Override
   public Class2828 method12822() {
      return new Class2823(0.0F, 0.0F, 64, 64);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5678 var6 = new Class5678(var5);
      var6.entityModel = (Class2823<VindicatorEntity>) var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
