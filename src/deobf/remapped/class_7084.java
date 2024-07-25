package remapped;

import com.google.gson.JsonElement;
import io.netty.buffer.ByteBuf;

public class class_7084 extends class_8039<JsonElement> {
   public class_7084() {
      super(JsonElement.class);
   }

   public JsonElement method_32595(ByteBuf var1) throws Exception {
      boolean var4 = var1.readBoolean();
      return !var4 ? null : class_8039.field_41143.method_9912(var1);
   }

   public void method_32594(ByteBuf var1, JsonElement var2) throws Exception {
      if (var2 != null) {
         var1.writeBoolean(true);
         class_8039.field_41143.method_33275(var1, var2);
      } else {
         var1.writeBoolean(false);
      }
   }
}
