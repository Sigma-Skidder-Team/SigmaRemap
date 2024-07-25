package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public class class_8141 implements class_6146<class_4016> {
   public class_4016 method_37045(JsonObject var1) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = class_6539.method_29768(var1, "frametime", 1);
      if (var5 != 1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var5, "Invalid default frame time");
      }

      if (var1.has("frames")) {
         try {
            JsonArray var6 = class_6539.method_29787(var1, "frames");

            for (int var7 = 0; var7 < var6.size(); var7++) {
               JsonElement var8 = var6.get(var7);
               class_9417 var9 = this.method_37043(var7, var8);
               if (var9 != null) {
                  var4.add(var9);
               }
            }
         } catch (ClassCastException var10) {
            throw new JsonParseException("Invalid animation->frames: expected array, was " + var1.get("frames"), var10);
         }
      }

      int var11 = class_6539.method_29768(var1, "width", -1);
      int var12 = class_6539.method_29768(var1, "height", -1);
      if (var11 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var11, "Invalid width");
      }

      if (var12 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var12, "Invalid height");
      }

      boolean var13 = class_6539.method_29772(var1, "interpolate", false);
      return new class_4016(var4, var11, var12, var5, var13);
   }

   private class_9417 method_37043(int var1, JsonElement var2) {
      if (!var2.isJsonPrimitive()) {
         if (!var2.isJsonObject()) {
            return null;
         } else {
            JsonObject var5 = class_6539.method_29782(var2, "frames[" + var1 + "]");
            int var6 = class_6539.method_29768(var5, "time", -1);
            if (var5.has("time")) {
               Validate.inclusiveBetween(1L, 2147483647L, (long)var6, "Invalid frame time");
            }

            int var7 = class_6539.method_29767(var5, "index");
            Validate.inclusiveBetween(0L, 2147483647L, (long)var7, "Invalid frame index");
            return new class_9417(var7, var6);
         }
      } else {
         return new class_9417(class_6539.method_29766(var2, "frames[" + var1 + "]"));
      }
   }

   @Override
   public String method_28196() {
      return "animation";
   }
}
