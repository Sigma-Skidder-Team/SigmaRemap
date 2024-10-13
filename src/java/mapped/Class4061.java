package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4061 extends Class4060 {
   public Class4061() {
      super(EntityType.field41040, "illusioner", 0.5F, new String[]{"illusion_illager"});
   }

   @Override
   public Class2828 method12822() {
      Class2823 var3 = new Class2823(0.0F, 0.0F, 64, 64);
      var3.method11026().showModel = true;
      return var3;
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5679 var6 = new Class5679(var5);
      var6.field25086 = (Class2823<Class1033>) var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
