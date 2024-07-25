package remapped;

import com.google.gson.JsonObject;

public final class class_7602 extends class_9078 {
   @Override
   public void method_41798(JsonObject var1, String var2) {
      super.method_41798(var1, var2);
      if (var2.startsWith("block.") && var2.endsWith(".name")) {
         var1.addProperty("translate", var2.substring(0, var2.length() - 5));
      }
   }
}
