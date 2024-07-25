package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class_705<T extends class_3151> implements class_2994<T> {
   private final int field_3878;
   private final class_5977<T> field_3879;

   public class_705(class_5977<T> var1, int var2) {
      this.field_3878 = var2;
      this.field_3879 = var1;
   }

   public T method_3255(Identifier var1, JsonObject var2) {
      String var5 = class_6539.method_29797(var2, "group", "");
      Object var6 = !class_6539.method_29763(var2, "ingredient") ? class_6539.method_29783(var2, "ingredient") : class_6539.method_29787(var2, "ingredient");
      class_8137 var7 = class_8137.method_37024((JsonElement)var6);
      String var8 = class_6539.method_29796(var2, "result");
      Identifier var9 = new Identifier(var8);
      class_6098 var10 = new class_6098(
         class_8669.field_44382.method_39794(var9).orElseThrow(() -> new IllegalStateException("Item: " + var8 + " does not exist"))
      );
      float var11 = class_6539.method_29775(var2, "experience", 0.0F);
      int var12 = class_6539.method_29768(var2, "cookingtime", this.field_3878);
      return this.field_3879.method_27279(var1, var5, var7, var10, var11, var12);
   }

   public T method_3256(Identifier var1, class_8248 var2) {
      String var5 = var2.method_37784(32767);
      class_8137 var6 = class_8137.method_37026(var2);
      class_6098 var7 = var2.method_37755();
      float var8 = var2.readFloat();
      int var9 = var2.method_37778();
      return this.field_3879.method_27279(var1, var5, var6, var7, var8, var9);
   }

   public void method_3253(class_8248 var1, T var2) {
      var1.method_37760(var2.field_15674);
      var2.field_15675.method_37028(var1);
      var1.method_37764(var2.field_15669);
      var1.writeFloat(var2.field_15671);
      var1.method_37743(var2.field_15672);
   }
}
