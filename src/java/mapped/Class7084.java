package mapped;

import com.google.gson.JsonObject;

public final class Class7084 extends Class7080 {
   @Override
   public void method22000(JsonObject var1, String var2) {
      super.method22000(var1, var2);
      if (var2.startsWith("block.") && var2.endsWith(".name")) {
         var1.addProperty("translate", var2.substring(0, var2.length() - 5));
      }
   }
}
