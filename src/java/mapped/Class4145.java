package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4145 extends Class4051 {
   public Class4145() {
      super(EntityType.field41068, "polar_bear", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2871();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5700 var6 = new Class5700(var5);
      var6.mainModel = (Class2871<Class1096>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
