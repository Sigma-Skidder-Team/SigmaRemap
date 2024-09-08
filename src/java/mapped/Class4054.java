package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4054 extends Class4051 {
   public Class4054() {
      super(EntityType.SHEEP, "sheep", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2869();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5749 var6 = new Class5749(var5);
      var6.field25086 = (Class2869<Class1019>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
