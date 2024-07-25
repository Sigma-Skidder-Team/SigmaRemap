package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class class_5784 extends class_8273<class_5130> {
   private static final Identifier field_29209 = new Identifier("bee_nest_destroyed");

   @Override
   public Identifier method_3899() {
      return field_29209;
   }

   public class_5130 method_26174(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_6414 var6 = method_26172(var1);
      class_5319 var7 = class_5319.method_24267(var1.get("item"));
      class_7781 var8 = class_7781.method_35310(var1.get("num_bees_inside"));
      return new class_5130(var2, var6, var7, var8);
   }

   @Nullable
   private static class_6414 method_26172(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         Identifier var3 = new Identifier(class_6539.method_29796(var0, "block"));
         return class_8669.field_44462.method_39794(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method_26171(class_9359 var1, class_6414 var2, class_6098 var3, int var4) {
      this.method_38137(var1, var3x -> var3x.method_23530(var2, var3, var4));
   }
}
