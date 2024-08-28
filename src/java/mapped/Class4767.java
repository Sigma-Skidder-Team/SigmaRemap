package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import io.netty.buffer.ByteBuf;

public class Class4767 extends Class4750<JsonElement> {
   private static final Class4790 field22578 = new Class4790(262144);

   public Class4767() {
      super(JsonElement.class);
   }

   public JsonElement method14894(ByteBuf var1) throws Exception {
      String var4 = field22578.method14894(var1);

      try {
         return Class9610.method37359().parse(var4);
      } catch (JsonSyntaxException var6) {
         Class8042.method27613().method27366().severe("Error when trying to parse json: " + var4);
         throw var6;
      }
   }

   public void method14895(ByteBuf var1, JsonElement var2) throws Exception {
      field22578.method14895(var1, var2.toString());
   }
}
