package mapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.JSONUtils;

import java.util.HashSet;
import java.util.Map.Entry;

public class Class7171 implements IMetadataSectionSerializer<Class9168> {
   public Class9168 deserialize(JsonObject var1) {
      HashSet var4 = Sets.newHashSet();

      for (Entry var6 : var1.entrySet()) {
         String var7 = (String)var6.getKey();
         if (var7.length() > 16) {
            throw new JsonParseException("Invalid language->'" + var7 + "': language code must not be more than " + 16 + " characters long");
         }

         JsonObject var8 = JSONUtils.getJSONObject((JsonElement)var6.getValue(), "language");
         String var9 = JSONUtils.getString(var8, "region");
         String var10 = JSONUtils.getString(var8, "name");
         boolean var11 = JSONUtils.getBoolean(var8, "bidirectional", false);
         if (var9.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var7 + "'->region: empty value");
         }

         if (var10.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var7 + "'->name: empty value");
         }

         if (!var4.add(new Class2019(var7, var9, var10, var11))) {
            throw new JsonParseException("Duplicate language->'" + var7 + "' defined");
         }
      }

      return new Class9168(var4);
   }

   @Override
   public String getSectionName() {
      return "language";
   }
}
