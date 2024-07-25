package remapped;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_8841 extends class_6150 {
   private final Map<String, class_5531> field_45213 = new HashMap<String, class_5531>();
   private class_5531 field_45214;

   public class_8841() {
      super("1.16", "1.16.2", true);
   }

   @Override
   public void method_28216(JsonObject var1, JsonObject var2, JsonObject var3) {
      try {
         this.field_45214 = class_4483.method_20818(class_3792.method_17623("dimension-registry-1.16.2.nbt"));
      } catch (IOException var11) {
         class_3446.method_15886().method_34617().severe("Error loading dimension registry:");
         var11.printStackTrace();
      }

      for (class_5287 var8 : (class_913)this.field_45214.<class_5531>method_25123("minecraft:dimension_type").method_25123("value")) {
         class_5531 var9 = (class_5531)var8;
         class_5531 var10 = new class_5531("", var9.<class_5531>method_25123("element").method_25124());
         this.field_45213.put(var9.<class_887>method_25123("name").method_3809(), var10);
      }
   }

   public Map<String, class_5531> method_40674() {
      return this.field_45213;
   }

   public class_5531 method_40673() {
      return this.field_45214;
   }
}
