package mapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

public class Class4827 implements Class4826 {
   private final ItemStack field22599;

   public Class4827(ItemStack var1) {
      this.field22599 = var1;
   }

   @Override
   public Collection<ItemStack> method14917() {
      return Collections.<ItemStack>singleton(this.field22599);
   }

   @Override
   public JsonObject method14918() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", Registry.field16075.method9181(this.field22599.method32107()).toString());
      return var3;
   }
}
