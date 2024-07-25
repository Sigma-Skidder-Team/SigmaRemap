package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_5887 extends class_7789<class_2649> {
   public void method_26935(JsonObject var1, class_2649 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("replace", class_2649.method_11963(var2));
      JsonArray var6 = new JsonArray();

      for (ITextComponent var8 : class_2649.method_11961(var2)) {
         var6.add(ITextComponent$class_40.toJsonTree(var8));
      }

      var1.add("lore", var6);
      if (class_2649.method_11962(var2) != null) {
         var1.add("entity", var3.serialize(class_2649.method_11962(var2)));
      }
   }

   public class_2649 method_26936(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      boolean var6 = class_6539.method_29772(var1, "replace", false);
      List var7 = Streams.stream(class_6539.method_29787(var1, "lore"))
         .<IFormattableTextComponent>map(ITextComponent$class_40::func_240641_a_)
         .collect(ImmutableList.toImmutableList());
      class_5848 var8 = class_6539.<class_5848>method_29779(var1, "entity", (class_5848)null, var2, class_5848.class);
      return new class_2649(var3, var6, var7, var8);
   }
}
