package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class class_4880 implements class_5100 {
   private String field_24276 = null;

   public class_4880(String var1) {
      this.field_24276 = var1;
   }

   public void 䎰綋쿨樽㮃埙(String var1, byte[] var2, Throwable var3) {
      if (var2 != null) {
         try {
            String var6 = new String(var2, "ASCII");
            JsonParser var7 = new JsonParser();
            JsonElement var8 = var7.parse(var6);
            class_1056 var9 = new class_1056(this.field_24276);
            class_2697 var10 = var9.method_4639(var8);
            if (var10 != null) {
               var10.method_12155(true);
               class_2614.method_11860(this.field_24276, var10);
            }
         } catch (Exception var11) {
            Config.method_14277("Error parsing configuration: " + var1 + ", " + var11.getClass().getName() + ": " + var11.getMessage());
         }
      }
   }
}
