package mapped;

public class Class4108 extends Class4057 {
   public Class4108() {
      super(TileEntityType.field21423, "trapped_chest", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2830();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2830) {
         Class2830 var5 = (Class2830)var1;
         if (!var2.equals("lid")) {
            if (!var2.equals("base")) {
               return !var2.equals("knob") ? null : var5.field17609;
            } else {
               return var5.field17608;
            }
         } else {
            return var5.field17607;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"lid", "base", "knob"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(TileEntityType.field21423);
      if (var6 instanceof Class5953) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5953(var5);
         }

         if (var1 instanceof Class2830) {
            Class2830 var7 = (Class2830)var1;
            return (Class9492)var7.method11029((Class5942)var6);
         } else {
            Class7944.method26811("Not a chest model: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
