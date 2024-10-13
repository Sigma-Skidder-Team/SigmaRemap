package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4123 extends Class4117 {
   public Class4123() {
      super(EntityType.field41039, "husk", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2794(0.0F, false);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5664 var6 = new Class5664(var5);
      var6.field25086 = (Class2794<ZombieEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
