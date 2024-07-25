package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class class_2809 extends class_8273<class_1434> {
   private static final Identifier field_13786 = new Identifier("brewed_potion");

   @Override
   public Identifier method_3899() {
      return field_13786;
   }

   public class_1434 method_12764(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_6004 var6 = null;
      if (var1.has("potion")) {
         Identifier var7 = new Identifier(class_6539.method_29796(var1, "potion"));
         var6 = class_8669.field_44365.method_39794(var7).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var7 + "'"));
      }

      return new class_1434(var2, var6);
   }

   public void method_12763(class_9359 var1, class_6004 var2) {
      this.method_38137(var1, var1x -> var1x.method_6584(var2));
   }
}
