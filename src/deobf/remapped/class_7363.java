package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class class_7363 extends class_8273<class_9150> {
   private static final class_4639 field_37626 = new class_4639("slide_down_block");

   @Override
   public class_4639 method_3899() {
      return field_37626;
   }

   public class_9150 method_33532(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_6414 var6 = method_33531(var1);
      class_1827 var7 = class_1827.method_8079(var1.get("state"));
      if (var6 != null) {
         var7.method_8075(var6.method_29306(), var1x -> {
            throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x);
         });
      }

      return new class_9150(var2, var6, var7);
   }

   @Nullable
   private static class_6414 method_33531(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         class_4639 var3 = new class_4639(class_6539.method_29796(var0, "block"));
         return class_8669.field_44462.method_39794(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method_33534(class_9359 var1, class_2522 var2) {
      this.method_38137(var1, var1x -> var1x.method_42114(var2));
   }
}
