package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4064 extends Class4060 {
   public Class4064() {
      super(EntityType.field41027, "evoker", 0.5F, new String[]{"evocation_illager"});
   }

   @Override
   public Class2828 method12822() {
      return new Class2823(0.0F, 0.0F, 64, 64);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5677 var6 = new Class5677(var5);
      var6.field25086 = (Class2827)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
