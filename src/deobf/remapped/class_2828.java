package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class class_2828 implements JsonDeserializer<class_9846> {
   private static String[] field_13862;
   private final class_9695 field_13861;

   public class_2828(class_9695 var1) {
      this.field_13861 = var1;
   }

   public class_9846 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new class_9846(this.field_13861.method_44801(), this.method_12867(var3, var1.getAsJsonArray()));
   }

   private List<class_8023> method_12867(JsonDeserializationContext var1, JsonArray var2) {
      ArrayList var5 = Lists.newArrayList();

      for (JsonElement var7 : var2) {
         var5.add(var1.deserialize(var7, class_8023.class));
      }

      return var5;
   }
}
