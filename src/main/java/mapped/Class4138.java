package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4138 extends Class4057 {
   public Class4138() {
      super(EntityType.EVOKER_FANGS, "evoker_fangs", 0.0F, new String[]{"evocation_fangs"});
   }

   @Override
   public Class2828 method12822() {
      return new Class2804();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2804) {
         Class2804 var5 = (Class2804)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("upper_jaw")) {
               return !var2.equals("lower_jaw") ? null : (ModelRenderer) Reflector.method35075(var5, Reflector.field43045, 2);
            } else {
               return (ModelRenderer) Reflector.method35075(var5, Reflector.field43045, 1);
            }
         } else {
            return (ModelRenderer) Reflector.method35075(var5, Reflector.field43045, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"base", "upper_jaw", "lower_jaw"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5722 var6 = new Class5722(var5);
      if (Reflector.field43138.exists()) {
         Reflector.method35082(var6, Reflector.field43138, var1);
         var6.shadowSize = var2;
         return (Class9492)var6;
      } else {
         Config.method26811("Field not found: RenderEvokerFangs.model");
         return null;
      }
   }
}
