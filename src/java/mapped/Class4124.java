package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4124 extends Class4117 {
   public Class4124() {
      super(EntityType.field41107, "zombie", 0.5F);
   }

   public Class4124(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2794(0.0F, false);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5663 var6 = new Class5663(var5);
      var6.mainModel = (Class2794<ZombieEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
