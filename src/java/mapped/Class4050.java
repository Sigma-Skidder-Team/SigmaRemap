package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4050 extends Class4051 {
   public Class4050() {
      super(EntityType.TURTLE, "turtle", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2873(0.0F);
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2866) {
         Class2873 var5 = (Class2873)var1;
         return !var2.equals("body2") ? super.method12823(var1, var2) : (ModelRenderer) Reflector.field43120.method20235(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      String[] var3 = super.method12824();
      return (String[]) Config.method26948(var3, "body2");
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5689 var6 = new Class5689(var5);
      var6.entityModel = (Class2873<Class1088>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
