package mapped;

public class Class4087 extends Class4057 {
   public Class4087() {
      super(TileEntityType.field21439, "banner", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2852();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2852) {
         Class2852 var5 = (Class2852)var1;
         if (!var2.equals("slate")) {
            if (!var2.equals("stand")) {
               return !var2.equals("top") ? null : var5.field17672;
            } else {
               return var5.field17671;
            }
         } else {
            return var5.field17670;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"slate", "stand", "top"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(TileEntityType.field21439);
      if (var6 instanceof Class5948) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5948(var5);
         }

         if (var1 instanceof Class2852) {
            Class2852 var7 = (Class2852)var1;
            return (Class9492)var7.method11180((Class5942)var6);
         } else {
            Class7944.method26811("Not a banner model: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
