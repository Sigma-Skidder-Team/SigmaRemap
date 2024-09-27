package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4052 extends Class4051 {
   public Class4052() {
      super(EntityType.field41061, "panda", 0.9F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2867(9, 0.0F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5696 var6 = new Class5696(var5);
      var6.field25086 = (Class2867<Class1097>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
