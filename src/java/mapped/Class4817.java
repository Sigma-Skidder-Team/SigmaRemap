package mapped;

import com.google.gson.JsonElement;
import io.netty.buffer.ByteBuf;

public class Class4817 extends BruhMotha<JsonElement> {
   public Class4817() {
      super(JsonElement.class);
   }

   public JsonElement method14894(ByteBuf var1) throws Exception {
      boolean var4 = var1.readBoolean();
      return !var4 ? null : BruhMotha.field22538.method14894(var1);
   }

   public void method14895(ByteBuf var1, JsonElement var2) throws Exception {
      if (var2 != null) {
         var1.writeBoolean(true);
         BruhMotha.field22538.method14895(var1, var2);
      } else {
         var1.writeBoolean(false);
      }
   }
}
