package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import io.netty.buffer.ByteBuf;

public class class_9265 extends class_8039<JsonElement> {
   private static final class_7378 field_47282 = new class_7378(262144);

   public class_9265() {
      super(JsonElement.class);
   }

   public JsonElement method_42712(ByteBuf var1) throws Exception {
      String var4 = field_47282.method_33600(var1);

      try {
         return class_9012.method_41352().parse(var4);
      } catch (JsonSyntaxException var6) {
         class_3446.method_15886().method_34617().severe("Error when trying to parse json: " + var4);
         throw var6;
      }
   }

   public void method_42711(ByteBuf var1, JsonElement var2) throws Exception {
      field_47282.method_33599(var1, var2.toString());
   }
}
