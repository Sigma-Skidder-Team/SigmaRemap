package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_1349 extends class_7789<class_8058> {
   public void method_6235(JsonObject var1, class_8058 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      if (class_8058.method_36560(var2) != null) {
         var1.add("name", ITextComponent$class_40.toJsonTree(class_8058.method_36560(var2)));
      }

      if (class_8058.method_36561(var2) != null) {
         var1.add("entity", var3.serialize(class_8058.method_36561(var2)));
      }
   }

   public class_8058 method_6236(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      IFormattableTextComponent var6 = ITextComponent$class_40.func_240641_a_(var1.get("name"));
      class_5848 var7 = class_6539.<class_5848>method_29779(var1, "entity", (class_5848)null, var2, class_5848.class);
      return new class_8058(var3, var6, var7, null);
   }
}
