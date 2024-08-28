package mapped;

import com.google.gson.JsonObject;

public class Class7174 implements Class7170<Class9620> {
   public Class9620 method22519(JsonObject var1) {
      boolean var4 = JSONUtils.getBoolean(var1, "blur", false);
      boolean var5 = JSONUtils.getBoolean(var1, "clamp", false);
      return new Class9620(var4, var5);
   }

   @Override
   public String method22518() {
      return "texture";
   }
}
