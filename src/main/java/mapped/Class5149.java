package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

import java.util.function.Supplier;

public class Class5149 implements Supplier<JsonElement> {
   private final ResourceLocation field23376;

   public Class5149(ResourceLocation var1) {
      this.field23376 = var1;
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("parent", this.field23376.toString());
      return var3;
   }
}
