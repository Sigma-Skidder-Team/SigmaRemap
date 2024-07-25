package remapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface class_4219 {
   void method_19647(JsonObject var1);

   default JsonObject method_19648() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("type", class_8669.field_44414.method_39797(this.method_19651()).toString());
      this.method_19647(var3);
      return var3;
   }

   Identifier method_19650();

   class_2994<?> method_19651();

   @Nullable
   JsonObject method_19649();

   @Nullable
   Identifier method_19646();
}
