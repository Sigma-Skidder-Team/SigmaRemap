package remapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

public class class_3092 implements class_211 {
   private final ItemStack field_15394;

   private class_3092(ItemStack var1) {
      this.field_15394 = var1;
   }

   @Override
   public Collection<ItemStack> method_894() {
      return Collections.<ItemStack>singleton(this.field_15394);
   }

   @Override
   public JsonObject method_893() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", class_8669.field_44382.method_39797(this.field_15394.method_27960()).toString());
      return var3;
   }
}
