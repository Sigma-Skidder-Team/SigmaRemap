package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4103 extends Class4057 {
   public Class4103() {
      super(EntityType.field41045, "lead_knot", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2889();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2889) {
         Class2889 var5 = (Class2889)var1;
         return !var2.equals("knot") ? null : (Class7219) Reflector.field43065.method20235(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"knot"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5739 var6 = new Class5739(var5);
      if (Reflector.field43067.method20238()) {
         Reflector.method35082(var6, Reflector.field43067, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Config.method26811("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      }
   }
}
