package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4072 extends Class4071 {
   public Class4072() {
      super(EntityType.field41079, "skeleton_horse", 0.75F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5686 var6 = new Class5686(var5);
      var6.entityModel = (Class2856<AbstractHorseEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
