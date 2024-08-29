package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4056 extends Class4051 {
   public Class4056() {
      super(EntityType.field41064, "pig", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2872();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5691 var6 = new Class5691(var5);
      var6.field25086 = (Class2872<Class1072>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
