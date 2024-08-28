package mapped;

import com.google.gson.JsonObject;

public class Class5982 extends Class5979 {
   public Class5982() {
      super("1.14", "1.15", true);
   }

   @Override
   public Class7112 method18539(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      return var4.equals("sounds") ? new Class7112(var1.getAsJsonArray(var4), var2.getAsJsonArray(var4), false) : super.method18539(var1, var2, var3, var4);
   }
}
