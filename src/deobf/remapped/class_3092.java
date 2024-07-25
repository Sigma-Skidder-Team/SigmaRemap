package remapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

public class class_3092 implements class_211 {
   private final class_6098 field_15394;

   private class_3092(class_6098 var1) {
      this.field_15394 = var1;
   }

   @Override
   public Collection<class_6098> method_894() {
      return Collections.<class_6098>singleton(this.field_15394);
   }

   @Override
   public JsonObject method_893() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", class_8669.field_44382.method_39797(this.field_15394.method_27960()).toString());
      return var3;
   }
}
