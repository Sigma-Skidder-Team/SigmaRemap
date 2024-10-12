package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4130 extends Class4117 {
   public Class4130() {
      super(EntityType.field41103, "wither_skeleton", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2798();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5667 var6 = new Class5667(var5);
      var6.mainModel = (Class2798<Class1082>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
