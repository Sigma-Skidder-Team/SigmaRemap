package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4077 extends Class4076 {
   public Class4077() {
      super(EntityType.field41013, "cave_spider", 0.7F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5703 var6 = new Class5703(var5);
      var6.field25086 = (Class2813<Class1102>) var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
