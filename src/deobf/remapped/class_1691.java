package remapped;

import com.google.gson.JsonObject;
import java.util.Collection;

public class class_1691 extends class_4569 {
   private final class_5319 field_8752;
   private final class_8938 field_8753;
   private final class_5319 field_8750;

   public class_1691(class_8938 var1, class_5319 var2, class_8938 var3, class_5319 var4) {
      super(class_1441.method_6616(), var1);
      this.field_8752 = var2;
      this.field_8753 = var3;
      this.field_8750 = var4;
   }

   public static class_1691 method_7615(class_5319 var0, class_865 var1, class_5319 var2) {
      return new class_1691(class_8938.field_45798, var0, class_8938.method_41064(var1), var2);
   }

   public boolean method_7616(class_6098 var1, class_2792 var2, Collection<class_6098> var3) {
      if (this.field_8752.method_24266(var1)) {
         if (!this.field_8753.method_41071(var2)) {
            return false;
         } else {
            if (this.field_8750 != class_5319.field_27132) {
               boolean var6 = false;
               class_8145 var7 = var2.<class_8145>method_12698(class_8712.field_44676);
               if (var7 instanceof class_91) {
                  class_91 var8 = (class_91)var7;
                  if (this.field_8750.method_24266(var8.method_264())) {
                     var6 = true;
                  }
               }

               for (class_6098 var9 : var3) {
                  if (this.field_8750.method_24266(var9)) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("rod", this.field_8752.method_24265());
      var4.add("entity", this.field_8753.method_41067(var1));
      var4.add("item", this.field_8750.method_24265());
      return var4;
   }
}
