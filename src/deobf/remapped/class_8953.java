package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;

public class class_8953 implements class_211 {
   private final class_2307<class_2451> field_45886;

   private class_8953(class_2307<class_2451> var1) {
      this.field_45886 = var1;
   }

   @Override
   public Collection<class_6098> method_894() {
      ArrayList var3 = Lists.newArrayList();

      for (class_2451 var5 : this.field_45886.method_10608()) {
         var3.add(new class_6098(var5));
      }

      return var3;
   }

   @Override
   public JsonObject method_893() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("tag", class_8410.method_38721().method_29393().method_43147(this.field_45886).toString());
      return var3;
   }
}
