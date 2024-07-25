package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class class_2319 extends class_8273<class_5972> {
   private static final Identifier field_11615 = new Identifier("placed_block");

   @Override
   public Identifier method_3899() {
      return field_11615;
   }

   public class_5972 method_10662(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_6414 var6 = method_10664(var1);
      class_1827 var7 = class_1827.method_8079(var1.get("state"));
      if (var6 != null) {
         var7.method_8075(var6.method_29306(), var1x -> {
            throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x + ":");
         });
      }

      class_5093 var8 = class_5093.method_23396(var1.get("location"));
      class_5319 var9 = class_5319.method_24267(var1.get("item"));
      return new class_5972(var2, var6, var7, var8, var9);
   }

   @Nullable
   private static class_6414 method_10664(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         Identifier var3 = new Identifier(class_6539.method_29796(var0, "block"));
         return class_8669.field_44462.method_39794(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method_10661(class_9359 var1, BlockPos var2, ItemStack var3) {
      class_2522 var6 = var1.method_43235().method_28262(var2);
      this.method_38137(var1, var4 -> var4.method_27271(var6, var2, var1.method_43235(), var3));
   }
}
