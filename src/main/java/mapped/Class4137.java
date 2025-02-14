package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4137 extends Class4135 {
   public Class4137() {
      super(EntityType.TNT_MINECART, "tnt_minecart", 0.5F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5733 var6 = new Class5733(var5);
      if (Reflector.field43144.exists()) {
         Reflector.method35082(var6, Reflector.field43144, var1);
         var6.shadowSize = var2;
         return (Class9492)var6;
      } else {
         Config.method26811("Field not found: RenderMinecart.modelMinecart");
         return null;
      }
   }
}
