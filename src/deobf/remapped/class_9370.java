package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class_9370 extends class_4569 {
   private final class_8938[] field_47912;
   private final class_7781 field_47911;

   public class_9370(class_8938 var1, class_8938[] var2, class_7781 var3) {
      super(class_4577.method_21224(), var1);
      this.field_47912 = var2;
      this.field_47911 = var3;
   }

   public static class_9370 method_43337(class_2184... var0) {
      class_8938[] var3 = new class_8938[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         class_2184 var5 = var0[var4];
         var3[var4] = class_8938.method_41064(var5.method_10139());
      }

      return new class_9370(class_8938.field_45798, var3, class_7781.field_39439);
   }

   public static class_9370 method_43336(class_7781 var0) {
      class_8938[] var3 = new class_8938[0];
      return new class_9370(class_8938.field_45798, var3, var0);
   }

   public boolean method_43338(Collection<class_2792> var1, int var2) {
      if (this.field_47912.length > 0) {
         ArrayList var5 = Lists.newArrayList(var1);

         for (class_8938 var9 : this.field_47912) {
            boolean var10 = false;
            Iterator var11 = var5.iterator();

            while (var11.hasNext()) {
               class_2792 var12 = (class_2792)var11.next();
               if (var9.method_41071(var12)) {
                  var11.remove();
                  var10 = true;
                  break;
               }
            }

            if (!var10) {
               return false;
            }
         }
      }

      return this.field_47911.method_35307(var2);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("victims", class_8938.method_41072(this.field_47912, var1));
      var4.add("unique_entity_types", this.field_47911.method_27853());
      return var4;
   }
}
