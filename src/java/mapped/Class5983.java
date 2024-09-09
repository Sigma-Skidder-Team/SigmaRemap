package mapped;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class5983 extends Class5979 {
   private final Map<String, Class72> field26057 = new HashMap<String, Class72>();
   private Class72 field26058;

   public Class5983() {
      super("1.16", "1.16.2", true);
   }

   @Override
   public void method18524(JsonObject var1, JsonObject var2, JsonObject var3) {
      try {
         this.field26058 = Class8401.method29501(Class8159.method28368("dimension-registry-1.16.2.nbt"));
      } catch (IOException var11) {
         ViaVersion3.method27613().method27366().severe("Error loading dimension registry:");
         var11.printStackTrace();
      }

      for (Class61 var8 : (Class60)this.field26058.<Class72>method235("minecraft:dimension_type").method235("value")) {
         Class72 var9 = (Class72)var8;
         Class72 var10 = new Class72("", var9.<Class72>method235("element").method205());
         this.field26057.put(var9.<Class71>method235("name").method205(), var10);
      }
   }

   public Map<String, Class72> method18556() {
      return this.field26057;
   }

   public Class72 method18557() {
      return this.field26058;
   }
}
