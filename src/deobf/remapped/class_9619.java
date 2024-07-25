package remapped;

public class class_9619 extends class_2733 {
   public class_9619() {
      super(class_133.field_384, "book", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_8197();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_8197) {
         class_8197 var5 = (class_8197)var1;
         if (!var2.equals("cover_right")) {
            if (!var2.equals("cover_left")) {
               if (!var2.equals("pages_right")) {
                  if (!var2.equals("pages_left")) {
                     if (!var2.equals("flipping_page_right")) {
                        if (!var2.equals("flipping_page_left")) {
                           return !var2.equals("book_spine") ? null : (class_1549)class_7860.field_40133.method_39231(var5, 6);
                        } else {
                           return (class_1549)class_7860.field_40133.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40133.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40133.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40133.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40133.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40133.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_384);
      if (var6 instanceof class_4293) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_4293(var5);
         }

         if (class_7860.field_40072.method_7978()) {
            class_7860.method_35561(var6, class_7860.field_40072, var1);
            return (class_8599)var6;
         } else {
            class_3111.method_14317("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
         }
      } else {
         return null;
      }
   }
}
