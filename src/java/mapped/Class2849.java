package mapped;

import net.minecraft.client.Minecraft;

public class Class2849 extends Class2828 {
   public Class7219 field17652;
   public Class7219 field17653;
   public Class7219 field17654;

   public Class2849() {
      super(RenderType::getEntityCutoutNoCull);
      Class5723 var3 = new Class5723(Minecraft.getInstance().getRenderManager());
      this.field17652 = (Class7219)Class9299.field43041.method36565(var3, 0);
      this.field17653 = (Class7219)Class9299.field43041.method36565(var3, 1);
      this.field17654 = (Class7219)Class9299.field43041.method36565(var3, 2);
   }

   public Class5723 method11175(Class5723 var1) {
      if (Class9299.field43041.method36567()) {
         Class9299.field43041.method36566(var1, 0, this.field17652);
         Class9299.field43041.method36566(var1, 1, this.field17653);
         Class9299.field43041.method36566(var1, 2, this.field17654);
         return var1;
      } else {
         Class7944.method26811("Field not found: RenderEnderCrystal.modelEnderCrystal");
         return null;
      }
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
