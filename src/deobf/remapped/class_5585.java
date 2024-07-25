package remapped;

import com.google.gson.JsonObject;
import java.util.List;

public class class_5585 extends class_5980 {
   private final class_5496 field_28362;

   private class_5585(class_5496 var1, List<class_265> var2) {
      super(var2, null);
      this.field_28362 = var1;
   }

   @Override
   public void method_27286(class_8021<?, ?> var1) {
      this.field_28362.method_24963(var1);
   }

   @Override
   public void method_27287(JsonObject var1) {
      var1.add("when", this.field_28362.get());
   }
}
