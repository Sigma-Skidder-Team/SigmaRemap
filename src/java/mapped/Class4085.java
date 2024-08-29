package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4085 extends Class4057 {
   public Class4085() {
      super(EntityType.field41075, "shulker", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2887();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2887) {
         Class2887 var5 = (Class2887)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("lid")) {
               return !var2.equals("head") ? null : (Class7219)Class9299.field43096.method36565(var5, 2);
            } else {
               return (Class7219)Class9299.field43096.method36565(var5, 1);
            }
         } else {
            return (Class7219)Class9299.field43096.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"base", "lid", "head"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5683 var6 = new Class5683(var5);
      var6.field25086 = (Class2887<Class1057>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
