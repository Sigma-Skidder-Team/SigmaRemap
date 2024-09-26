package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4135 extends Class4057 {
   public Class4135() {
      super(EntityType.field41050, "minecart", 0.5F);
   }

   public Class4135(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2818();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2818) {
         Class2818 var5 = (Class2818)var1;
         Class7219[] var6 = (Class7219[]) Reflector.field43071.method20235(var5);
         if (var6 != null) {
            if (var2.equals("bottom")) {
               return var6[0];
            }

            if (var2.equals("back")) {
               return var6[1];
            }

            if (var2.equals("front")) {
               return var6[2];
            }

            if (var2.equals("right")) {
               return var6[3];
            }

            if (var2.equals("left")) {
               return var6[4];
            }

            if (var2.equals("dirt")) {
               return var6[5];
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5732 var6 = new Class5732(var5);
      if (Reflector.field43144.method20238()) {
         Reflector.method35082(var6, Reflector.field43144, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: RenderMinecart.modelMinecart");
         return null;
      }
   }
}
