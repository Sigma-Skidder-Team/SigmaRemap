package mapped;

import net.optifine.Config;

public class Class4078 extends Class4057 {
   public Class4078() {
      super(TileEntityType.field21432, "book", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2850();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2850) {
         Class2850 var5 = (Class2850)var1;
         if (!var2.equals("cover_right")) {
            if (!var2.equals("cover_left")) {
               if (!var2.equals("pages_right")) {
                  if (!var2.equals("pages_left")) {
                     if (!var2.equals("flipping_page_right")) {
                        if (!var2.equals("flipping_page_left")) {
                           return !var2.equals("book_spine") ? null : (Class7219) Reflector.field43031.method36565(var5, 6);
                        } else {
                           return (Class7219) Reflector.field43031.method36565(var5, 5);
                        }
                     } else {
                        return (Class7219) Reflector.field43031.method36565(var5, 4);
                     }
                  } else {
                     return (Class7219) Reflector.field43031.method36565(var5, 3);
                  }
               } else {
                  return (Class7219) Reflector.field43031.method36565(var5, 2);
               }
            } else {
               return (Class7219) Reflector.field43031.method36565(var5, 1);
            }
         } else {
            return (Class7219) Reflector.field43031.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(TileEntityType.field21432);
      if (var6 instanceof Class5951) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5951(var5);
         }

         if (Reflector.field43163.method20238()) {
            Reflector.method35082(var6, Reflector.field43163, var1);
            return (Class9492)var6;
         } else {
            Config.method26811("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
         }
      } else {
         return null;
      }
   }
}
