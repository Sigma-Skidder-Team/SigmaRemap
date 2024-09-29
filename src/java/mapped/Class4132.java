package mapped;

import net.optifine.Config;

public class Class4132 extends Class4057 {
   public Class4132() {
      super(TileEntityType.field21443, "shulker_box", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2887();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2887) {
         Class2887 var5 = (Class2887)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("lid")) {
               return !var2.equals("head") ? null : (ModelRenderer) Reflector.field43096.method36565(var5, 2);
            } else {
               return (ModelRenderer) Reflector.field43096.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43096.method36565(var5, 0);
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
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(TileEntityType.field21443);
      if (var6 instanceof Class5954) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5954((Class2887<?>)var1, var5);
         }

         if (Reflector.field43165.exists()) {
            Reflector.method35082(var6, Reflector.field43165, var1);
            return (Class9492)var6;
         } else {
            Config.method26811("Field not found: TileEntityShulkerBoxRenderer.model");
            return null;
         }
      } else {
         return null;
      }
   }
}
