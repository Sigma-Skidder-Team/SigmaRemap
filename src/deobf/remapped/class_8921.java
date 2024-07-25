package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class class_8921 implements class_5496 {
   private static String[] field_45736;
   private final class_3410 field_45737;
   private final List<class_5496> field_45735;

   private class_8921(class_3410 var1, List<class_5496> var2) {
      this.field_45737 = var1;
      this.field_45735 = var2;
   }

   @Override
   public void method_24963(class_8021<?, ?> var1) {
      this.field_45735.forEach(var1x -> var1x.method_24963(var1));
   }

   public JsonElement get() {
      JsonArray var3 = new JsonArray();
      this.field_45735.stream().map(Supplier::get).forEach(var3::add);
      JsonObject var4 = new JsonObject();
      var4.add(class_3410.method_15737(this.field_45737), var3);
      return var4;
   }
}
