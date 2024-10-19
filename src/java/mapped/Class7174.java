package mapped;

import com.google.gson.JsonObject;
import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.JSONUtils;

public class Class7174 implements IMetadataSectionSerializer<Class9620> {
   public Class9620 deserialize(JsonObject var1) {
      boolean var4 = JSONUtils.getBoolean(var1, "blur", false);
      boolean var5 = JSONUtils.getBoolean(var1, "clamp", false);
      return new Class9620(var4, var5);
   }

   @Override
   public String getSectionName() {
      return "texture";
   }
}
