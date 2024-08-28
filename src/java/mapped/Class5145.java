package mapped;

import com.google.gson.JsonObject;
import java.util.List;

public class Class5145 extends Class5144 {
   private final Class5141 field23369;

   public Class5145(Class5141 var1, List<Class5138> var2) {
      super(var2);
      this.field23369 = var1;
   }

   @Override
   public void method15929(Class9348<?, ?> var1) {
      this.field23369.method15918(var1);
   }

   @Override
   public void method15930(JsonObject var1) {
      var1.add("when", this.field23369.get());
   }
}
