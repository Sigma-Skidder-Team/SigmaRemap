package remapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.stream.Stream;

public class class_6047 extends class_4569 {
   private final class_8938[] field_30924;

   public class_6047(class_8938 var1, class_8938[] var2) {
      super(class_3279.method_14973(), var1);
      this.field_30924 = var2;
   }

   public static class_6047 method_27614(class_865... var0) {
      return new class_6047(class_8938.field_45798, Stream.<class_865>of(var0).<class_8938>map(class_8938::method_41064).<class_8938>toArray(class_8938[]::new));
   }

   public boolean method_27613(Collection<? extends class_2792> var1) {
      for (class_8938 var7 : this.field_30924) {
         boolean var8 = false;

         for (class_2792 var10 : var1) {
            if (var7.method_41071(var10)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            return false;
         }
      }

      return true;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("victims", class_8938.method_41072(this.field_30924, var1));
      return var4;
   }
}
