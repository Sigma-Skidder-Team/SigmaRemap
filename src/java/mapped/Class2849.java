package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.optifine.Config;

public class Class2849 extends Class2828 {
   public ModelRenderer field17652;
   public ModelRenderer field17653;
   public ModelRenderer field17654;

   public Class2849() {
      super(RenderType::getEntityCutoutNoCull);
      Class5723 var3 = new Class5723(Minecraft.getInstance().getRenderManager());
      this.field17652 = (ModelRenderer) Reflector.field43041.method36565(var3, 0);
      this.field17653 = (ModelRenderer) Reflector.field43041.method36565(var3, 1);
      this.field17654 = (ModelRenderer) Reflector.field43041.method36565(var3, 2);
   }

   public Class5723 method11175(Class5723 var1) {
      if (Reflector.field43041.method36567()) {
         Reflector.field43041.method36566(var1, 0, this.field17652);
         Reflector.field43041.method36566(var1, 1, this.field17653);
         Reflector.field43041.method36566(var1, 2, this.field17654);
         return var1;
      } else {
         Config.method26811("Field not found: RenderEnderCrystal.modelEnderCrystal");
         return null;
      }
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
