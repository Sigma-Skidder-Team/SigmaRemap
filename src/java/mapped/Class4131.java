package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4131 extends Class4117 {
   public Class4131() {
      super(EntityType.field41025, "enderman", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2799(0.0F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5674 var6 = new Class5674(var5);
      var6.field25086 = (Class2799<Class1010>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
