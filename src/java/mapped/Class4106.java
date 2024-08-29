package mapped;

public class Class4106 extends Class4057 {
   public Class4106() {
      super(Class4387.field21423, "trapped_chest_large", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2851();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2851) {
         Class2851 var5 = (Class2851)var1;
         if (!var2.equals("lid_left")) {
            if (!var2.equals("base_left")) {
               if (!var2.equals("knob_left")) {
                  if (!var2.equals("lid_right")) {
                     if (!var2.equals("base_right")) {
                        return !var2.equals("knob_right") ? null : var5.field17669;
                     } else {
                        return var5.field17668;
                     }
                  } else {
                     return var5.field17667;
                  }
               } else {
                  return var5.field17666;
               }
            } else {
               return var5.field17665;
            }
         } else {
            return var5.field17664;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"lid_left", "base_left", "knob_left", "lid_right", "base_right", "knob_right"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(Class4387.field21423);
      if (var6 instanceof Class5953) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5953(var5);
         }

         if (var1 instanceof Class2851) {
            Class2851 var7 = (Class2851)var1;
            return (Class9492)var7.method11179((Class5942)var6);
         } else {
            Class7944.method26811("Not a large chest model: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
