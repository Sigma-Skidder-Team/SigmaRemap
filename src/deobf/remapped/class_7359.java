package remapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class class_7359 implements class_4219 {
   public class_7359(class_2195 var1, String var2) {
      this.field_37616 = var1;
      this.field_37617 = var2;
   }

   @Override
   public void method_19647(JsonObject var1) {
   }

   @Override
   public class_2994<?> method_19651() {
      return class_2195.method_10151(this.field_37616);
   }

   @Override
   public Identifier method_19650() {
      return new Identifier(this.field_37617);
   }

   @Nullable
   @Override
   public JsonObject method_19649() {
      return null;
   }

   @Override
   public Identifier method_19646() {
      return new Identifier("");
   }
}
