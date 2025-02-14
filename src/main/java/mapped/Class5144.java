package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.state.StateContainer;

import java.util.List;
import java.util.function.Supplier;

public class Class5144 implements Supplier<JsonElement> {
   private final List<Class5138> field23368;

   public Class5144(List<Class5138> var1) {
      this.field23368 = var1;
   }

   public void method15929(StateContainer<?, ?> var1) {
   }

   public void method15930(JsonObject var1) {
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      this.method15930(var3);
      var3.add("apply", Class5138.method15914(this.field23368));
      return var3;
   }
}
