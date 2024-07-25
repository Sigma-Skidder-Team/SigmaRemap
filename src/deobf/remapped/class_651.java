package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_651 extends class_7789<class_9170> {
   public void method_2980(JsonObject var1, class_9170 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("name", class_9170.method_42265(var2).toString());
      if (class_9170.method_42266(var2) != 0L) {
         var1.addProperty("seed", class_9170.method_42266(var2));
      }
   }

   public class_9170 method_2981(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_4639 var6 = new class_4639(class_6539.method_29796(var1, "name"));
      long var7 = class_6539.method_29791(var1, "seed", 0L);
      return new class_9170(var3, var6, var7, null);
   }
}
