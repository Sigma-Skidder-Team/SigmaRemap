package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4125 extends Class4124 {
   public Class4125() {
      super(EntityType.field41035, "giant", 3.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2796();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5744 var6 = new Class5744(var5, 6.0F);
      var6.field25086 = (Class2796)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
