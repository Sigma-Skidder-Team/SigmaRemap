package mapped;

import com.google.gson.JsonObject;
import net.minecraft.resources.data.IMetadataSectionSerializer;

public class Class7169 implements IMetadataSectionSerializer<Class7469> {
   public Class7469 deserialize(JsonObject var1) {
      return new Class7469(Class1984.method8271(JSONUtils.method32764(var1, "hat", "none")));
   }

   @Override
   public String getSectionName() {
      return "villager";
   }
}
