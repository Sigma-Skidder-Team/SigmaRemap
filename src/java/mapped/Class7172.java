package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;

import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.JSONUtils;
import org.apache.commons.lang3.Validate;

public class Class7172 implements IMetadataSectionSerializer<Class7788> {
   public Class7788 deserialize(JsonObject var1) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = JSONUtils.getInt(var1, "frametime", 1);
      if (var5 != 1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var5, "Invalid default frame time");
      }

      if (var1.has("frames")) {
         try {
            JsonArray var6 = JSONUtils.method32785(var1, "frames");

            for (int var7 = 0; var7 < var6.size(); var7++) {
               JsonElement var8 = var6.get(var7);
               Class9704 var9 = this.method22520(var7, var8);
               if (var9 != null) {
                  var4.add(var9);
               }
            }
         } catch (ClassCastException var10) {
            throw new JsonParseException("Invalid animation->frames: expected array, was " + var1.get("frames"), var10);
         }
      }

      int var11 = JSONUtils.getInt(var1, "width", -1);
      int var12 = JSONUtils.getInt(var1, "height", -1);
      if (var11 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var11, "Invalid width");
      }

      if (var12 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var12, "Invalid height");
      }

      boolean var13 = JSONUtils.getBoolean(var1, "interpolate", false);
      return new Class7788(var4, var11, var12, var5, var13);
   }

   private Class9704 method22520(int var1, JsonElement var2) {
      if (!var2.isJsonPrimitive()) {
         if (!var2.isJsonObject()) {
            return null;
         } else {
            JsonObject var5 = JSONUtils.getJSONObject(var2, "frames[" + var1 + "]");
            int var6 = JSONUtils.getInt(var5, "time", -1);
            if (var5.has("time")) {
               Validate.inclusiveBetween(1L, 2147483647L, (long)var6, "Invalid frame time");
            }

            int var7 = JSONUtils.method32777(var5, "index");
            Validate.inclusiveBetween(0L, 2147483647L, (long)var7, "Invalid frame index");
            return new Class9704(var7, var6);
         }
      } else {
         return new Class9704(JSONUtils.method32776(var2, "frames[" + var1 + "]"));
      }
   }

   @Override
   public String getSectionName() {
      return "animation";
   }
}
